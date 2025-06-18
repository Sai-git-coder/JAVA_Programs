package ClassObject;

// Base class
class Doctor {
    void duty() {
        System.out.println("General medical duties");
    }
}

// Derived class
class Surgeon extends Doctor {
    @Override
    void duty() {
        super.duty();  // Call parent class method
        System.out.println("Performing surgeries");
    }
}

// Main class
public class HospitalSystem {
    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon();
        surgeon.duty();
    }
}
