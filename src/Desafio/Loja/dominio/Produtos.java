package Desafio.Loja.dominio;

public class Produtos {
    public class Produto {
    }
    private String nome;
    private double preco;
    private Loja loja;

    public Produtos(String nome, double preco, Loja loja) {
        this.nome = nome;
        this.preco = preco;
        this.loja = loja;
    }

    public void imprimeProduto() {
        System.out.println("------------------");
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Loja: " + loja.getNome());
    }
}
