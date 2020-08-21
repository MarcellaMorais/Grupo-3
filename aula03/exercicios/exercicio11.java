package exercicios;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor, soma = 0;

        valor = 1;
        while (valor != 0) {
            System.out.println("Digite um valor ( 0 = fim ):");
            valor = in.nextInt();

            if (valor>0) {
                soma = soma+ valor;
            }    
            
        }

        System.out.println("Soma = " + soma);

        in.close();

    }
    
}