/////////////////////////////////////////////////////////////////////////
//Kyle Hughes
//9/23/14
//hw05
//Purpose:has three boolean variables to each of which the value of true 
//or false is randomly assigned. Then, at random, combine the three variables 
//with random choices of && and || and stores the result.

import java.util.Scanner; //import scanner
public class BoolaBoola{// define a class
  public static void main(String[] args) {// main method 
    Scanner myScanner;
    myScanner=new Scanner(System.in);
    double a=Math.random();
    double b=Math.random();
    double c=Math.random(); 
    double d=Math.random();
    double e=Math.random(); 
    if (a<0.5){
      if(b<0.5){
        if(c<0.5){
          if(d<0.5){
            if(e<0.5){
              System.out.println("Does true || true || true have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("T")||x.equals("t")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }
            else{
              System.out.println("Does true || true && true have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("T")||x.equals("t")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }    
          }
          else{
            if(e<0.5){
              System.out.println("Does true && true || true have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("T")||x.equals("t")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }
            else{
              System.out.println("Does true && true && true have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("T")||x.equals("t")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }    
          }
        }
        else{
          if(d<0.5){
            if(e<0.5){
              System.out.println("Does true || true || false have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("T")||x.equals("t")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }
            else{
              System.out.println("Does true || true && false have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("F")||x.equals("f")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }    
          }
          else{
            if(e<0.5){
              System.out.println("Does true && true || false have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("T")||x.equals("t")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }
            else{
              System.out.println("Does true && true && false have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("F")||x.equals("f")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }    
          }
        }
      }
      else{
        if(c<0.5){
          if(d<0.5){
            if(e<0.5){
              System.out.println("Does true || false || true have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("T")||x.equals("t")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }
            else{
              System.out.println("Does true || false && true have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("T")||x.equals("t")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }    
          }
          else{
            if(e<0.5){
              System.out.println("Does true && false || true have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("T")||x.equals("t")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }
            else{
              System.out.println("Does true && false && true have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("F")||x.equals("f")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }    
          }
        }
        else{
          if(d<0.5){
            if(e<0.5){
              System.out.println("Does true || false || false have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("T")||x.equals("t")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }
            else{
              System.out.println("Does true || false && false have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("F")||x.equals("F")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }    
          }
          else{
            if(e<0.5){
              System.out.println("Does true && false || false have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("F")||x.equals("f")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }
            else{
              System.out.println("Does true && false && false have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("F")||x.equals("f")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }    
          }
        }
      }
    }
    else{
      if(b<0.5){
        if(c<0.5){
          if(d<0.5){
            if(e<0.5){
              System.out.println("Does false || true || true have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("T")||x.equals("t")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }
            else{
              System.out.println("Does false || true && true have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("T")||x.equals("t")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }    
          }
          else{
            if(e<0.5){
              System.out.println("Does false && true || true have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("T")||x.equals("t")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }
            else{
              System.out.println("Does false && true && true have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("F")||x.equals("f")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }    
          }
        }
        else{
          if(d<0.5){
            if(e<0.5){
              System.out.println("Does false || true || false have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("T")||x.equals("t")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }
            else{
              System.out.println("Does false || true && false have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("F")||x.equals("f")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }    
          }
          else{
            if(e<0.5){
              System.out.println("Does false && true || false have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("F")||x.equals("f")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }
            else{
              System.out.println("Does false && true && false have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("F")||x.equals("f")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }    
          }
        }
      }
      else{
        if(c<0.5){
          if(d<0.5){
            if(e<0.5){
              System.out.println("Does false || false || true have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("T")||x.equals("t")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }
            else{
              System.out.println("Does false || false && true have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("F")||x.equals("f")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }    
          }
          else{
            if(e<0.5){
              System.out.println("Does false && false || true have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("T")||x.equals("t")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }
            else{
              System.out.println("Does false && false && true have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("F")||x.equals("f")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }    
          }
        }
        else{
          if(d<0.5){
            if(e<0.5){
              System.out.println("Does false || false || false have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("F")||x.equals("f")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }
            else{
              System.out.println("Does false || false && false have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("F")||x.equals("f")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }    
          }
          else{
            if(e<0.5){
              System.out.println("Does false && false || false have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("F")||x.equals("f")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }
            else{
              System.out.println("Does false && false && false have the value true(T/t) or false(F/f)? ");
              String x= myScanner.next();
              if(x.equals("F")||x.equals("f")){
                System.out.println("Correct");
              }
              else{
                System.out.println("Wrong: try again");
              }
            }    
          }
        }
      }
    }
  }//end of method
}//end of class
