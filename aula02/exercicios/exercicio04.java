package exercicios;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double nota1,nota2,media;

    nota1=in.nextDouble();
    nota2=in.nextDouble();
    media=((nota1*0.4)+(nota2*0.6));

    if(media >=6.0) {
        System.out.println("APROVADO = " + media);
    }
    
    if(media <=6.0){
        System.out.println("REPROVADO = " + media);  
    }
    
    in.close();
    }
    
}