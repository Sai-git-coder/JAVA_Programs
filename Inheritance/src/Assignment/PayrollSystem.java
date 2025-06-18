package Assignment;

import java.util.Scanner;

//Base class Employee
class Employee {
 protected String name;
 protected int id;
 protected double basicSalary;

 public Employee(String name, int id) {
     this.name = name;
     this.id = id;
 }

 public void displayDetails() {
     System.out.println("Employee: " + name + " (ID: " + id + ")");
 }

 public double calculateSalary() {
     return basicSalary;
 }
}

//Derived class for Full-time Employee
class FullTimeEmployee extends Employee {
 private double benefits;

 public FullTimeEmployee(String name, int id, double basicSalary, double benefits) {
     super(name, id);
     this.basicSalary = basicSalary;
     this.benefits = benefits;
 }

 @Override
 public double calculateSalary() {
     return basicSalary + benefits;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Type: Full-time");
     System.out.println("Total Salary: ₹" + calculateSalary());
 }
}

//Derived class for Part-time Employee
class PartTimeEmployee extends Employee {
 private double hourlyRate;
 private int hoursWorked;

 public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
     super(name, id);
     this.hourlyRate = hourlyRate;
     this.hoursWorked = hoursWorked;
 }

 @Override
 public double calculateSalary() {
     return hourlyRate * hoursWorked;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Type: Part-time");
     System.out.println("Total Salary: ₹" + calculateSalary());
 }
}

//Main class to run the payroll system
public class PayrollSystem {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Employee Type (FullTimeEmployee/PartTimeEmployee): ");
     String type = scanner.nextLine();

     System.out.print("Name: ");
     String name = scanner.nextLine();

     System.out.print("ID: ");
     int id = scanner.nextInt();

     if (type.equalsIgnoreCase("FullTimeEmployee")) {
         System.out.print("Basic Salary: ");
         double basic = scanner.nextDouble();

         System.out.print("Benefits: ");
         double benefits = scanner.nextDouble();

         FullTimeEmployee ft = new FullTimeEmployee(name, id, basic, benefits);
         ft.displayDetails();
     } else if (type.equalsIgnoreCase("PartTimeEmployee")) {
         System.out.print("Hourly Rate: ");
         double rate = scanner.nextDouble();

         System.out.print("Hours Worked: ");
         int hours = scanner.nextInt();

         PartTimeEmployee pt = new PartTimeEmployee(name, id, rate, hours);
         pt.displayDetails();
     } else {
         System.out.println("Invalid employee type.");
     }

     scanner.close();
 }
}

