package Desafio.TabelaFutebol.test;

import Desafio.TabelaFutebol.dominio.Times;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculadoraDePontosFutebol {
    public static void main(String[] args) {
        //Vitoria = 3 pontos
        //Derrota = 0 Pontos
        //Empate = 1 Ponto

        Scanner entrada = new Scanner(System.in);
        List <Time> times = new ArrayList<>();

        System.out.println("Quantos times deseja cadastrar");
        int quantidade = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0 ; i < quantidade; i++) {

            System.out.println("Qual o nome do time: " + (i + 1 ));
            String nometime = entrada.nextLine();

            System.out.println("Qual a quantidade de vitorias: ");
            int vitorias = entrada.nextInt();

            System.out.println("Qual a quantidade de derrotas:  ");
            int derrotas = entrada.nextInt();

            System.out.println("Qual a quantidade de empates: ");
            int empates = entrada.nextInt();
            entrada.nextInt();

           Time time = new Time();
           times.add(time);
        }
        entrada.close();
    }
}
//System.out.println("O total de pontos do time é " + totalDePontos + " pontos");