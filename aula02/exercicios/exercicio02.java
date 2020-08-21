package exercicios;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    double n1,n2,n3,media;

    n1= entrada.nextDouble();
    n2= entrada.nextDouble();
    n3= entrada.nextDouble();

    media=(((n1*2)+(n2*3)+(n3*5))/10);

    //%.1f\n = significa uma casa decimal

    System.out.printf("MEDIA = %.1f\n" , + media);
    entrada.close();

    }
    
}