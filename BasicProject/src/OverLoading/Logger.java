package OverLoading;

//Logger class with overloaded log methods
public class Logger {

 // Method to log a basic informational message
 public void log(String message) {
     System.out.println("INFO: " + message);
 }

 // Method to log a message with a custom log level
 public void log(String message, String level) {
     System.out.println(level.toUpperCase() + ": " + message);
 }

 // Method to log a message with a custom log level and user information
 public void log(String message, String level, String user) {
     System.out.println(level.toUpperCase() + " by " + user + ": " + message);
 }

 // Main method to test the Logger methods
 public static void main(String[] args) {
     // Create an instance of Logger
     Logger logger = new Logger();

     // Test the log method with a basic message
     logger.log("System started.");

     // Test the log method with a custom log level
     logger.log("Disk space is low.", "warning");

     // Test the log method with a custom log level and user information
     logger.log("Failed login attempt.", "error", "admin");
 }
}

