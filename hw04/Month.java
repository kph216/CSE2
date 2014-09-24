///////////////////////////////////////////////////////////////////////
//Kyle Hughes
//9/23/14
//hw03
//Purpose: prompts the user to enter an integer for the month 
//(1 for January, 2 for February, etc.)  and then displays the number 
//of days in the month).  If the number 2 is entered (February) the 
//user is then asked to enter the year.

// Imports Scanner class
import java.util.Scanner;

// defines class
public class Month{
  // main method
  public static void main(String[] args) {
    // declares an instance of the Scanner object
    Scanner myScanner;
    // calls the Scanner constructor(will take input from STDIN)
    myScanner = new Scanner( System.in );
    System.out.print("Enter an int giving the number of the month (1-12) :");
    //variables
    int days=0;
    if(myScanner.hasNextInt()){ //makes sure its an int
      int month = myScanner.nextInt(); //saves input
      System.out.print("Enter an int giving the year ");
      int year = myScanner.nextInt(); //saves input
      //leap year
      boolean isLeapYear = (year % 4 == 0 && year % 100 != 0)||(year % 400 == 0); 
      //makes sure month is between 1-12 and outpputs days in month
      if (month<1||month>12){ //validate if int is in range
        System.out.println("You did not enter an int between 1 and 12");
        System.exit(0);//terminates program
      }
      if (year<0){ //validate if int is in range
        System.out.println("You did not enter a positive year");
        System.exit(0);//terminates program
      }
      //lopp to make
      if (month ==1&&month==3&&month==5&&month==7&&month==8&&month==10&&month==12)
        days=31;
      else if (month==2)
        days=28;
      else 
        days=30;
      if(isLeapYear&&month==2)
        days=29;
      System.out.println("The month has "+days);
    }
  }
}