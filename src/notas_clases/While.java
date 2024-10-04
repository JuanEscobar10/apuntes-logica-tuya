package notas_clases;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);

        //Contador del 1 al cien en dos en dos y mostrar cual es par y cual no

        int i = 0;

        while (i<=100){
            if (i % 2 == 0){
                System.out.println(i + " :es par");
            }else{
                System.out.println(i +" :es impar");
            }
            i++;
        }












    }}

