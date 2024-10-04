package notas_clases;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        int [][] edades = new int[2][5]; //se nombra

        int [][] edades1 = {{23,14,45,53,17},{16,34,57,89,12}}; // se inicializa


        for (int i =0; i<edades1.length; i++){
            for (int j = 0; j< edades1[i].length; j++){

                System.out.print(edades1[i][j] + " " );
            }
            System.out.println("\n");
        }

    }
}
