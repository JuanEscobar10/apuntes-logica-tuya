package notas_clases;

import java.util.Scanner;

public class Funcion_con_retorno_dos {

    static Scanner sc=new Scanner(System.in);
    static double salario;

    static double auxTansporte=160200;

    static double salarioNeto;

    static double descuentoSalud;
    static double slmv=1300000;
    static double descuentoPension;
    static final float DESCDESCUENTOSALUD = 0.04f;

    static final float PORCDESCUENTOPENSION = 0.04f;




    public static void main(String[] args) {
        System.out.println("ingrese salario");
        salario = sc.nextDouble();
        salarioNeto=calcularSalarioNeto(salario,PORCDESCUENTOPENSION,DESCDESCUENTOSALUD,auxTansporte);
        System.out.println("salario neto es:"+salarioNeto);

        //tuva va a pagar el salario de los nuevos developers, si el nivel del contrato es
        //junior su salario es de 2500000 y si es junior adavance es de 3100000
        //se requiere calcular los descuentos de salud y pension. si el salario es menor
        //a 2 slmv se le debe ´pagar aux de trasnporte , de lo contrario no se pagaria
        // cree una funcionalidad que permita calcular el pago de cada uno de los nuestros developers.
    }

    private static void calcularsalarioNeto(double salario, float porcdescuentopension, float descdescuentosalud, double auxTansporte) {
    }

    public static double calcularSalud(double salario, float porcSalud){

        return salario*porcSalud;


    }

    public static double calcularPension(double salario,float porcPension){

        return  salario*porcPension;


    }

    public static double calcularSalarioNeto(double salario,float porcPennsion, float porcSalud,double auxTansporte){

        if (salario<=2*slmv){



            return salario-calcularPension(salario,porcPennsion) - calcularSalud(salario,porcSalud)+auxTansporte;




        }else {
            return salario-calcularPension(salario,porcPennsion) - calcularSalud(salario,porcSalud);
        }

    }
}
