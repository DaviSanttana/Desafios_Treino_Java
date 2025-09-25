package DesafiosLogicadeProgramacao.Tabuada;

import java.util.Scanner;

public class TabuadacomEntrada {
    public static void main(String[] args) {
        Scanner tabuada = new Scanner(System.in);
        System.out.print("Qual valor deseja saber as operações: ");
        double valor1 = tabuada.nextDouble();

        System.out.print("Quantes vezez quer que as operacões se repitam: ");
        int repwticoes = tabuada.nextInt();

        System.out.println("\nMultiplicação do " + valor1 + "       Divisao do " + valor1);
        for (double valor2 = 1; valor2 <= repwticoes; valor2++) {
            System.out.println(valor1 + " x " + valor2 + " = " + (valor1 * valor2) + "    ||     " + valor1 + " / " + valor2 + " = " + String.format("%.2f", (valor1 / valor2)));
        }
    }
}
