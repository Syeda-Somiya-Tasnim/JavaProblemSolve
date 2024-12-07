import java.util.Scanner;

public class CircleAreaCalculator {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        double pi=3.1416;
        double R= scanner.nextDouble();
        double area=pi*R*R;

        System.out.printf("A=%4f");
    }
}
