package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        //área = (altura*base)/2

        Scanner entrada = new Scanner(System.in);
        double base, altura, area;

        System.out.println("Informe a base: ");
        base=entrada.nextDouble();

        System.out.println("Informe a altura: ");
        altura=entrada.nextDouble();

        area=((altura*base)/2);
        System.out.println("A area é: " + area);

        entrada.close();



    }
    
}