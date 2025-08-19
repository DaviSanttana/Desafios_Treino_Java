package Desafio.CadastroPessoaseAlunos.dominio;

public class Aluno extends Pessoa {
    String curso;

    public Aluno(String nome, int idade,  String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    @Override
    public String toString() {
        return  "Pessoa: \n"+"Nome: " + this.nome+"\n"+"Idade: "+this.idade+" | Curso: "+this.curso+"\n";
    }
}
