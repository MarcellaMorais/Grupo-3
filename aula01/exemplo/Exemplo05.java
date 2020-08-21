package exemplo;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;

        valor = entrada.nextInt();

        System.out.println("Você digitou" + valor);

        entrada.close(); 

    }
    
}