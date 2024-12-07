public class SortCGPA {
    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        // Bubble Sort for descending order
        for (int i = 0; i < cgpa.length; i++) {
            for (int j = 0; j < cgpa.length - i - 1; j++) {
                if (cgpa[j] < cgpa[j + 1]) {
                    double temp = cgpa[j];
                    cgpa[j] = cgpa[j + 1];
                    cgpa[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted CGPA: ");
        for (double score : cgpa) {
            System.out.print(score + " ");
        }
    }
}
