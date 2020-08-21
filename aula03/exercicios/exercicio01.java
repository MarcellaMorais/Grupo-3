package exercicios;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c, d;

        System.out.println("Digite o valor de a: ");
        a = entrada.nextInt();

        System.out.println("Digite o valor de b: ");
        b = entrada.nextInt();

        System.out.println("Digite o valor de c: ");
        c = entrada.nextInt();

        System.out.println("Digite o valor de d: ");
        d = entrada.nextInt();

        if (b > c && d > a && (c + d) > (a + b) && c >= 0 && d >= 0 && (a % 2 == 0)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

        entrada.close();
    }
}