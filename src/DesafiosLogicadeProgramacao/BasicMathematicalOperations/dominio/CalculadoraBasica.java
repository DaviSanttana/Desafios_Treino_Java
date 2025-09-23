package DesafiosLogicadeProgramacao.BasicMathematicalOperations.dominio;

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;
        int num1;
        int num2;

        while (opcao != 0) {
            System.out.println("\n --- CALCULADORA ---");
            System.out.println("Escolha uma Operação: \n" +
                    "1 - Somar\n" +
                    "2 - Subtrair\n" +
                    "3 - Multiplicar\n" +
                    "4 - Dividir\n" +
                    "0 - Sair");

            System.out.print("Opcão: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 0:
                    return;
                case 1:
                    System.out.println("Voce escolheu a opção " + opcao);
                    System.out.print("Primeiro numero: ");
                    num1 = sc.nextInt();
                    System.out.print("Segundo numero: ");
                    num2 = sc.nextInt();
                    System.out.print("Resultado: " + (num1 + num2)+ "\n");
                    break;
                case 2:
                    System.out.println("Voce escolheu a opção " + opcao);
                    System.out.print("Primeiro numero: ");
                    num1 = sc.nextInt();
                    System.out.print("Segundo numero: ");
                    num2 = sc.nextInt();
                    System.out.print("Resultado: " + (num1 - num2)+ "\n");
                    break;
                case 3:
                    System.out.println("Voce escolheu a opção " + opcao);
                    System.out.print("Primeiro numero: ");
                    num1 = sc.nextInt();
                    System.out.print("Segundo numero: ");
                    num2 = sc.nextInt();
                    System.out.print("Resultado: " + (num1 * num2)+ "\n");
                    break;
                case 4:
                    System.out.println("Voce escolheu a opção " + opcao);
                    System.out.print("Primeiro numero: ");
                    num1 = sc.nextInt();
                    System.out.print("Segundo numero: ");
                    num2 = sc.nextInt();
                    System.out.print("Resultado: " + (num1 / num2)+ "\n");
                    break;
            }
        }
    }
}

