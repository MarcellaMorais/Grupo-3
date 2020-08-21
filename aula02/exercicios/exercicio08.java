package exercicios;

import java.util.Scanner;

public class exercicio08 {
    public static void main(final String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a,b,c;

        a=entrada.nextInt();
        b=entrada.nextInt();
        c=entrada.nextInt();

        //Se a > (b+c) - não forma triangulo
        if ((a > (b+c)) || (b > (a+c)) || (c > (a+b))) {
            System.out.println("Não formam triângulo");
        } else {
            // Todos os lados iguais
            if ((a==b) && (b==c)) {
                System.out.println("Formam triangulo equilatero");
        } else {
            //se 2 lados iguais - isosceles
            if (a==b || b==c || a==c) {
            System.out.println("Formam um triangulo isósceles");
        } else {
            //nenhum lado igual - escaleno
            System.out.println("Nenhum lado igual formam escaleno");
        }
    }
}
        entrada.close();
    }
}