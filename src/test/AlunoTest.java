package test;

import dominio.Aluno;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setnome("Davi");
        aluno1.setIdade(19);
        aluno1.setCurso("Analise e Desenvolvimento de Sistemas");

        Aluno aluno2 = new Aluno();
        aluno2.setnome("Caique");
        aluno2.setIdade(18);
        aluno2.setCurso("Engenharia de Software");

        aluno1.imprimeDados();
        System.out.println("-------");
        aluno2.imprimeDados();
        System.out.println("-------");

        aluno1.compararIdade(aluno2);

    }
}
