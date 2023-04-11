package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);

        String [] array = s.split(" ");
        String longestWord = " ";

        
        for (String value : array) {
            if (value.length() > longestWord.length()) {
                longestWord = value;
            }

        }
        System.out.println(longestWord.length() + " "+ longestWord);
    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";

        return map;
    }
}
