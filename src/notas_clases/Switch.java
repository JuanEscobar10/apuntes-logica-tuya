package notas_clases;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Nombre = "";
        String Apellido = "";
        String Documento = "";
        String Email = "";
        double salario = sc.nextDouble();
        double salariominimo = 1300000;
        double auxilioTransporte = sc.nextDouble();

        System.out.println("Ingresa 1 para desplegar el menú");


        int init = sc.nextInt();




        while (init != 0) {

            System.out.println("selecciona:" + "\n" + "1. Para crear un usuario." +
                    "\n" + "2. Iniciar Sesión" + "\n" + "3. Calcular el salario" +
                    "\n" + "4. Validar su categoria de salario" + "\n" + "5. Ver datos de usuario" +
                    "\n" + "6. Salir");

            int opcion = sc.nextInt();



            switch (opcion) {
                case 1:
                    System.out.println("CREAR USUARIO");
                    break;
                case 2:
                    System.out.println("INICIO SESIÓN");
                    break;
                case 3:
                    System.out.println("CALCULO SALARIO");
                    break;
                case 4:
                    System.out.println("CATEGORIA SALARIO");
                    break;
                case 5:
                    System.out.println("DATOS USUARIO");
                    break;
                case 6:
                    System.out.println("SALIR");
                    init = 0;


            }
            if (opcion == 1) {
                System.out.println("Ingrese Nombre");
                Nombre = sc.next();

                System.out.println("Ingrese Apellido");
                Apellido = sc.next();

                System.out.println("Ingrese Documento");
                Documento = sc.next();

                System.out.println("Ingrese Email");
                Email = sc.next();

                System.out.println("INGRESO DE SESIÓN EXITOSO");


            }  if (opcion == 2) {

                System.out.println("ingrese Nombre de Usuario");
                String nombreUsuario = sc.next();

                System.out.println("Ingrese Contraseña (DOCUMENTO)");
                String contraseña = sc.next();

                if (nombreUsuario.equals(Nombre) && contraseña.equals(Documento)) {

                    System.out.println("Bienvenido " + Nombre + " Al sistema");

                } else {
                    System.out.println("Validar credenciales " + nombreUsuario + " No se encuentra en el sistema" + "\n" + "Buelve a intentarlo." +
                            " Sino tines cuenta digita la opción 1 y si ya tienes una cuenta, ingresa nuevamente en la opción 2");

                }
                if (opcion == 3) {

                    System.out.println("Ingrese Salario");
                    salario = sc.nextDouble();

                    System.out.println("Salario Minimo");
                    salariominimo = sc.nextDouble();


                    auxilioTransporte = sc.nextDouble();

                } if (salario < salariominimo){

                    double salariotota = salario + auxilioTransporte;

                    System.out.println(" Hola" + Nombre + " Su salario total es de:" + salario + "\n" +
                            "Menos auxilio de trasnporte" + auxilioTransporte + "\n" + " Su sueldo es de " +
                            salariotota);

                }else {

                    System.out.println("Su salario es " + salario + "Gana mas que un salario minimo, esto significa que" +
                            " no aplica para auccilio de trasnporte.");



                }

            }

        }

    }
}
