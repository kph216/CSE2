//////////////////////////////////////////////////////////////////////
//Kyle Hughes
//9/23/14
//hw03
//Purpose: has the user enter an positive integer giving the number
//of seconds that have passed during the day and then displays the 
//time in conventional form.

// Imports Scanner class
import java.util.Scanner;

// defines class
public class TimePadding{
  // main method
  public static void main(String[] args) {
    // declares an instance of the Scanner object
    Scanner myScanner;
    // calls the Scanner constructor(will take input from STDIN)
    myScanner = new Scanner( System.in );
    if(myScanner.hasNextInt()){
      System.out.print("Enter the time in seconds: ");
      int secs = myScanner.nextInt(); //saves input
      int hrs = secs / 3600;
      int remain = secs % 3600;
      int mins = remain / 60; 
      secs = remain % 60; 
      String hours = (hrs < 10 ? "0" : "") + hrs, 
        minutes = (mins < 10 ? "0" : "") + mins , 
        seconds = (secs < 10 ? "0" : "") + secs ; 
      System.out.println("The time is "+hours+":"+minutes+":"+seconds);
    }
  }
}

