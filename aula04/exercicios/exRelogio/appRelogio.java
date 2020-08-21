package exercicios.exRelogio;

public class appRelogio {

    public static void main(String[] args) {
        Relogio relogio1 = new Relogio (8, 30, 56);
        Relogio relogio2 = new Relogio (18, 30, 11);

        System.out.println(relogio1.exibirHoraUniversal());
        System.out.println(relogio1.exibirHoraAmPm());
        System.out.println(relogio2.exibirHoraUniversal());
        System.out.println(relogio2.exibirHoraAmPm()); 
        
        for (int i=0; i<10; i++) {
            relogio1.avancarHora();
            System.out.println(relogio1.exibirHoraUniversal());
        }
    }
}