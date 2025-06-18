package CompileTime;

public class PaymentProcessor {
	// Method1: Pay by amount only
	void makePayment(double amount) {
		System.out.println("Paid $" + amount);
	}
	// Method2: Pay by amount and currency 
		void makePayment(double amount, String currency) {
		System.out.println("Paid $" + currency + amount);
	}
	// Method3: Pay by amount and discount 
		void makePayment(double amount, double discount) {
			double finalAmount = amount - discount;
		System.out.println("Paid $" + finalAmount + "after discount");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentProcessor process = new PaymentProcessor();
		process.makePayment(1000); // Calls method 1
		process.makePayment(200.2, "$"); // Calls method 2
		process.makePayment(500,50); // Calls method 3

	}

}
