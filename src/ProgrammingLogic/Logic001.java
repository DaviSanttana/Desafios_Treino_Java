package ProgrammingLogic;

import java.util.Scanner;

public class Logic001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the first number? ");
        int firstNumber = scanner.nextInt();
        System.out.print("What is the second number? ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.println("The sum of the first number and the second number is "+sum);
    }
}
