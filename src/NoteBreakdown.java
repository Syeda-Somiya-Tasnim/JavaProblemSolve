import java.util.Scanner;

public class NoteBreakdown {
    public static void main(String[] args) {
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an amount: ");
        int amount = scanner.nextInt();

        System.out.println("Breakdown:");
        for (int note : notes) {
            if (amount >= note) {
                int count = amount / note;
                amount %= note;
                System.out.println(note + " " + count);
            }
        }
    }
}
