package exercicios;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int numero;

    System.out.println("Digite um numero: ");
    numero=entrada.nextInt();
    tipo(numero);    

    entrada.close();

}
    public static void tipo(int numero){
        if(numero %2==0){
            System.out.println("é par");
        }else {
            System.out.println("é impar");
        }
    }

    }
