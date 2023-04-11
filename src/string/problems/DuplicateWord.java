package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

    public static void main(String[] args) {

        String string = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language language.";

        String[] words = string.split("\\s+");

        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            word = word.toLowerCase(); // convert word to lowercase
            int count = wordCounts.getOrDefault(word, 0);
            wordCounts.put(word, count + 1);
        }

        // Handle special case for "Language" and "language"
        if (wordCounts.containsKey("language") && wordCounts.containsKey("Language")) {
            int count = wordCounts.get("language") + wordCounts.get("Language");
            wordCounts.put("language", count);
            wordCounts.remove("Language");
        }

        System.out.println("Duplicate words in the given string:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }


        double avgLength = 0;
        int numWords = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                avgLength += word.length();
                numWords++;
            }
        }
        if (numWords > 0) {
            avgLength /= numWords;
        }
        System.out.println("Average length of words in the given string: " + avgLength);
    }
}
