package exemplos;

/**
 * exemplo01
 */
public class exemplo01 {

    public static void main(String[] args) {
        linha(10);
        System.out.println("Bom dia!");
        linha(20);
        linha2(20, '*');
        
    }

    public static void linha(int tam){
        for (int i=0; i<tam; i++){
            System.out.print("-"); 
        }
        System.out.println();

    }
//ao executar, nao executou nada, pq? Pq o programa executa o Main. E aqui não imprimimos nada no Main.
//colocando sysout embaixo do Main e a função linha embaixo do sysout, o resultado muda.

    public static void linha2(int tam, char tipo){
    for (int i=0; i<tam; i++){
        System.out.print(tipo); 
    }
    System.out.println(); 

}
}