package classes;

public class Livros {
    String titulo;
    Autor autor;
    int anoPublicacao;
    String genero;
    int quantidade;

    public Livros(String titulo, Autor autor, int anoPublicacao, String genero, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.quantidade = quantidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }
}
