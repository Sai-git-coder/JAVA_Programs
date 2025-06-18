package Encapsulation;

public class CarRental {
	
	private String model;
	private String ResgNo;
	private boolean isAvailable;
	
	public CarRental (String model,String ResgNo,boolean isAvailable) {
		this.model = model;
		this.ResgNo = ResgNo;
		this.isAvailable=isAvailable;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getResgNo() { // get and set
		return ResgNo;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}
	
	public void rentCar()//action
	{
if (isAvailable) {
			isAvailable=true;
			System.out.println(model + " " + ResgNo + "is available");
} else {
	System.out.println(model + " " + ResgNo + "is already taken");
}
  }
	public static void main(String[] args) {
		
		CarRental obj = new CarRental("Tata", "TN4052632431", true);
		
		System.out.println("CarModel: " + obj.getModel());
		System.out.println("RegNo: " + obj.getResgNo());
		System.out.println("Is the car Available? : " + obj.isAvailable());
		
		obj.rentCar(); // try renting
		
		// TODO Auto-generated method stub

	}

}
