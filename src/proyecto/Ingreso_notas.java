package proyecto;

import java.util.Scanner;

public class Ingreso_notas {

    //Arrays para almacenar los nombres y las notas
    static String[] Nombres = new String[50];
    static Double[][] Notas = new Double[50][3]; // son 3 notas por estudinate
    static Double[] Promedios = new Double[50];
    static int contadorEstudiantes = 0; // Contador estudiantes

    // Variables para almacenar las credenciales de usuario
    static String usuarioRegistrado;
    static String contraseñaRegistrada;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        // Llamamos a la función de inicio de sesión
        if (menuInicioSesion()) {
            // Usamos un ciclo while para que las opciones se repitan
            while (continuar) {
                System.out.println("\n" + "Opciones:");
                System.out.println("1. Ingresar Estudiantes");
                System.out.println("2. Ingresar Notas");
                System.out.println("3. Consultar Estudiantes");
                System.out.println("4. Salir");

                int opcion = sc.nextInt();

                // Usamos un switch para las diferentes opciones del menú
                switch (opcion) {
                    case 1:
                        ingresarEstudiantes();
                        break;
                    case 2:
                        ingresarNotas();
                        break;
                    case 3:
                        consultarEstudiantes();
                        break;
                    case 4:
                        continuar = false;
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            }
        } else {
            System.out.println("Acceso no autorizado.");
        }

    }




    // Función que muestra el menú de inicio de sesión o registro
    public static boolean menuInicioSesion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Iniciar sesión");
        System.out.println("2. Registrarse");
        int opcion = sc.nextInt();


        if (opcion == 1) {
            return inicioSesion();
        } else if (opcion == 2) {
            registrarCuenta();
            return inicioSesion();
        } else {
            System.out.println("Opción no válida.");
            return false;
        }
    }

    // Función para el inicio de sesión
    public static boolean inicioSesion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese usuario:");
        String usuario = scanner.nextLine();
        System.out.println("Ingrese contraseña:");
        String contraseña = scanner.nextLine();

        if (usuario.equals(usuarioRegistrado) && contraseña.equals(contraseñaRegistrada)) {
            System.out.println("Inicio de sesión exitoso.");
            return true;
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
            return false;
        }
    }

    // Función para registrar una nueva cuenta
    public static void registrarCuenta() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nuevo usuario:");
        usuarioRegistrado = scanner.nextLine();
        System.out.println("Ingrese nueva contraseña:");
        contraseñaRegistrada = scanner.nextLine();

        System.out.println("Registro exitoso. Por favor, inicie sesión.");
    }

    // Función para ingresar estudiantes
    public static void ingresarEstudiantes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántos estudiantes desea ingresar?");
        int cantidad = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ":");
            Nombres[contadorEstudiantes] = scanner.nextLine();
            contadorEstudiantes++;
        }
    }

    // Función para ingresar notas y calcular el promedio
    public static void ingresarNotas() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < contadorEstudiantes; i++) {
            double sumaNotas = 0;
            System.out.println("Ingrese las notas para " + Nombres[i] + ":");
            for (int j = 0; j < 3; j++) { // Suponemos que son 3 notas por estudiante
                System.out.println("Nota " + (j + 1) + ":");
                Notas[i][j] = scanner.nextDouble();
                sumaNotas += Notas[i][j];
            }
            // Calculamos el promedio
            Promedios[i] = sumaNotas / 3;
        }
    }


    // Función para consultar estudiantes, sus notas y el promedio
    public static void consultarEstudiantes() {
        System.out.println("Lista de estudiantes, sus notas y promedios:");
        for (int i = 0; i < contadorEstudiantes; i++) {
            System.out.print(Nombres[i] + " - Notas: ");
            for (int j = 0; j < 3; j++) {
                System.out.print(Notas[i][j] + " ");
            }
            System.out.println("- Promedio: " + Promedios[i]);
        }
    }

}


