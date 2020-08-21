package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        //ler o salario
        Scanner entrada = new Scanner(System.in);
        double salario, novoSalario;

        System.out.println("Digite o salario:");
        salario = entrada.nextDouble();

        //aumento de 25%
        novoSalario=salario + salario*0.25;

        //novo salario
        System.out.println("Novo salário: " + novoSalario);

        entrada.close();


    }
    
}