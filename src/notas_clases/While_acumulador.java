package notas_clases;

public class While_acumulador {

    public static void main(String[] args) {

        int i =0;
        int suma=0;

        while (i < 10){
            suma+= i;
            i++;
            System.out.println(suma);
        }
    }
}
