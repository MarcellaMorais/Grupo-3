package exercicios;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma=0, qtde, num, pares = 0, impares = 0;

        System.out.println("Quantos numeros serao digitados? ");
        qtde = entrada.nextInt();

        for (int i = 0; i < qtde; i++) {
            System.out.println("Informe o numero:");
            num = entrada.nextInt();
            if (num >= 0) {
                if (num % 2 == 0) {
                    pares++;
                    soma = soma + num;
                } else {
                    impares++;
                }
            }
            System.out.println("A media dos pares é " + ((double) soma / pares));
            System.out.println("Temos " + (double) impares / qtde * 100 + "% de impares");

        }

        entrada.close();
    }
}