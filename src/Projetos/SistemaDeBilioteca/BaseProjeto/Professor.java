package Projetos.SistemaDeBilioteca.BaseProjeto;

public class Professor extends Usuarios{
    public Professor(String nome) {
        super(nome);
    }

    @Override
    public boolean podeEmprestar() {
        return livrosEmprestados < 5;
    }
}
