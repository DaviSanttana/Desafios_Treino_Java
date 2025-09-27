package Projetos.Biblioteca.modelo;

public class Aluno extends Usuarios {
    public Aluno(String nome) {
        super(nome);
    }
    @Override
    public boolean podeEmprestar() {
        return livrosEmprestados < 3;
    }

    @Override
    public void add(Usuarios usuarios) {

    }

}