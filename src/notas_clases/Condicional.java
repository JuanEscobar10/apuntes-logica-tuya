package notas_clases;

import java.util.Scanner;

public class Condicional {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        //if es una estructura condicional, valida que se cumple una condición y ejecuta si es true
        //dependiendo de si es compuesto, entonces genera una respuesta en caso que sea falso

        double balance = 170000;

        System.out.println("Ingrese el valor de la compra");
        double purchase = sc.nextDouble();

        System.out.println("Ingrese Número de cuotas");
        int cuotas = sc.nextInt();

        int total = (int) (purchase / cuotas);






        if (purchase > 0 && purchase <= balance){
            System.out.println("Compra exitosa");
            balance -= purchase;
            System.out.println("Su saldo es " + balance);
            System.out.println("Tus cuotas son de: " + total);



        }else if (purchase <= 0) {
            System.out.println("Por favor revisar saldo");
        }else {
            System.out.println("Que pena saldo Insuficiente");
        }
    }
}
