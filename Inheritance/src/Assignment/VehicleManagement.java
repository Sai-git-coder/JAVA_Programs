package Assignment;

import java.util.Scanner;

//Base class Vehicle
class Vehicle {
 protected String make;
 protected String model;
 protected int year;

 public Vehicle(String make, String model, int year) {
     this.make = make;
     this.model = model;
     this.year = year;
 }

 public void displayInfo() {
     System.out.println("Make: " + make);
     System.out.println("Model: " + model);
     System.out.println("Year: " + year);
 }
}

//Derived class Car
class Car extends Vehicle {
 private double trunkCapacity;

 public Car(String make, String model, int year, double trunkCapacity) {
     super(make, model, year);
     this.trunkCapacity = trunkCapacity;
 }

 @Override
 public void displayInfo() {
     System.out.println("[Car]");
     super.displayInfo();
     System.out.println("Trunk Capacity: " + trunkCapacity + " cubic feet");
 }
}

//Derived class Truck
class Truck extends Vehicle {
 private String loadCapacity;

 public Truck(String make, String model, int year, String loadCapacity) {
     super(make, model, year);
     this.loadCapacity = loadCapacity;
 }

 @Override
 public void displayInfo() {
     System.out.println("[Truck]");
     super.displayInfo();
     System.out.println("Load Capacity: " + loadCapacity);
 }
}

//Main class to test the scenario
public class VehicleManagement {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Vehicle Type (Car/Truck): ");
     String type = scanner.nextLine();

     System.out.print("Make: ");
     String make = scanner.nextLine();

     System.out.print("Model: ");
     String model = scanner.nextLine();

     System.out.print("Year: ");
     int year = scanner.nextInt();
     scanner.nextLine(); // consume newline

     if (type.equalsIgnoreCase("Car")) {
         System.out.print("Trunk Capacity (in cubic feet): ");
         double trunkCapacity = scanner.nextDouble();
         Car car = new Car(make, model, year, trunkCapacity);
         car.displayInfo();
     } else if (type.equalsIgnoreCase("Truck")) {
         System.out.print("Load Capacity: ");
         String loadCapacity = scanner.nextLine();
         Truck truck = new Truck(make, model, year, loadCapacity);
         truck.displayInfo();
     } else {
         System.out.println("Invalid vehicle type.");
     }

     scanner.close();
 }
}
