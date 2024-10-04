package notas_clases;

import java.util.Scanner;

public class Array_tres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String [] nombres = new String[4];

        int i =0;
        while (i < nombres.length){

            System.out.println("Ingrese Nombre " + (i+1));

            nombres[i] = sc.nextLine();
            i++;
        }for (i=0; i < nombres.length;i++){
            System.out.println("el nombre es: " + nombres[i]);
        }




    }
}
