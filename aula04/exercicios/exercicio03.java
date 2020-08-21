package exercicios;

public class exercicio03 {
    public static void main(String[] args) {
        String palavra = "Banana";
        int cont;

       // System.out.println(palavra.charAt(0)); //primeira letra
       // System.out.println(palavra.charAt(1)); //segunda letra
       // System.out.println(palavra.charAt(2)); //terceira letra

       //lenght é tamanho (quantos caracteres) da palavra
        for(int i=0; i < palavra.length(); i++){
            if(palavra.charAt(i) == 'a'|| palavra.charAt(i) == 'e' ||
               palavra.charAt(i) == 'i'|| palavra.charAt(i) == 'o' ||
               palavra.charAt(i) == 'u') {
                cont ++;
           }
           System.out.println("Existem " + cont + " vogais ");
        }
    }

    public static int contaVogais(String palavra){
        int cont = 0;
        palavra=palavra.toLowerCase(); //troca todos os caracteres da palavra para minuscula

        for(int i=0; i < palavra.length(); i++){
            if(palavra.charAt(i) == 'a'|| palavra.charAt(i) == 'e' ||
               palavra.charAt(i) == 'i'|| palavra.charAt(i) == 'o' ||
               palavra.charAt(i) == 'u') {
                cont ++;   

    }
}
            return cont;
}
}