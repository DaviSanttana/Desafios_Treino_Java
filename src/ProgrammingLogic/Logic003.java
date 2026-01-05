package ProgrammingLogic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Logic003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter a number " + i + ": ");
            int numbersSearch = scanner.nextInt();
            numbers.add(numbersSearch);
        }
        int bigger = Collections.max(numbers);
        System.out.println("The largest number is " + bigger);
        scanner.close();

    }
}
