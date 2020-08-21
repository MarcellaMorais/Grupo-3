package exercicios.exEbook;

public class Ebook {
    
    private String titulo;
    private String autor;
    private int totalPaginas, paginaAtual;

    public Ebook(String titulo, String autor, int totalPaginas) {
        //this.titulo = titulo;
        setTitulo(titulo);
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = 0;
    }

    public void avancaPagina(){
        if(paginaAtual < totalPaginas){
            paginaAtual++;
        }
    }

    public void retrocederPagina(){
        if(paginaAtual > 0){
            paginaAtual--;
        }
    }

    public void irParaPagina(int pagina){
        if(pagina >= 0 && pagina < totalPaginas){
            paginaAtual = pagina;
        }
    }

    public int exibirPagina(){
        return paginaAtual;
    }

    public String mostrarCapa(){
        paginaAtual = 0;
        return titulo + " : " + autor;
    }

    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String novoTitulo){
        if(novoTitulo != null && novoTitulo.length() > 10){
            titulo = novoTitulo;
        }
    }
    
}