package classes;

public class Autor {

    String nome;
    String nacionalidade;
    int anoNascimento;

    @Override
    public String toString() {
        return nome;
    }

    public Autor(String nome, String nacionalidade, int anoNascimento) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.anoNascimento = anoNascimento;
    }
}