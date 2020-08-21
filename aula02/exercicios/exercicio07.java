package exercicios;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario,desconto;

        salario=entrada.nextDouble();

        if (salario <= 600) {
            System.out.println("Isento");
        } else {
            if (salario <= 2000) {
                desconto = salario*0.25;
                System.out.println("Desconto de 25% " + desconto);
         

            }       
            entrada.close();
        }

    }
    
}