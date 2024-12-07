import java.util.HashMap;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 1, 2, 4, 5, 6, 5, 4, 7};
        HashMap<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences
        for (int num : numbers) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Print unique numbers
        System.out.print("Unique numbers: ");
        countMap.forEach((key, value) -> {
            if (value == 1) {
                System.out.print(key + " ");
            }
        });
    }
}
