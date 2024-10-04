package ejercicios;

import java.util.Scanner;


public class Menu_navegacion {

    static int init;
    static String nombreUsuario;
    static String nombre;
    static String contraseñaUsuario;
    static String contraseña;
    static String correo;
    static int opcion;
    static float salarioMinimo =1300000;
    static float salarioPersona;
    static float auxilioTransporte = 162000;
    static float salarioTotal;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el número uno para ingresar");

        init = sc.nextInt();

        while (true){

            System.out.println("selecciona:" + "\n" + "1. Para crear un usuario." +
                    "\n" + "2. Iniciar Sesión" + "\n" + "3. Calcular el salario" +
                    "\n" + "4. Validar su categoria de salario" + "\n" + "5. Ver datos de usuario" +
                    "\n" + "6. Salir");
            opcion = sc.nextInt();

            switch (opcion){

                case 1:
                    System.out.println("Crear usuario");
                    break;
                case 2:
                    System.out.println("Inico de sesión");
                    break;
                case 3:
                    System.out.println("Calculo Salario");
                    break;
                case 4:
                    System.out.println("Categoria salario");
                    break;
                case 5:
                    System.out.println("Datos del usuario");
                    break;
                case 6:
                    System.out.println("Salir");
                    break;


            }

            if (opcion == 1){

                System.out.println("Ingrese nombre de usuario");
                nombreUsuario = sc.next();

                System.out.println("Ingrese contraseña");
                contraseñaUsuario = sc.next();

                System.out.println("Ingrese correo");
                correo = sc.next();

                System.out.println("------ Usuario creado satisfactoria mente------");

            }
            if (opcion ==2){

                System.out.println("Ingrese nombre de usuario");
                nombre = sc.next();

                System.out.println("Ingrese contraseña");
                contraseña = sc.next();

                if (nombreUsuario.equals(nombre) && contraseñaUsuario.equals(contraseña)){

                    System.out.println("Bienvenido " + nombreUsuario + " al sistema");

                } else{
                    System.out.println("Valide credenciales");
                }


            }
            if (opcion == 3){

                System.out.println("Ingrese salario persona");
                salarioPersona = sc.nextFloat();

                if (salarioPersona < salarioMinimo) {

                    salarioTotal = salarioPersona + auxilioTransporte;

                    System.out.println( nombreUsuario + " su salario total es " + salarioPersona + " y con el auxilio de trasnporte le queda en " + salarioTotal );

                }else{
                    salarioTotal = salarioPersona;

                    System.out.println( nombreUsuario + " su salrio total es " + salarioTotal);

                }


            }
            if (opcion == 4){

            }
            if (opcion ==5){

                System.out.println("LOS DATOS DEL USUARIO SON: " + "\n" +
                        "Nombre: " + nombreUsuario + "\n" +
                        "Salario total: " + salarioTotal + "\n" +
                        "Correo: " + correo);
            }












        }
    }
}
