package Desafio.Loja.AssociaçãoMuitosParaUm.test;

import Desafio.Loja.AssociaçãoMuitosParaUm.dominio.Loja;
import Desafio.Loja.AssociaçãoMuitosParaUm.dominio.Produtos;

public class LojaTest01 {
    public static void main(String[] args) {
        Loja loja1 = new Loja("Mercado Livre");
        Loja loja2 = new Loja("Zara");
        Loja loja3 = new Loja("Shoppe");

        Produtos produto1 = new Produtos("Tenis",150.00, loja1);
        Produtos produto2 = new Produtos("Camisa",180.00, loja2);
        Produtos produto3 = new Produtos("Calça",180.00, loja3);

        produto1.imprimeProduto();
        produto2.imprimeProduto();
        produto3.imprimeProduto();
    }
}
