package Projetos.SistemaDeBilioteca.BaseProjeto;

public class Livro {
    private String titulo;
    private int ano;
    private String categoria;
    private boolean disponivel = true;

    public Livro(String titulo, int ano, String categoria, boolean disponivel) {
        this.titulo = titulo;
        this.ano = ano;
        this.categoria = categoria;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public String getCategoria() {
        return categoria;
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
