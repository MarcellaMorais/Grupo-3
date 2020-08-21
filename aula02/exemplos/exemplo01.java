package exemplos;

public class exemplo01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String senha;
        boolean resultado;

        System.out.println("Digite seu nome:");
        senha = entrada.nextLine();

        System.out.println(senha.equals("Emerson"));

        entrada.close();

    }

}