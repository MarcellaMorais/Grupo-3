package exercicios;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1,n2;

        n1=entrada.nextDouble();
        n2=entrada.nextDouble();

        if (n1>n2) {
            System.out.println("Ordem não numerica \n" + n1 + " , " + n2);
            //System.out.println(n2);
        }
        else {
            System.out.println("Ordem não numerica \n" + n2);
            System.out.println(n1);
        }
        entrada.close();
    }
    
}