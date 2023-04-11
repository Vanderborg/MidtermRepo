package math.problems;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int number;
        String userInput;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter a number to find its factorial: ");
            number = scan.nextInt();

            int answer = factorialRecursive(number);
            int answer1 = factorialIterative(number);

            System.out.println("Factorial of " + number + " is " + answer + " (Recursive) ");
            System.out.println();
            System.out.println("Factorial of " + number + " is " + answer1 + " (Iterative) ");

            System.out.println("Would you like to compute another factorial? (Yes/No): ");
            userInput = scan.next();
            while (!userInput.equalsIgnoreCase("Yes") && !userInput.equalsIgnoreCase("No")) {
                System.out.println("Invalid entry, please select Yes or No.");
                System.out.println("Would you like to compute another factorial? (Yes/No): ");
                userInput = scan.next();
            }

        } while (userInput.equalsIgnoreCase("Yes"));

        System.out.println("Goodbye!");
    }

    public static int factorialRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }

    public static int factorialIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
