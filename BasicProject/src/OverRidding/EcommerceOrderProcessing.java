package OverRidding;

//Superclass Order
class Order {

 // Method to process a general order (generic message)
 public void processOrder() {
     System.out.println("Processing general order...");
 }
}

//Subclass OnlineOrder that overrides processOrder()
class OnlineOrder extends Order {

 // Overriding processOrder() method for online orders
 @Override
 public void processOrder() {
     System.out.println("Processing online order with digital invoice...");
 }
}

//Subclass InStoreOrder that overrides processOrder()
class InStoreOrder extends Order {

 // Overriding processOrder() method for in-store orders
 @Override
 public void processOrder() {
     System.out.println("Processing in-store order with printed receipt...");
 }
}

//Main class to test the method overriding
public class EcommerceOrderProcessing {
 public static void main(String[] args) {
     // Creating Order reference for OnlineOrder
     Order order1 = new OnlineOrder();
     order1.processOrder();  // Calls OnlineOrder's overridden processOrder()

     // Creating Order reference for InStoreOrder
     Order order2 = new InStoreOrder();
     order2.processOrder();  // Calls InStoreOrder's overridden processOrder()
 }
}
