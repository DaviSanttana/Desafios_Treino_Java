package Projetos.SistemaDeBilioteca.BaseProjeto;

public class Aluno extends Usuarios {
    public Aluno(String nome) {
        super(nome);
    }
    @Override
    public boolean podeEmprestar() {
        return livrosEmprestados < 3;
    }
}