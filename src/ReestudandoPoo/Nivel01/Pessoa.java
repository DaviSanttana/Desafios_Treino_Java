package ReestudandoPoo.Nivel01;

public class Pessoa {
    int idade;
    String nome;

    public void mostrarDados() {
        System.out.println("Seu nome é " + nome);
        System.out.println("Sua idade é " + idade);
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Davi";
        p1.idade = 19;
        p1.mostrarDados();
        System.out.println("=============");

        Pessoa p2 = new Pessoa();
        p2.nome = "Fernanda";
        p2.idade = 20;
        p2.mostrarDados();
    }
}

