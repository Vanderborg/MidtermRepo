package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a String to check if it's a palindrome: ");
            String str = scanner.nextLine();
            String str1 = str.toLowerCase().replace(" ", "");

            String reverse = "";

            for (int i = str1.length() - 1; i >= 0 ; i--) {
                reverse += (str1.charAt(i));
            }

            boolean palindrome = true;

            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != reverse.charAt(i)){
                    palindrome = false;
                    break;
                }
            }

            if (palindrome) {
                System.out.println(str1 + " is a palindrome string.");
            } else {
                System.out.println(str1 + " is not a palindrome string.");
            }

            String answer = "";
            System.out.println("Do you want to check another palindrome? (yes/no)");
            answer = scanner.nextLine();

            while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
                System.out.println("Invalid Entry, please enter Yes or No");
                answer = scanner.nextLine().toLowerCase();
            }

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Goodbye!");
                break;
            }
        }

        scanner.close();
    }
}





