package NewJava;

public class Student {
			 // Fields
			 String name;
			 int rollNumber;
			 int marks;
			 
			 // Constructor
			 Student(String name, int roll, int marks) {
				 this.name =name;
				 this.rollNumber = roll;
				 this.marks = marks;
			 }
			 
			 //Method to display Student details
			 void displayDetails() {
				 System.out.println("Name: "+name);
				 System.out.println("Roll Number: "+rollNumber);
				 System.out.println("Marks: "+marks);
			 }
			 
			 //Method to check if student is passed
			 void checkPass() {
				 if(marks>40) {
					 System.out.println("Status: Passed");
				 } else {
					 System.out.println("Status: Failed");
				 }
			 }
			 
			 public static void main(String[] args) {
			 Student s1 = new Student("Amil", 101, 55);
			 s1.displayDetails();
			 s1.checkPass();
			 }

	}


