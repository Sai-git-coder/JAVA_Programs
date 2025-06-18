package OverRidding;

//Base class Vehicle
class Vehicle {

 // Method to represent movement of a vehicle
 public void move() {
     System.out.println("The vehicle moves.");
 }
}

//Subclass Car, which overrides move() method
class Car extends Vehicle {

 // Overriding move() method to display specific message for Car
 @Override
 public void move() {
     System.out.println("The car drives on roads.");
 }
}

//Subclass Boat, which overrides move() method
class Boat extends Vehicle {

 // Overriding move() method to display specific message for Boat
 @Override
 public void move() {
     System.out.println("The boat sails on water.");
 }
}

//Main class to test the method overriding
public class TransportationSystem {
 public static void main(String[] args) {
     // Creating Vehicle reference for Car
     Vehicle vehicle1 = new Car();
     vehicle1.move();  // Calls Car's overridden move() method

     // Creating Vehicle reference for Boat
     Vehicle vehicle2 = new Boat();
     vehicle2.move();  // Calls Boat's overridden move() method
 }
}

