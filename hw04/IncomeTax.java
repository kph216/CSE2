///////////////////////////////////////////////////////////////////////
//Kyle Hughes
//9/23/14
//hw03
//Purpose: prompts the user to enter an int that gives the thousands 
//of dollars of income and then writes out the amount of tax on the 
//income, given the following (progressive) schedule:  <20, 5%;  >=20 
//and < 40, 7%; >=40 and < 78, 12%; >=78, 14%.

// Imports Scanner class
import java.util.Scanner;

// defines class
public class IncomeTax{
  // main method
  public static void main(String[] args) {
    // declares an instance of the Scanner object
    Scanner myScanner;
    // calls the Scanner constructor(will take input from STDIN)
    myScanner = new Scanner( System.in );
    //user input
    System.out.print("Enter an int giving the number of thousands- ");
    
    
    if(myScanner.hasNextInt()){ //makes sure its an int
      int number = myScanner.nextInt(); //saves input
      //variables
      double val,tRate = 0,tax;
      if (number < 0){ //validate if number is postive
        System.out.println("You did not enter a positive int");
        System.exit(0);// terminates program
      }
      else if(number <20)
        tRate = 5.0;
      else if(number >=20 && number <40)
        tRate = 7.0;
      else if(number >=40 && number <78)
        tRate = 12.0  ;
      else {
        tRate = 14.0;
    }
      tax = (double)((int)((tRate/100)*number));
      //prints out outcome of code
       System.out.println("The tax rate on $"+number+",000 is "+tRate+"%, and the tax is $"+tax);
    }
    else // validate if number is an intege
      System.out.println("You did not enter an int");
  }
}