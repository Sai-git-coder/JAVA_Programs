package NewJava;

public class Employee {
			 
			 //Fields
			 String name;
			 int id;
			 double monthlySalary;
			 
			 //Constructors
			 Employee(String name, int id, double salary) {
				 this.name = name;
				 this.id = id;
				 this.monthlySalary = salary;
			 }
			 
			 // Method to display employee details
			 void displayInfo() {
				 System.out.println("Employee Name: " +name);
				 System.out.println("Employee ID: "+id);
				 System.out.println("Monthly Salary: $" + monthlySalary);
			 }
			 
			 // Method to calculate and display annual salary
			 void calculateAnnualSalary() {
				 double annualSalary = monthlySalary * 12;
				 System.out.println("Annual Salary: $"+annualSalary);
			 }
	
	public static void main(String[] args) {
		Employee emp1 = new Employee("Priya", 2001, 45000.0);
		emp1.displayInfo();
		emp1.calculateAnnualSalary();

	}

}
