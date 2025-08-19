package Desafio.CadastroPessoaseAlunos.dominio;

public class Pessoa {
    public String nome;
    public int idade;


    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return  "Pessoa: \n"+"Nome: " + this.nome+"\n"+"Idade: "+this.idade+"\n" ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


}