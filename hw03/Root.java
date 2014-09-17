/////////////////////////////////////////////////////////////////////////
// Kyle Hughes
// 9/16/14
// hw03
// Purpose: prompts the user to enter a double and  then prints out
// the first four digits to the right of the decimal point. 

// Imports Scanner class
import java.util.Scanner;

// defines class
public class Root{
    // main method
    public static void main(String[] args) {
      // declares an instance of the Scanner object
        Scanner myScanner;
        // calls the Scanner constructor(will take input from STDIN)
        myScanner = new Scanner( System.in );
        //ask for user imput
        System.out.print("Enter a double, and I print its cubed root: ");
        //saves input
        double x = myScanner.nextDouble();
        //variables
        double croot,croot1,croot2,croot3,croot4,croot5,value;
        //estimating cubed root
        croot = (x/3);
        croot1 = (2*croot*croot*croot+x)/(3*croot*croot);
        croot2 = (2*croot1*croot1*croot1+x)/(3*croot1*croot1);
        croot3 = (2*croot2*croot2*croot2+x)/(3*croot2*croot2);
        croot4 = (2*croot3*croot3*croot3+x)/(3*croot3*croot3);
        croot5 = (2*croot4*croot4*croot4+x)/(3*croot4*croot4);
        value = croot5*croot5*croot5;
        System.out.println("The cube root is "+croot5);
        System.out.println(croot5+"*"+croot5+"*"+croot5+"="+value);
    } //end method
}//end class