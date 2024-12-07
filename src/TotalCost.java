public class TotalCost {
    public static void main(String[] args) {
        String input = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk.";
        String[] words = input.split(" ");
        int laptopPrice = 0, mousePrice = 0;

        // Extract prices
        for (String word : words) {
            if (word.matches("\\d+")) { // Check if the word is a number
                int price = Integer.parseInt(word);
                if (laptopPrice == 0) {
                    laptopPrice = price;
                } else {
                    mousePrice = price;
                }
            }
        }

        // Calculate total cost after discount
        int totalPrice = laptopPrice + mousePrice;
        double discount = totalPrice * 0.15;
        double finalPrice = totalPrice - discount;

        System.out.println("Total cost after 15% discount: " + finalPrice);
    }
}
