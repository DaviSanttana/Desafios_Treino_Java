package Desafio.CalculadoraDePeso.dominio;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("\n-- Calculadora de Peso -- \n");

        System.out.print(" Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print(" Digite seu peso (kg): ");
        int peso = entrada.nextInt();
        if (peso <= 10) {
            throw new RuntimeException("Voce nao é tao leve assim, coloque o peso certo");
        }

        System.out.println("[############ 100.00 %  ######]");

        System.out.println("Olá "+ peso +" Kg seu peso é: "+nome);
    }
}
