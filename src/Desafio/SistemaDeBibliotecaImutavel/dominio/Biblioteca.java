package Desafio.SistemaDeBibliotecaImutavel.dominio;


import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
     private final List<Livro> livros = new ArrayList<>();

     public void adiconarLivros(Livro livro){
         livros.add(livro);
     }
    public void listarLivros(){
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }
}
