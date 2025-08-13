package Desafio.TabelaFutebol.test;

import Desafio.TabelaFutebol.dominio.Times;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculadoraDePontosFutebol {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Times.Tabela> times = new ArrayList<>();

        System.out.println("Quantos times deseja cadastrar?");
        int quantidade = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < quantidade; i++) {

            System.out.println("\nCadastro de time: \n");

            System.out.print("Qual o nome do " + (i + 1) + "º" + " time que quer cadastrar? ");
            String nometime = entrada.nextLine();

            System.out.print("Quantidade de vitorias: "); //Vitoria = 3 pontos
            int vitorias = entrada.nextInt();

            System.out.print("Quantidade de derrotas:  "); //Derrota = 0 Pontos
            int derrotas = entrada.nextInt();

            System.out.print("Quantidade de empates: "); //Empate = 1 Ponto
            int empates = entrada.nextInt();
            entrada.nextLine();

            Times.Tabela Tabela = new Times.Tabela(nometime, vitorias, derrotas, empates);
            times.add(Tabela);
        }
        for (int j = 0; j < times.size() - 1 ; j++) {
            for (int k = 0; k < times.size() - 1 - j; k++) {
                if (times.get(k).getPontos() < times.get(j +1 ).getPontos()) {
                    Times.Tabela pos = times.get(k);
                    times.set(k, times.get(k +1 ));
                    times.set(k +  1 , pos);
                }
            }
            System.out.println("\n----  Classificação  ----");
            for (int i = 0; i <times.size() ; i++) {
                System.out.println((i + 1) +"º lugar: "+times.get(i));
            }
        } entrada.close();

    }
}