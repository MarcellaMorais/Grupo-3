package exercicios;

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, soma, positivos;
        double media;
        final int QTDE = 10;

        soma = 0;
        positivos=0;

        for (int i = 0; i < 10; i++) { //i é uma variavel qualquer que utilizei
            System.out.println("Digite o proximo numero:");
            numero = entrada.nextInt();
            soma = soma + numero;
            if( numero >= 0){ //se for positivo
                positivos++; //soma 1 no contador de positivos
            }
        }

        media = (double)soma / 10; //utilizei double aqui na soma, pois pode ser que nao seja um numero inteiro

        System.out.println("Soma=" + soma);
        System.out.println("A media dos valores é "+ media);
        System.out.println("Foram digitados " + positivos + "numeros positivos");
        System.out.println("Temos "+ ((double)positivos/QTDE)*100 + "% de numeros positivos");

        entrada.close();

    }

}