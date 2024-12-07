import java.util.Scanner;

public class LowestHeights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] heights = new int[10];

        System.out.println("Enter the heights of 10 babies:");
        for (int i = 0; i < 10; i++) {
            heights[i] = scanner.nextInt();
        }

        int lowest = Integer.MAX_VALUE, secondLowest = Integer.MAX_VALUE;

        // Find the two lowest heights
        for (int height : heights) {
            if (height < lowest) {
                secondLowest = lowest;
                lowest = height;
            } else if (height < secondLowest && height != lowest) {
                secondLowest = height;
            }
        }

        System.out.println("The two lowest heights are: " + lowest + " and " + secondLowest);
    }
}
