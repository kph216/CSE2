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
System.out.print("Enter the time in seconds: ");
if(myScanner.hasNextInt()){
int secs = myScanner.nextInt(); //saves input
int hrs = secs / 3600;
int remain = secs % 3600;
int mins = remain / 60;
secs = remain % 60;

String hours = (hrs < 10 ? "0" : "") + hrs;
String minutes = (mins < 10 ? "0" : "") + mins ;
String seconds = (secs < 10 ? "0" : "") + secs ;
System.out.println("The time is "+hours+":"+minutes+":"+seconds);
}
}
}