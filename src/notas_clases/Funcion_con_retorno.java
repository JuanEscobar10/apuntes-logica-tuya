package notas_clases;

import java.util.Scanner;

public class Funcion_con_retorno {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String [] prendas = new String[5];
        String [] preferencias = new String[5];




        //guardarprendas(prendas);
        //listaPrendas(prendas);
        //guardarpreferencias(preferencias);
        //listaPreferencias(preferencias);
        //generarMatriz(prendas, preferencias);
        menu(prendas, preferencias);



    }


    public static void guardarprendas(String[] prendas) {


        int numPrenda = 0;

        while (numPrenda < prendas.length) {
            System.out.println("Ingrese la prenda " + ( numPrenda + 1));
            prendas[numPrenda] = sc.nextLine();
            numPrenda++;
        }

    }
    public static void listaPrendas(String[] prendas){
        for (int i = 0; i< prendas.length;i++){
            System.out.println(prendas[i]);
        }
    }
    public  static void guardarpreferencias (String [] preferencias){
        for (int i = 0; i< preferencias.length; i++){
            System.out.println("Ingrese la prefrencia " + (i+1));
            preferencias[i] = sc.nextLine();
        }


    }

    public static  void listaPreferencias(String [] preferencias){

        //Esto es un foreach

        for (String item: preferencias){

            System.out.println(item);
        }
    }

    public static void generarMatriz(String[] prendas, String[] preferencias ){
        for (int i = 0; i< preferencias.length; i++){
            System.out.println(prendas[i] + ": " + preferencias[i] );
        }
    }

    public static void menu(String[]prendas, String[] preferencias){

        System.out.println("Oprima 1 para comenzar");

        int init = sc.nextInt();
        sc.nextLine();

        while (init != 0){

            System.out.println("Seleccione 1. Guardar prendas 2. Guardar preferencias 3. Listar prendas 4. Listar preferencias 5. generar consolidado");
            int opc = sc.nextInt();

            switch (opc){
                case 1:
                    System.out.println("GUARDAR PRENDAS");
                    guardarprendas(prendas);
                    break;
                case 2:
                    System.out.println("GUARDAR PREFERENCIAS");
                    guardarpreferencias(preferencias);
                    break;
                case 3:
                    System.out.println("LISTAR PRENDAS");
                    listaPrendas(prendas);
                    break;
                case 4:
                    System.out.println("LISTAR PREFERENCIAS");
                    listaPreferencias(preferencias);
                    break;
                case 5:
                    System.out.println("CONSOLIDADO");
                    generarMatriz(prendas, preferencias);
                    break;
                case 6:
                    System.out.println("SALIR");
                    init = 0;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");


            }
        }}










}
