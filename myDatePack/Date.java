package myDatePack;

import java.time.LocalDate; // import the LocalDate class
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 

public class Date {
  public static void main(String[] args) {
    LocalDate myObj = LocalDate.now(); // Create a date object
    LocalTime myObj2 = LocalTime.now();
    LocalDateTime myObj3 = LocalDateTime.now();
    System.out.println(myObj +"\n"+myObj2); // Display the current date
    System.out.println(myObj3);


    LocalDateTime myObj4 = LocalDateTime.now();
    System.out.println("Before formatting: " + myObj4);
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String formattedDate = myObj4.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);
  }
}