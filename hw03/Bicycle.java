///////////////////////////////////////////////////////////////////////////
// Kyle Hughes
// 9/16/14
// hw03
// Purpoes : Prompts the user to enter two digits, the first giving the number 
// of counts on a cyclometer and the second giving the number of seconds during
// which the counts occurred, and then an then prints out the distance
// traveled and the average miles per hour.

// This will import just the Scanner class.
import java.util.Scanner; 
// defines class
public class Bicycle{
    // main method
    public static void main(String[] args) {

      // declares an instance of the Scanner object
        Scanner myScanner;
        
        // calls the Scanner constructor(will take input from STDIN)
        myScanner = new Scanner( System.in );
        //data
          double wheelDiameter=27.0, //
            PI=3.14159, // value of pie
            feetPerMile=5280, // conversion for feet per mile
            inchesPerFoot=12, //conversion for inches per foot
            secondsPerMinute=60, //conversion for seconds per minute
            minutePerHour=60; 
        double distance0,minutes,avgmph0;
        //ask for user imput
        System.out.print("Enter the number of seconds: ");
        //saves input
        int seconds = myScanner.nextInt();
        System.out.print("Enter the number of counts: ");
        int counts = myScanner.nextInt();
        //equations
        distance0 = counts*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        minutes = (seconds/secondsPerMinute);
        avgmph0 = (distance0/(minutes/minutePerHour));
        //conversions to make decimals look better
        double distance = distance0*100.00;
        double avgmph = avgmph0*100.00;
        int i=(int)distance;
        int j=(int)avgmph;
        double distance1 = i/100.00;
        double avgmph1 = j/100.00;
        //prints distance and average mph
        System.out.println("The distance was "+distance1+" miles and took "
        +minutes+" minutes.");
        System.out.println("The average mph was "+avgmph1);
    } //end of main method
} //end of class    