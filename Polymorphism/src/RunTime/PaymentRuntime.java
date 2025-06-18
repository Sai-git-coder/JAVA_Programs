package RunTime;

public class PaymentRuntime {
	void pay() {
		System.out.println("Generic payment processed");
	}
}
class CreditCardPayment extends PaymentRuntime {
	void pay() {
		super.pay();
		System.out.println("Payment done via Credit Card");
	}
}
class UPIPayment extends PaymentRuntime {
	void pay() {
		System.out.println("Payment done via UPI");
	}
	public static void main(String[] args) {
		PaymentRuntime payment;
		
		payment = new CreditCardPayment();
		payment.pay();
		
		payment = new UPIPayment();
		payment.pay();
		
	}

}
