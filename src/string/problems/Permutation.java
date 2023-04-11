package string.problems;

import java.util.Scanner;

public class Permutation {

    static void printDistinctString(String input, String result) {

        if (input.length() == 0) {
            System.out.print(result + ", ");
            return;
        }

        boolean alphabet[] = new boolean[26];
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            String restValue = input.substring(0, i) + input.substring(i + 1);

            if (alphabet[ch - 'a'] == false)
                printDistinctString(restValue, result + ch);
            alphabet[ch - 'a'] = true;
        }
    }

    public static void main(String[] args) {
        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a String to compute all permutations: ");
            String word = scanner.nextLine();

            System.out.println("Permutations of " + word + ": ");
            printDistinctString(word, "");

            String answer = "";
            while (true) {
                System.out.println(" ");
                System.out.println("Do you want to check another permutation? (yes/no)");
                answer = scanner.nextLine().toLowerCase();
                if (answer.equals("yes") || answer.equals("no")) {
                    break;
                } else {
                    System.out.println("Invalid Entry, please enter Yes or No");
                }
            }

            if (answer.equals("no")) {
                System.out.println("Goodbye!");
                break;
            }
        }

        scanner.close();
    }
}
