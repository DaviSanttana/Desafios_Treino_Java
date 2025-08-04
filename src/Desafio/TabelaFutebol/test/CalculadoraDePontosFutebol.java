package Desafio.TabelaFutebol.test;

import java.util.Scanner;

public class CalculadoraDePontosFutebol {
    public static void main(String[] args) {
        //Vitoria = 3 pontos
        //Derrota = 0 Pontos
        //Empate = 1 Ponto

        Scanner entrada = new  Scanner (System.in);
        int totalDePontos;

        System.out.println("Qual a quantidade de vitorias: ");
        int vitorias = entrada.nextInt();

        System.out.println("Qual a quantidade de derrotas:  ");
        int derrotas = entrada.nextInt();

        System.out.println("Qual a quantidade de empates: ");
        int emaptes = entrada.nextInt();

        totalDePontos = ( vitorias * 3 ) + (emaptes * 1 );

        System.out.println("O total de pontos do time é "+ totalDePontos + " pontos");
    }
}
