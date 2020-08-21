package exemplos.exlivros;

public class appLivro {

    public static void main(String[] args) {
    livro livro1 = new livro("Programando em Java", "Deitel", 500, 2010); //nome da classe
    livro livro2 = new livro("Java Extremo", "Deitel Jr", 400, 2015);

    // livro1.titulo = "Programando em Java";
   // livro1.autor = "Deitel";
   // livro1.paginas = 500;
   // livro1.anoPublicacao = 2010;

    livro1.exibirDados();
    System.out.println("Páginas: " + livro1.numeroPaginas());

    livro2.exibirDados();    
   

}
    
}