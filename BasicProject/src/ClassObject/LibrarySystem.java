package ClassObject;

// Base class
class LibraryItem {
    String title;

    LibraryItem(String title) {
        this.title = title;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
    }
}

// Derived class
class Book extends LibraryItem {
    String author;

    Book(String title, String author) {
        super(title);        // Call parent constructor
        this.author = author;
    }

    @Override
    void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Author: " + author);
    }
}

// Main class
public class LibrarySystem {
    public static void main(String[] args) {
        Book book = new Book("Java Basics", "James Gosling");
        book.displayInfo();
    }
}
