/////////////////////////////////////////////////////////////////////////]
//Kyle Hughes
//9/23/14
//hw03
//Purpose: reads in a 6 digit number, makes sure that it adheres to 
//the above description, and then prints out the semester and year.

// Imports Scanner class
import java.util.Scanner;

// defines class
public class CourseNumber{
  // main method
  public static void main(String[] args) {
    // declares an instance of the Scanner object
    Scanner myScanner;
    // calls the Scanner constructor(will take input from STDIN)
    myScanner = new Scanner( System.in );
    System.out.print("Enter a six digit number giving the course semester: ");
    int year=0,semester=0; //variables
    if(myScanner.hasNextInt()){//makes sure its an int
      int course=myScanner.nextInt();//saves input
      if(course<186510||course>201440){//validates range of input
        System.out.println("The number was outside the range [186510,201440]");
        System.exit(0);//terminates program
      }
      //equations
      year=(course/100);
      semester=(course%100);
      //loop to declare which semester 
      if(semester==10)
        System.out.println("The course was offered in the Spring semester of "+year);
      else if(semester==20)
        System.out.println("The course was offered in the Summer 1 semester of "+year);
      else if(semester==30)
        System.out.println("The course was offered in the Summer 2 semester of "+year);
      else if(semester==40)
        System.out.println("The course was offered in the Fall semester of "+year);
      else{
        System.out.println(semester+" is not a legitimate semester");
        System.exit(0);
      }
    }
  }   
}