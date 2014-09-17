////////////////////////////////////////////////////////////////////////
// Kyle Hughes
// 9/16/14
// hw03
// Purpose: prompts the user to enter a double and then prints out a
// crude estimate of the cube root of the number and the value of this 
// crude guess when cubed.

// Imports Scanner class
import java.util.Scanner;

// defines class
public class FourDigits{
    // main method
    public static void main(String[] args) {
      // declares an instance of the Scanner object
        Scanner myScanner;
        // calls the Scanner constructor(will take input from STDIN)
        myScanner = new Scanner( System.in );
        //ask for user imput
        System.out.print("Enter a double and I display the 4 digits to the right of the decimal point: ");
        //saves input
        double val = myScanner.nextDouble();
        //display four digits past decimal
        int val1= (int) val;
        double valf=(val-val1)*10000;
        int valf1=(int) valf;
        
        System.out.println("The four digits are :"+valf1);
    }//end method
}//end class        