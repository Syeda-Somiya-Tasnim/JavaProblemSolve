public class RemoveVowels {
    public static void main(String[] args) {
        String input = "I am a SQA Engineer";
        String result = input.replaceAll("(?i)[aeiou]", ""); // Replace vowels with empty string
        System.out.println("Output: " + result);
    }
}
