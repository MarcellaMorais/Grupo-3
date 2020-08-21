package exercicios;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, cont=0, result;
      
        System.out.print("Digite um numero inteiro: ");
        num = entrada.nextInt();

        while (cont < 11) {
            result = num *cont;
            System.out.println(num + " X " + cont + " - " + result);
            cont++;
        }
        entrada.close();


    }
    
}