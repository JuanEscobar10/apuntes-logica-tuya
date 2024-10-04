package notas_clases;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //Operadores Aritmeticos (+,-,*,/,%,)

        int data = (100/4) * 25 + (4*2);

        //Operadores de comparaxción (<,>,==,<=,>=)
        int clave = 1234;
        int claveUser = 1234;

        if (clave == claveUser){
            System.out.println("tiene acceso");
        }

        //--------------------
        float estatura = 1.76f;
        float estaturaIngresada = 1.80f;

        if (estatura > estaturaIngresada){
            System.out.println("cobrar 5000");
        }else {
            System.out.println("No paga nada");
        }

        //Operadores Logicos

        float estatura1 = 1.50f;
        float estaturaIngresad = 1.60f;
        int edad = 18;
        int edadIngresada = 19;

        if (estaturaIngresad > estatura1 && edadIngresada >= edad){
            System.out.println("Bienvenido");
        }else{
            System.out.println("Acceso Prohibido");
        }

        System.out.println("Ingrese un número");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println(num1 + " + " + num2 + "\n" + " = " + suma);
    }
}
