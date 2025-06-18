package OverLoading;

public class PaymentProcess {
	
	//CreditCard
	public void makePayment(String cardNumber, String CVV, String expiryDate) {
		System.out.println("Paid by Creditcard " +cardNumber);
	}
	
	//upi
	public void makePayment(String upiID) {
		System.out.println("Paid by upiID " +upiID);
	}
	
	//wallet
	public void makePayment(String walletID, int amount) {
		System.out.println("Paid by walletID " +walletID +"Amount:  "+amount);
	}
	
	public static void main(String[] args) {
		PaymentProcess obj =new PaymentProcess();
		
		obj.makePayment("6582956416552", "123", "02/5/25");
		obj.makePayment("upiid1233");
		obj.makePayment("fghjkl", 25000);

	}

}
