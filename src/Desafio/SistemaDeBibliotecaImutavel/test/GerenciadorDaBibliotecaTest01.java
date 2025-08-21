package Desafio.SistemaDeBibliotecaImutavel.test;

import Desafio.SistemaDeBibliotecaImutavel.dominio.Biblioteca;
import Desafio.SistemaDeBibliotecaImutavel.dominio.Livro;

public class GerenciadorDaBibliotecaTest01 {
    public final void exibirMensagem(){
        System.out.println("Bem-vindo ao Sistema da Biblioteca\n");
    }

    public static void main(String[] args) {
        GerenciadorDaBibliotecaTest01 gerenciadorDaBiblioteca = new GerenciadorDaBibliotecaTest01();
        gerenciadorDaBiblioteca.exibirMensagem();

        //Criando Livros
        Livro l1 = new Livro("A Arte da Guerra","Shin Tzu");
        Livro l2 = new Livro("One Piece","Eichiro Oda");
        Livro l3 = new Livro("Gachiakuta","Kei Urana");


        l1.setAutor("Brumadinho");//Alterando o Autor pois não é "Final"

        //Criando a Biblioteca
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adiconarLivros(l1);
        biblioteca.adiconarLivros(l2);
        biblioteca.adiconarLivros(l3);

        //Lista os livros
        biblioteca.listarLivros();
    }
}
