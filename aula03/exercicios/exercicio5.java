package exercicios;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int limite, cont;

        System.out.print("Informe o limite:");
        limite = entrada.nextInt();

        cont = 1;
        while (cont <= limite) {
            System.out.print(cont + " ");
            cont *= 2; // isso é o mesmo que cont = cont * 2;
        }

        // solução usando 2 virgulas
        cont = 1;
        while (cont <= limite / 2) {
            System.out.print(cont + " ");
            cont *= 2; 
        }

        if(cont <= limite) {
            System.out.println(cont);
        }

  entrada.close();
    }
}