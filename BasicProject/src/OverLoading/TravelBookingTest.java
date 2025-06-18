package OverLoading;

//TravelBooking class with overloaded methods to book tickets
class TravelBooking {

 // Method to book a bus ticket
 public void bookTicket(String busNumber, String date) {
     System.out.println("Bus ticket booked. Bus Number: " + busNumber + ", Date: " + date);
 }

 // Method to book a flight ticket with class type
 public void bookTicket(String flightNumber, String date, String seatClass) {
     System.out.println("Flight ticket booked. Flight Number: " + flightNumber + ", Date: " + date + ", Seat Class: " + seatClass);
 }

 // Method to book a train ticket with coach number
 public void bookTicket(String trainNumber, String date, int coachNumber) {
     System.out.println("Train ticket booked. Train Number: " + trainNumber + ", Date: " + date + ", Coach Number: " + coachNumber);
 }
}

//Main class to test the TravelBooking methods
public class TravelBookingTest {
 public static void main(String[] args) {
     // Create an instance of TravelBooking
     TravelBooking booking = new TravelBooking();

     // Book a bus ticket
     booking.bookTicket("B123", "2025-06-15");

     // Book a flight ticket
     booking.bookTicket("F456", "2025-06-20", "Business");

     // Book a train ticket
     booking.bookTicket("T789", "2025-06-25", 3);
 }
}

