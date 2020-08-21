package exemplos.exveiculos;

public class veiculos {
    String modelo, marca;
    double consumo;

    veiculos(String modelo, String marca, double consumo){
    this.modelo = modelo;
    this.marca = marca;
    this.consumo = consumo;
}

    String exibir(){
        return modelo + "marca" + marca;
    }
    
    double consumo(){
        return consumo;
    }
}