public class StringAnalysis {
    public static void main(String[] args) {
        String input = "I am a SQA Engineer";
        int words = input.split(" ").length;
        int chars = input.replace(" ", "").length();
        int vowels = 0, consonants = 0;

        // Check for vowels and consonants
        for (char c : input.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Words: " + words);
        System.out.println("Chars: " + chars);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
