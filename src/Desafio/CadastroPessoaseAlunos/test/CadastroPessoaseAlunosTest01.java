package Desafio.CadastroPessoaseAlunos.test;

import Desafio.CadastroPessoaseAlunos.dominio.Aluno;
import Desafio.CadastroPessoaseAlunos.dominio.Pessoa;

public class CadastroPessoaseAlunosTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Davi", 19);
        Aluno aluno1 = new Aluno("Fernanda", 20,"Moda");
        Aluno aluno2 = new Aluno("Caique", 19,"Mecânica");
        Aluno aluno3 = new Aluno("Davi", 19,"Analise e Desenvolvimento de Sistemas");
        System.out.println(pessoa);
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);

    }
}
