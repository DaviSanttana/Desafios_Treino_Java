package Projetos.Biblioteca.servico;

import Desafio.NivelDeAcesso.dominio.Usuario;
import Projetos.Biblioteca.modelo.Livro;
import Projetos.Biblioteca.modelo.Usuarios;
import java.util.ArrayList;

public class Biblioteca {
    protected ArrayList<Livro> livros = new ArrayList<>();
    protected ArrayList<Usuarios> usuarios = new ArrayList<>();

    // Adiciona um livro à lista
    public void adicionarLivros(Livro livro) {
        livros.add(livro);
    }

    public void adicionarUsuarios(Usuarios usuarios) {
        this.usuarios.add(usuarios);
    }

    //Lista todods os livros cadstrados
    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println(" Nenhumm livro cadastrado.\n");
            return;
        }
        System.out.println("\nLivros na biblioteca");
        for (Livro cadastro : livros) {
            String status = cadastro.isDisponivel() ? "Disponivel" : " Emprestado";
            System.out.println("- " + cadastro.getTitulo()+" | ano: "+cadastro.getAno()+" - (" + status + ")");
        }
    }

    // Empresta um livro (se disponível)
    public void emprestLivro(Livro livro, Usuarios usuario) {
        if (livro.isDisponivel() && usuario.podeEmprestar()) {
            livro.emprestar();
            usuario.livrosEmprestados++;
            System.out.println("\n" + usuario.getNome() + " pegou emprestado o livro: \n" + livro.getTitulo());
        } else {
            System.out.println("Nao foi possivel emprestar o livro: \n" + livro.getTitulo());
        }
    }

    //Devolve um livro
    public void devolverLivro(Livro livro, Usuarios usuario) {
        if (livro.isDisponivel()) {
            livro.devolver();
            usuario.livrosEmprestados--;
            System.out.println(usuario.getNome() + " Devolveu o livro: \n" + livro.getTitulo());
        }
    }

    public Livro buscarLivro(String titulo) {
        for (Livro l : livros) {
            if (l.getTitulo().equalsIgnoreCase(titulo.trim())) {
                return l;
            }
        }
        return null;
    }

    public Usuarios buscarUsuario(String nome) {
        for (Usuarios usuario : usuarios) {
            if (usuario.getNome().equalsIgnoreCase(nome.trim())) {
                return usuario;
            }
        }
        return null;
    }
    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado. \n");
            return;
        }
        System.out.println("👤 Usuários cadastrados: \n");
        for (Usuarios cadastro : usuarios) {
            System.out.println("- " + cadastro.getNome());
        }
    }
}
