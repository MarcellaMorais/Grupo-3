package exercicios;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, prestacao;

        salario = entrada.nextDouble();
        prestacao = entrada.nextDouble();

        if (prestacao < (salario * 0.3)) {
            System.out.println("Emprestimo concedido");
        } else {
            System.out.println("Eprestimo não concedido");
        }

        entrada.close();
    }
}