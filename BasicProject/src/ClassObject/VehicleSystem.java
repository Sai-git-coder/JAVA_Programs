package ClassObject;

// Parent class
class Vehicle {
    int speed = 60;

    void displaySpeed() {
        System.out.println("Vehicle speed: " + speed + " km/h");
    }
}

// Child class
class Car extends Vehicle {
    int speed = 100;

    @Override
    void displaySpeed() {
        System.out.println("Speed of the car: " + speed + " km/h");         // Child class speed
        System.out.println("Speed of the Vehicle: " + super.speed + " km/h"); // Parent class speed
    }
}

// Main class
public class VehicleSystem {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.displaySpeed();  // Calls overridden method
    }
}
