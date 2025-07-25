package Desafio.Aluno.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private String curso;

    public void setnome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }

    public void imprimeDados(){
        System.out.println("Nome do aluno: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Curso: "+curso);
    }
    public void compararIdade(Aluno outroAluno){
        if (this.idade > outroAluno.idade) {
            System.out.println(this.nome + " é mais velho que "+ outroAluno.nome);
        } else if (this.idade < outroAluno.idade) {
            System.out.println(this.nome + " é mais novo que "+ outroAluno.nome);
        }else {
            System.out.println(this.nome + " tem a mesma idade que "+ outroAluno.nome);
        }

    }
}