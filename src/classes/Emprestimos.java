package classes;

public class Emprestimos {
    Leitor leitor;
    Livros livro;
    String dataEmprestimo;
    String dataDevolucao;

    public Emprestimos(Leitor leitor, Livros livro, String dataEmprestimo, String dataDevolucao) {
        this.leitor = leitor;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }
}
