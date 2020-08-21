package exercicios;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2, n3, menor;

        System.out.println("Digite o numero 1:");
        n1 = entrada.nextInt();

        System.out.println("Digite o numero 2:");
        n2 = entrada.nextInt();

        System.out.println("Digite o numero 3:");
        n3 = entrada.nextInt();

       menor =  encontraMenor(n1, n2, n3);

        // descobrir qual é o menor entre eles

        if (n1 <= n2 && n1 <= 3) {
            menor = n1;
        } else {
            if (n2 <= n1 && n2 <= n3) {
                menor = n2;
            } else {
                if (n3 <= n1 && n3 <= n2) {
                    menor = n3;
                }
            }

            System.out.println("O menor valor é " + menor);
        }
            entrada.close();

        }

        public static int encontraMenor(int a, int b, int c){
            int menor;

            if(a <= b && a <= c){
                menor =a;
            }else{
                if(b <= a && b <= c){
                    menor=b;
                }else{
                    menor = c;
                }
            }

            return menor;
    
    }

}