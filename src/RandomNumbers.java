import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        // Generate random numbers and find max/min
        System.out.print("Random numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = rand.nextInt(100); // Random numbers between 0-99
            System.out.print(numbers[i] + " ");
            if (numbers[i] > max) max = numbers[i];
            if (numbers[i] < min) min = numbers[i];
        }

        System.out.println("\nMax: " + max);
        System.out.println("Min: " + min);
    }
}
