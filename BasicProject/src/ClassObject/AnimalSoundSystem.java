package ClassObject;

// Base class
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Derived class
class Dog extends Animal {
    @Override
    void makeSound() {
        super.makeSound();  // Call parent class method
        System.out.println("Bark!");
    }
}

// Main class
public class AnimalSoundSystem {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
