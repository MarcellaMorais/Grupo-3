package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario1, aumento, salario2;

     
        System.out.println("Informe o salario: ");
        salario1=entrada.nextDouble();

        
        aumento= (salario1*0.25);
        salario2=salario1+aumento;

        System.out.println("O novo salário é: " + salario2);
        entrada.close();



    }
    
}