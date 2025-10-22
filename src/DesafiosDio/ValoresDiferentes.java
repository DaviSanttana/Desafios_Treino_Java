package DesafiosDio;

import java.util.Scanner;

public class ValoresDiferentes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        double a = entrada.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = entrada.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = entrada.nextDouble();
        double somaAeB = a + b;
        if (c > somaAeB) {
            System.out.println("C é maior que A + B ");
        } else if (c == somaAeB) {
            System.out.println("A soma de A + B é igual C");
        } else {
            System.out.println("A soma de A + B é " + somaAeB + " e é maior que C ");
        }
    }
}
