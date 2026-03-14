package classes;

public class Leitor {

    String nome;
    String registro;
    String telefone;

    @Override
    public String toString() {
        return nome;
    }

    public Leitor(String nome, String registro, String telefone) {
        this.nome = nome;
        this.registro = registro;
        this.telefone = telefone;
    }
}