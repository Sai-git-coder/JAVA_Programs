package ClassObject;

// Parent class
class Teacher {
    String name = "Mrs. Kapoor";

    void teach() {
        System.out.println("Teaching general subjects.");
    }
}

// Child class
class SubjectTeacher extends Teacher {
    String name = "Mr. Sharma";

    @Override
    void teach() {
        super.teach(); // Call parent class method
        System.out.println("Teaching Mathematics.");
    }

    void showNames() {
        System.out.println("Parent name: " + super.name); // Access parent variable
        System.out.println("Child name: " + name);        // Access child variable
    }
}

// Main class with main method
public class SchoolSystem {
    public static void main(String[] args) {
        SubjectTeacher obj = new SubjectTeacher();
        obj.teach();
        obj.showNames();
    }
}
