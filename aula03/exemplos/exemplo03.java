package exemplos;

import java.util.Scanner;

public class exemplo03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String resposta;
        int num, soma;
        char continua = 's';

        while ( continua == 's' || continua == 'S') {
            

            System.out.println("Deseja continuar? (s/n) ");
            resposta = entrada.nextLine();
            //pega o primeiro caracter da string digitada
            continua = resposta.charAt(0);
        }

        entrada.close();
    }
    
}