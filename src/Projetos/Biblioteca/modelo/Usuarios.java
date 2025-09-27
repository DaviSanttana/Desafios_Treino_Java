package Projetos.Biblioteca.modelo;

public abstract class Usuarios {
    protected String nome;
    public int livrosEmprestados;

    public Usuarios(String nome) {
        this.nome = nome;
    }

    public abstract boolean podeEmprestar();

    public String getNome() {
        return this.nome;
    }

    public abstract void add(Usuarios usuarios);
}

