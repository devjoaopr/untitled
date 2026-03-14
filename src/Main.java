import classes.Autor;
import classes.Emprestimos;
import classes.Leitor;
import classes.Livros;
import classes.Funcionarios;

public class Main {

    public static void main(String[] args) {

        Autor autor = new Autor("michael phelps", "Irlandes", 1956);

        Livros livro = new Livros("irineu", autor, 1899, "Horror", 15);

        Leitor leitor = new Leitor("João", "001", "449999999");

        Funcionarios funcionarios = new Funcionarios("Maria", "10", "Bibliotecária");

        Emprestimos emprestimo = new Emprestimos(leitor, livro, "10/03/2026", "17/03/2026");

        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor() );
        System.out.println("Leitor: " + emprestimo.getLeitor());
        System.out.println("Data do empréstimo: " + emprestimo.getDataEmprestimo());

    }

}