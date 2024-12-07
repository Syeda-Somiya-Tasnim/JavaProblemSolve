import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        // Reading the input values for A and B
        int A = x.nextInt();
        int B = x.nextInt();

        // Calculating the sum and assigning it to X
        int X = A + B;

        // Printing the output in the required format
        System.out.println("X = " + X);

        // Closing the scanner
        x.close();
    }


}
