package exemplos.exveiculos;

public class appVeiculos {

    public static void main(String[] args) {
        veiculos veiculo1 = new veiculos("Gol", "Volks", 12.5);
        veiculos veiculo2 = new veiculos("Celta", "Chevrolet", 7.5);

        System.out.println(veiculo1.exibir());
        System.out.println("O consumo do veiculo 1 é: " + veiculo1.consumo());

        System.out.println(veiculo2.exibir());
        System.out.println("O consumo do veiculo 2 é: " + veiculo2.consumo());    
    }
}