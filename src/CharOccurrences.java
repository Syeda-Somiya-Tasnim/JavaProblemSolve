import java.util.HashMap;

public class CharOccurrences {
    public static void main(String[] args) {
        String input = "I live in Dhaka";
        input = input.toLowerCase().replace(" ", "");
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count occurrences
        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Display results
        charCount.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
