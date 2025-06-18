package Assignment;

import java.util.Scanner;

//Define the SmartDevice interface
interface SmartDevice {
 void turnOn();
 void turnOff();
 void status();
}

//Implement SmartLight class
class SmartLight implements SmartDevice {
 private boolean isOn = false;

 public void turnOn() {
     isOn = true;
     System.out.println("SmartLight is now ON.");
 }

 public void turnOff() {
     isOn = false;
     System.out.println("SmartLight is now OFF.");
 }

 public void status() {
     System.out.println("SmartLight is currently " + (isOn ? "ON" : "OFF") + ".");
 }
}

//Implement SmartFan class
class SmartFan implements SmartDevice {
 private boolean isOn = false;

 public void turnOn() {
     isOn = true;
     System.out.println("SmartFan is now ON.");
 }

 public void turnOff() {
     isOn = false;
     System.out.println("SmartFan is now OFF.");
 }

 public void status() {
     System.out.println("SmartFan is currently " + (isOn ? "ON" : "OFF") + ".");
 }
}

//Main class to control the devices
public class SmartHomeDemo {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Choose device (SmartLight/SmartFan): ");
     String deviceChoice = scanner.nextLine();

     SmartDevice device;

     if (deviceChoice.equalsIgnoreCase("SmartLight")) {
         device = new SmartLight();
     } else if (deviceChoice.equalsIgnoreCase("SmartFan")) {
         device = new SmartFan();
     } else {
         System.out.println("Invalid device selected.");
         scanner.close();
         return;
     }

     System.out.print("Action (Turn On/Turn Off/Status): ");
     String action = scanner.nextLine();

     switch (action.toLowerCase()) {
         case "turn on":
             device.turnOn();
             break;
         case "turn off":
             device.turnOff();
             break;
         case "status":
             device.status();
             break;
         default:
             System.out.println("Invalid action.");
     }

     scanner.close();
 }
}
