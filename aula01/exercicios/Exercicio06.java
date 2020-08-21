package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        // 1 quilowatt=1/500 do salario minimo
        // receber o valor do salario minimo
        // receber a quantidade de quilowatts
        // valor, em reais, de cada quilowatt
        // valor a ser pago por essa residencia
        // valor com desconto de 15%

        Scanner entrada = new Scanner(System.in);
        double salarioMinimo, quilowatt, valorquilowatt, conta, contadesc;

        System.out.println("Informe o salario minimo: ");
        salarioMinimo=entrada.nextDouble();

        System.out.println("Informe a quantidade de quilowatt consumida: ");
        quilowatt=entrada.nextDouble();

        valorquilowatt = (salarioMinimo/500);
        System.out.println("O valor do quilowatt é: " + valorquilowatt);

        
        conta= (quilowatt*valorquilowatt);
        System.out.println("O valor da conta é: " + conta);

        contadesc= ((quilowatt*valorquilowatt)*0.85);
        System.out.println("O valor da conta com desconto é: " + contadesc);

        entrada.close();






    }

    
}