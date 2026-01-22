package ReestudandoPoo.Nivel02;

public class Pessoa {
    int idade;
    String nome;

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public void mostrarDados() {
        System.out.println("Seu nome é " + nome);
        System.out.println("Sua idade é " + idade);
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(16,"Ichigo Kurosaki");
        Pessoa p2 = new Pessoa(1000,"Zaraki Kenpachi");

        p1.mostrarDados();
        p2.mostrarDados();
    }
}
