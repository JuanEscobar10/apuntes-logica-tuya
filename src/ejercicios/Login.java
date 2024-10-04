package ejercicios;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Usuario = "juanescobar@gmail.com";
        int Key = 1234;
        String namberUser = "Juan";

        //Intereces
        System.out.println("Ingrese su  nombre de Usuario");
        String userInput = sc.next();

        System.out.println("Ingrese su password");
        int keyInput = sc.nextInt();

        if (Usuario.equals(userInput) && Key == keyInput){
            System.out.println("Bienvenido " + namberUser );
        }else {
            System.out.println("Valide Credenciales");
        }
    }
}
