package Projetos.Biblioteca.app;


import Projetos.Biblioteca.modelo.Aluno;
import Projetos.Biblioteca.servico.Biblioteca;
import Projetos.Biblioteca.modelo.Livro;
import Projetos.Biblioteca.modelo.Professor;
import Projetos.Biblioteca.modelo.Usuarios;

import java.util.Scanner;

public class TestBase01 {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        int opcoes = -1;
        while (opcoes != 0) {
            System.out.println("O que Deseja fazer \n" +
                    "1 - Listar livros\n" +
                    "2 - Cadastrar livro\n" +
                    "3 - Cadastrar Usuario\n" +
                    "4 - Emprestar livro\n" +
                    "5 - Devolver livro\n" +
                    "6 - Listar Usuarios\n" +
                    "0 - Sair\n");
            System.out.print("Opcão: ");
            opcoes = op.nextInt();

            switch (opcoes) {
                case 0:
                    return;
                case 1:
                    biblioteca.listarLivros();
                    break;
                case 2:
                    System.out.println("Nome do Livro: ");
                    String nomeLivroAdd = op.nextLine();
                    System.out.println("Ano do Livro: ");
                    int anoLivroAdd = op.nextInt();
                    Livro livros = new Livro(nomeLivroAdd,anoLivroAdd );
                    biblioteca.adicionarLivros(livros);
                    System.out.println("Livro Cadastrado com Sucesso! ");
                    break;
                case 3:
                    System.out.println("Nome do Usuario: ");
                    String nomeUsuarioAdd = op.nextLine();
                    System.out.println("Professor ou Aluno (P/A)?");
                    String tipoUsusarioAdd = op.nextLine().toUpperCase();

                    Usuarios usuarios;
                    if (tipoUsusarioAdd.equals("A") ) {
                        usuarios = new Aluno(nomeUsuarioAdd);
                    } else {
                        usuarios =new Professor(nomeUsuarioAdd);
                    }
                   biblioteca.adicionarUsuarios(usuarios);
                    System.out.println("Usuario Cadastrado com Sucesso! ");
                    break;
                case 4:
                    System.out.println("Qual livro quer pegar emprestado?");
                    String tituloEmprestimo = op.nextLine();
                    Livro livroemprestimo = biblioteca.buscarLivro(tituloEmprestimo);

                    if (livroemprestimo == null) {
                        System.out.println(" Livro nao encontrado!");
                        break;
                    }
                        System.out.print("Digite o nome do usuário: ");
                        String nomeUsuario = op.nextLine();
                        Usuarios usuarioEmprestimo = biblioteca.buscarUsuario(nomeUsuario);
                        if (usuarioEmprestimo == null){
                            System.out.println(" Usuario nao encontrado!");
                            break;
                    }biblioteca.emprestLivro(livroemprestimo, usuarioEmprestimo);
                        break;
                case 5:
                    System.out.println("Digite o titulo do livro que quer Devolver: ");
                    String tituloDevolucao = op.nextLine();
                    Livro livroDevolucao = biblioteca.buscarLivro(tituloDevolucao);

                    System.out.println("Digite o nome do usuario: ");
                    String nomeDevendo = op.nextLine();
                    Usuarios usuarioDevendo = biblioteca.buscarUsuario(nomeDevendo);

                    if (livroDevolucao != null && usuarioDevendo != null) {
                        biblioteca.devolverLivro(livroDevolucao , usuarioDevendo);
                    }else {
                        System.out.println("Livro ou usuario nao encontrado! ");
                    }    break;
                    case 6:
                    biblioteca.listarUsuarios();
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }op.close();
    }
}
