package OverRidding;

//Superclass Employee
class Employee {

 // Method to calculate the base salary (generic message)
 public void calculateSalary() {
     System.out.println("Calculating base salary...");
 }
}

//Subclass FullTimeEmployee that overrides calculateSalary()
class FullTimeEmployee extends Employee {

 // Overriding calculateSalary() method for full-time employees
 @Override
 public void calculateSalary() {
     System.out.println("Calculating full-time salary with benefits...");
 }
}

//Subclass PartTimeEmployee that overrides calculateSalary()
class PartTimeEmployee extends Employee {

 // Overriding calculateSalary() method for part-time employees
 @Override
 public void calculateSalary() {
     System.out.println("Calculating part-time salary based on hours...");
 }
}

//Main class to test the method overriding
public class EmployeeSalaryCalculation {
 public static void main(String[] args) {
     // Creating Employee reference for FullTimeEmployee
     Employee emp1 = new FullTimeEmployee();
     emp1.calculateSalary();  // Calls FullTimeEmployee's overridden calculateSalary()

     // Creating Employee reference for PartTimeEmployee
     Employee emp2 = new PartTimeEmployee();
     emp2.calculateSalary();  // Calls PartTimeEmployee's overridden calculateSalary()
 }
}
