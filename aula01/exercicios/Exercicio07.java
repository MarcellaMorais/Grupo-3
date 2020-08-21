package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        // 1 pé = 12 polegadas
        // 1 jarda = 3 pés
        // 1 milha = 1.760jardas
        // 1km = 0,621237 milhas

        Scanner entrada = new Scanner(System.in);
        final float KMparaMILHAS = 0.621237f;
        final float MILHASparaJARDAS = 1760;
        final float JARDASparaPÉS = 3;
        final float PÉSparaPOLEGADAS = 12;

        double km;

        System.out.println("Quantos KM foram rodados? ");
        km = entrada.nextDouble();

        System.out.println(km + "km");
        System.out.println("em milhas" + km + "km são " + (km*KMparaMILHAS));
        System.out.println("em jardas" + km + "km são " + (km*KMparaMILHAS*MILHASparaJARDAS));
        System.out.println("em pés" + km + "km são " + (km*KMparaMILHAS*MILHASparaJARDAS*JARDASparaPÉS));
        System.out.println("em polegadas" + km + "km são " + (km*KMparaMILHAS*MILHASparaJARDAS*JARDASparaPÉS*PÉSparaPOLEGADAS));



        entrada.close();
    }
    
}