package ProgrammingLogic;

import java.util.Scanner;

public class Logic002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int evenOrOdd = scanner.nextInt();
        if (evenOrOdd % 2 == 0) {
            System.out.println("This number is even");
        }else {
            System.out.println("This number is odd");
        }
    }
}
