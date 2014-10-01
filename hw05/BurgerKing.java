/////////////////////////////////////////////////////////////////////////]
//Kyle Hughes
//9/23/14
//hw05
//Purpose: prompts the user to enter a choice of a burger, a soda, or 
//fries. Then the program prompts the users for details of their choices. 

import java.util.Scanner; //import scanner
// define a class
public class BurgerKing{
  // main method 
  public static void main(String[] args) {
    Scanner myScanner;
    myScanner=new Scanner(System.in);
    System.out.println("Enter a letter to indicate a choice of ");
    System.out.println("Burger (B or b)");
    System.out.println("Soda (S or s)");
    System.out.println("Fries (F or f)");
    String x=myScanner.next();
    if (x.length()==1){ //is it a single character
      char choice=x.charAt(0);   
      switch(choice){
        case'B':
        case'b': //if B or b is entered print
          System.out.println("Enter A or a for ''all the fixins''");
          System.out.println("C or c for cheese");
          System.out.println("N or n for none of the above"); 
          String choice1=myScanner.next();//read the next input
          char toppings=choice1.charAt(0);
          switch(toppings){
            case'A':
            case'a':
              System.out.println("You ordered a burger with all fixings");
              break;
            case'C':
            case'c':
              System.out.println("You ordered a burger with cheese");
              break;
            case'N':
            case'n':
              System.out.println("You ordered a burger");
              break;
            default:
              System.out.println("You did not enter A/a/C/c/N/n");
          }//end of switch
          break;
        case'S':
        case's': //if S or s is entered print
          System.out.println("Do you want Pepsi (p or P),");
          System.out.println("Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)-");
          String choice3=myScanner.next();//read the next input
          char soda=choice3.charAt(0);
          switch(soda){
            case'P':
            case'p':
              System.out.println("You ordered a Pepsi");
              break;
            case'C':
            case'c':
              System.out.println("You ordered a Coke");
              break;
            case'S':
            case's':
              System.out.println("You ordered a Sprite");
              break;
            case'M':
            case'm':
              System.out.println("You ordered a Mountain Dew");
              break;
            default:
              System.out.println("You did not enter P/p/C/c/S/s/M/m");
          }//end of switch 
          break;
        case'F':
        case'f': //if S or s is entered print
          System.out.println("Do you want a large or small order of fries (l,L,s, or S)-");
          String choice5=myScanner.next();//read the next input
          char fries=choice5.charAt(0);
          switch(fries){
            case'L':
            case'l':
              System.out.println("You ordered large fries");
              break;
            case'S':
            case's':
              System.out.println("You ordered small fries");
              break;
            default:
              System.out.println("You did not enter L/l/S/s");
          }//end of switch
        default:
          System.out.println("You did not enter B/b/S/s/F/f");
      }
    }
    else{ //print if not given single character
      System.out.println("a single character expected");
      System.exit(0);
    }
    
  }//end of main mehtod
  
}//end of class
