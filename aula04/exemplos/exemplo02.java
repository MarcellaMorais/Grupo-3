package exemplos;

public class exemplo02 {
    public static void main(String[] args) {
        int resultado;

        resultado = soma(10,5);

        System.out.println(resultado);


    }

    public static int soma(int a, int b) {
        // escopo da variavel: onde ela é válida
        // resp é uma variavel LOCAL ao método soma
       int resp;

       resp = a + b;

       return resp;
    }

}