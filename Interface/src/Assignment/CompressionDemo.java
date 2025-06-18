package Assignment;

import java.util.Scanner;

//Define the Compressor interface
interface Compressor {
 void compress(String fileName);
 double getCompressionRatio();
}

//Implement ZipCompressor class
class ZipCompressor implements Compressor {
 private double ratio = 1.8;

 public void compress(String fileName) {
     System.out.println("Compressing " + fileName + " using ZIP...");
 }

 public double getCompressionRatio() {
     return ratio;
 }
}

//Implement RarCompressor class
class RarCompressor implements Compressor {
 private double ratio = 2.2;

 public void compress(String fileName) {
     System.out.println("Compressing " + fileName + " using RAR...");
 }

 public double getCompressionRatio() {
     return ratio;
 }
}

//Main class to run the compression demo
public class CompressionDemo {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Choose compression type (ZIP/RAR): ");
     String type = scanner.nextLine();

     System.out.print("File to compress: ");
     String fileName = scanner.nextLine();

     Compressor compressor;

     if (type.equalsIgnoreCase("ZIP")) {
         compressor = new ZipCompressor();
     } else if (type.equalsIgnoreCase("RAR")) {
         compressor = new RarCompressor();
     } else {
         System.out.println("Invalid compression type.");
         scanner.close();
         return;
     }

     compressor.compress(fileName);
     System.out.println("Compression Ratio: " + compressor.getCompressionRatio());

     scanner.close();
 }
}
