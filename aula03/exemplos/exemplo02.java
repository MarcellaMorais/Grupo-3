package exemplos;

import java.util.Scanner;

public class exemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont; // conta quantas notas serão digitadas
        double nota, soma, media;
        final int QTDDENOTAS = 3;

        soma = 0; //acumulador das notas digitadas
        cont = 1;
        while ( cont <= QTDDENOTAS) {
            System.out.printf("Digite a nota (%d / %d):" , cont , QTDDENOTAS);
            nota=entrada.nextDouble();
            soma = soma + nota;
            cont++;
            
        }
        
        media = soma / QTDDENOTAS;

        System.out.printf("A média das notas é: %.2f\n " , media);

        entrada.close();
    }
    
}