package Projetos.Biblioteca.modelo;

public class Professor extends Usuarios {
    public Professor(String nome) {
        super(nome);
    }

    @Override
    public boolean podeEmprestar() {
        return livrosEmprestados < 5;
    }

    @Override
    public void add(Usuarios usuarios) {

    }
}
