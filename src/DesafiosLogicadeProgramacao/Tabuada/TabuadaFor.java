package DesafiosLogicadeProgramacao.Tabuada;

import java.util.Scanner;

public class TabuadaFor {
    public static void main(String[] args) {
        for (double num1 = 1; num1 <= 10; num1++) {
            System.out.println("\nMultiplicação do " + num1 + "        Divisao do " + num1);
            for (double num2 = 1; num2 <= 10; num2++) {
                System.out.println(num1 + " x " + num2 + " = " + num1 * num2 + "      ||     " + num1 + " / " + num2 + " = " + String.format("%.2f", (num1 / num2)));
            }
        }
    }
}

