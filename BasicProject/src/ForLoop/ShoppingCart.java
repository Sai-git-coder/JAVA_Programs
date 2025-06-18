package ForLoop;

//Class for Shopping Cart Total
public class ShoppingCart {
 public static void main(String[] args) {
     // Array storing the prices of 5 items
     double[] itemPrices = {12.5, 23.99, 7.89, 45.50, 30.75};

     // Variable to store the total bill
     double totalBill = 0;

     // Loop to calculate the total bill
     for (int i = 0; i < itemPrices.length; i++) {
         totalBill += itemPrices[i];
     }

     // Display the total bill
     System.out.println("Total Bill: $" + totalBill);
 }
}
