/////////////////////////////////////////////////////////
//Kyle Hughes
//Hw08
//10/28/14
//Purpose: Add definitions to the already written program to get the ouput needed.

import java.util.Scanner;
public class HW8{
  public static char getInput(Scanner scan,String r ){
    int a=0;
    char b;
    char input='d';
    String s=scan.next();
    while (input=='d'){
      while(s.length()!=1){
        System.out.print("You should enter exactly one character-");
        s=scan.next();
      }
      while (a<r.length()){
        b=r.charAt(a);
        if(s.charAt(0)==b){
          input=b;
          break;}
        a++;
      }
      if(input=='d'){
        System.out.print("You did not enter a character from the list '"+r+"'; try again- ");
        s=scan.next();
        a=0;}
    }
    return input;
  }
  public static char getInput(Scanner scan,String r,int done ){
    int a=0;
    char b;
    char input='d';
    int c=0;
    String s=scan.next();
    while(input=='d'){
      while (c<done){ 
        while(s.length()!=1){
          System.out.print("You should enter exactly one character-");
          s=scan.next();
          c++;
          if (c==done){
            System.out.println('\n'+"You failed after 5 tries");
            c=0;
            break;
          }
        }
        while (a<r.length()){
          b=r.charAt(a);
          if(s.charAt(0)==b){
            input=b;
            c=done+1;
            break;
          }
          a++;
        }
        if(input=='d'){
          System.out.print("You did not enter a character from the list '"+r+"'; try again-");
          c++;
          s=scan.next();
          a=0;
        }
        if (c==done-1){
          System.out.println("You failed after 5 tries");
          c=0;
          break;
        }
      }
    }
    return input;}
  public static char getInput(Scanner scan,String m,String nums){
    int a=0;
    int d=0;
    char b='d';
    char input='d';
    String Print="";
    while(input=='d'){
      while(a<nums.length()-1){
        b=nums.charAt(a);
        Print=Print+"'"+b+"',";
        a++;
      }
      while(a==nums.length()-1){
        b=nums.charAt(a);
        Print=Print+"'"+b+"' -";
        break; }
      System.out.println(m);
      System.out.print("Enter one of: "+Print);
      String s=scan.next();
      while(s.length()!=1){
        System.out.println("Enter exactly one character");
        s=scan.next();
      }
      while (d<nums.length()){
        b=nums.charAt(d);
        if(s.charAt(0)==b){
          input=b;
          break;}
        d++;}
      if (input=='d'){
        System.out.println("You did not enter an acceptable character");
        s=scan.next();
        d=0;
        a=nums.length();
        break;
      }
      else
        input=s.charAt(0);
    }
    return input;
  }
  public static void main(String []arg){
    char input;
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
    input=getInput(scan,"Cc");
    System.out.println("You entered '"+input+"'");
    System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
    input=getInput(scan,"yYnN",5); //give up after 5 attempts
    if(input!=' '){
      System.out.println("You entered '"+input+"'");
    }
    input=getInput(scan,"Choose a digit.","0123456789");
    System.out.println("You entered '"+input+"'");
  }  
}
