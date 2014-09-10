/////////////////////////////////////////////////////////////////////////
// Kyle Hughes
// 9/10/14
// lab03
// Purpose: Computes the cost of buying Big Mac's in PA

// Imports Scanner class
import java.util.Scanner;

// defines class
public class BigMac{
    // main method
    public static void main(String[] args) {
      
      // declares an instance of the Scanner object
        Scanner myScanner;
        
        // calls the Scanner constructor(will take input from STDIN)
        myScanner = new Scanner( System.in );
        
        // user enters number of Big Mac's bought
        System.out.print("Enter the number of Big Macs (an integer > 0): ");
        
        // calls a method that Scanner objects have
        int nBigMacs = myScanner.nextInt(); 
        
        // user enters values asked 
        System.out.print("Enter the cost per Big Mac as "+
        " a double (in the form xx.xx): ");
        double bigMac$ = myScanner.nextDouble(); // saves input by user to code
        System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble(); // saves input by user to code
        taxRate/=100; // user enters percent, but I want proportion
        // the cost of the Big Macs 
        double cost$;
        int dollars, //whole dollar amount of cost
                dimes, pennies; //storing digits
                    //to the right of the decimal pt
                    //for the cost$
        cost$ = nBigMacs*bigMac$*(1+taxRate);
        //get the whole amount, dropping decimal fraction
        dollars=(int)cost$;
        //get dimes amount
        //(int)(6.73*10)%10->7
        //where the % (mod) operator returns the remainder
        //after the divisoin; 583%100->83,27%5->2
        dimes=(int)(cost$*10)%10;
        pennies=(int)(cost$*10)%10;
        System.out.println("The total cost of " +nBigMacs+ " BigMacs, at $"
        +bigMac$+" per bigMac, which a"+" sales tax of "
        +(int)(taxRate*100)+"%, is $"+dollars+'.'+(dimes+pennies));
    } // end of main method
} // end of class