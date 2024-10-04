package ejercicios;


import java.util.Scanner;

public class Formulario_de_registro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("Formulario");

        System.out.println("**********");

        System.out.println("Ingrese ID");
        int id = sc.nextInt();

        System.out.println("Ingrese el nombre");
        String Nombre = sc.nextLine();


        System.out.println("Ingrese Apellido");
        String Apellido = sc.nextLine();

        System.out.println("Ingrese Genero");
        String Genero = sc.nextLine();

        System.out.println("Ingrese Edad");
        int edad = sc.nextInt();

        System.out.println("Ingrese Telefono");
        int telefono = sc.nextInt();

        System.out.println("Ingrese estatura");
        float estatura = sc.nextFloat();

        System.out.println("Ingrese correo");
        String email = sc.nextLine();

        System.out.println("Ingrese Contraseña");
        int contraseña = sc.nextInt();

        System.out.println("Ingrese estado");
        String estado = sc.nextLine();

        System.out.println("*********");
        System.out.println("TU INFORMACIÓN");
        System.out.println("**********");
        System.out.println("");

        System.out.println(
                "ID :"+id+
                        "Nombre :"+Nombre+"\n"+
                        "Apellido :"+Apellido+"\n"+
                        "Genero :"+Genero+"\n"+
                        "Edad :"+edad+"\n"+
                        "Telefono :"+telefono+"\n"+
                        "Estatura :"+estatura+"\n"+
                        "Correo :"+email+"\n"+
                        "Contraseña :"+contraseña+"\n"+
                        "Estado :"+estado+"\n"


        );

    }



}





