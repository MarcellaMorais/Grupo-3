package exercicios;

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        //a=10 ; i=10 ; i < 3 ; a=a+i ; i++

        Scanner entrada = new Scanner(System.in);
        int a,i;

        a=10;
        i=0;

        while (i < 3) {
            a = a + i;
            i++;
            System.out.println(a);
        }
    entrada.close();
}
}