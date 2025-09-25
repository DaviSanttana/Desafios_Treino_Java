package Projetos.SistemaDeBilioteca.BaseProjeto;

public abstract class Usuarios {
    protected String nome;
    protected int livrosEmprestados;

    public Usuarios(String nome) {
        this.nome = nome;
    }

    public abstract boolean podeEmprestar();

    public String getNome() {
        return nome;
    }
}

