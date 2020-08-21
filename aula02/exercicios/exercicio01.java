package exercicios;

import java.util.Scanner;

/**
 * exercicio01
 */
public class exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1,n2,soma;
        
        //System.out.println("Informe valor n1: ");
        n1=entrada.nextDouble();

        //System.out.println("Informe valor n2: ");
        n2=entrada.nextDouble();

        soma=n1+n2;
        System.out.println("SOMA = " + soma);

        entrada.close();
       


    }
}