package exemplos.exlivros;

public class livro {
    //atributos
    String titulo, autor;
    int paginas, anoPublicacao;

    //construtor - somente colocar o nome (sem void, int, nada disso...)
    livro(String titulo, String novoAutor, int pg, int ano){ //tem que ter o mesmo nome da classe
        //this se refere ao proprio objeto
        this.titulo = titulo;
        autor = novoAutor;
        paginas = pg;
        anoPublicacao = ano;

    }

    //métodos
    void exibirDados(){
        System.out.println(titulo + " : " + autor + " - " + anoPublicacao);
    }

    int numeroPaginas(){
        return paginas;
    }
    
}