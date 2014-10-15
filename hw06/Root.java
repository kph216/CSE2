/////////////////////////////////////////////////////////////////////////////
//Kyle Hughes
//10/14/14
//hw06
//Purpose: a Java program that forces the user to enter a double that is
//greater than 0, uses the above algorithm to compute the square root of
//the number, and then prints it out. Use 0.0000001 as the “tolerance” for
//stopping the loop that computes the square root. 

import java.util.Scanner; //import scanner
public class Root{ //define a class
  public static void main(String[] args) { // main method 
    Scanner myScanner;//decalare 
    myScanner=new Scanner(System.in);//accept input
    System.out.print("Enter a double that is greater than zero- ");
    double a=myScanner.nextDouble();
    double hi=a+1;
    double low=0;
    double midd=(a+1)/2;
    double range=0.0000001*(1+a);
    while((hi-low)>range){
      if ((midd*midd)>a){
        hi=midd;}
      else{
        low=midd;}
      midd=(hi+low)/2;
    }
    System.out.println("The square root of x lies in ["+low+","+hi+"]");
    
  }//end of main method
}//end of class