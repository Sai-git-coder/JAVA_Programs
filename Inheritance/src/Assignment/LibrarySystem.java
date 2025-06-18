package Assignment;

import java.util.Scanner;

//Base class Book
class Book {
 protected String title;
 protected String author;
 protected String isbn;

 public Book(String title, String author, String isbn) {
     this.title = title;
     this.author = author;
     this.isbn = isbn;
 }

 public void displayDetails() {
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
     System.out.println("ISBN: " + isbn);
 }
}

//Derived class ScienceBook
class ScienceBook extends Book {
 private String fieldOfStudy;

 public ScienceBook(String title, String author, String isbn, String fieldOfStudy) {
     super(title, author, isbn);
     this.fieldOfStudy = fieldOfStudy;
 }

 @Override
 public void displayDetails() {
     System.out.println("[Science Book]");
     super.displayDetails();
     System.out.println("Field of Study: " + fieldOfStudy);
 }
}

//Derived class NovelBook
class NovelBook extends Book {
 private String genre;

 public NovelBook(String title, String author, String isbn, String genre) {
     super(title, author, isbn);
     this.genre = genre;
 }

 @Override
 public void displayDetails() {
     System.out.println("[Novel Book]");
     super.displayDetails();
     System.out.println("Genre: " + genre);
 }
}

//Main class to test the scenario
public class LibrarySystem {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Add Book Type (ScienceBook/NovelBook): ");
     String bookType = scanner.nextLine();

     System.out.print("Title: ");
     String title = scanner.nextLine();

     System.out.print("Author: ");
     String author = scanner.nextLine();

     System.out.print("ISBN: ");
     String isbn = scanner.nextLine();

     if (bookType.equalsIgnoreCase("ScienceBook")) {
         System.out.print("Field of Study: ");
         String field = scanner.nextLine();
         ScienceBook sb = new ScienceBook(title, author, isbn, field);
         sb.displayDetails();
     } else if (bookType.equalsIgnoreCase("NovelBook")) {
         System.out.print("Genre: ");
         String genre = scanner.nextLine();
         NovelBook nb = new NovelBook(title, author, isbn, genre);
         nb.displayDetails();
     } else {
         System.out.println("Invalid book type.");
     }

     scanner.close();
 }
}
