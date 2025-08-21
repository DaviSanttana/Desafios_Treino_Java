package Desafio.SistemaDeBibliotecaImutavel.dominio;

public class Livro {
   private final String TITULO;
    private String autor;

    public Livro(String TITULO, String autor) {
        this.TITULO = TITULO;
        this.autor = autor;
    }

    public Livro(String TITULO) {
        this.TITULO = TITULO;
    }

    public String getTITULO() {
        return TITULO;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro: "+ TITULO + " | Autor: " + autor;
    }
}
