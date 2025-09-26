package Projetos.SistemaDeBilioteca.BaseProjeto;


public class TestBase01 {
    public static void main(String[] args) {

        //Criando Usuarios
        Aluno a1 = new Aluno("Davi");
        Professor p1 = new Professor("Gustavo");

        // Criando Livros
        Livro l1 = new Livro("Java POO", 2021, "Engenharia", true);
        Livro l2 = new Livro("Java para Iniciantes", 2020, "Engenharia", true);
        Livro l3 = new Livro("Java Basico", 2011, "Engenharia", false);
        Livro l4 = new Livro("Banco de dados", 2025, "Engenharia", true);

        //Testando empréstimos
        System.out.println("Aluno: "+a1.getNome());
        a1.livrosEmprestados = 3;
        System.out.println("Pode pegar mais? "+a1.podeEmprestar());

        System.out.println("Professor: "+p1.getNome());
        a1.livrosEmprestados = 0;
        System.out.println("Pode pegar mais? "+a1.podeEmprestar());
    }
}
