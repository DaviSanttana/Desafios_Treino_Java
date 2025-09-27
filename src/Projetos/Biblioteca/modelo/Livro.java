package Projetos.Biblioteca.modelo;

public class Livro {
    private String titulo;
    private int ano;
    private boolean disponivel = true;

    public Livro(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public Livro(String titulo, int ano, boolean disponivel) {
        this.titulo = titulo;
        this.ano = ano;
        this.disponivel = disponivel;
    }


    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
    public void emprestar(){
        disponivel =false;
    }
    public void devolver (){
       disponivel =true;
    }
}
