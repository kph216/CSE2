/////////////////////////////////////////////////////////////////////////////////
//Kyle Hughes
//11/4/14
//Hw09
//Purpose: Using methods create the diagram. Since its a complicated problem it 
//should be broken up into 2 problems, which also contain subproblems to solve this 

import java.util.Scanner;//import scanner
public class BlockedAgain{//define class
  public static int getInt(){//force user to input a integer method
    System.out.print("Enter an in int between 1 and 9, inclusive:");//print out the order:"Enter an in int between 1 and 9, inclusive:"
    Scanner scan= new Scanner(System.in);//read input
    while(checkInt(scan)==false){//while its not integer
      scan= new Scanner(System.in);
    }
    int a= scan.nextInt();
    a=checkRange(a);
    
    return a;
  }
  public static boolean checkInt(Scanner scan){
    if(!scan.hasNextInt()){
      System.out.print("You did not enter an int; try again: ");
      
      return false;
    }
    else
      return true;
  }
  public static int checkRange(int a){
    while(a<1||a>9){
      System.out.print("You did not enter an int in [1,9]; try again: ");
      a=getInt();
    }
    
    return a;
  }
  public static void allBlocks(int a){
    int b=a;
    String line="-";
    String space="";
    int number=1;
    int count=1;
    int c=0, d=0, e=0, f=0;
    while(c<a){
      block(count, number, b, f, space, d, e);
      lines(line, f, b, space);
      d=0;
      c++;
      number+=1;
      count+=2;
      line+="--";
      b--;
      space="";
    }
  }
  public static void block(int count,int number,int b, int f, String space, int d, int e){ //for numbers and space
    while(f<b){
      space+=" ";
      f++;
    }
    f=0;
    while(d<number){
      System.out.print(space);
      while(e<count){
        System.out.print(number);
        e++;
      }
      e=0;
      System.out.println("");
      d++;
    }
  }
  public static void lines(String line, int f, int b, String space){ //for lines and space
    
    while(f<b){
      space+=" ";
      f++;
    }
    f=0;
    System.out.println(space+line);
    
  }
  public static void main(String []s){
    int m;
//force user to enter int in range 1-9, inclusive.
    m = getInt(); 
    allBlocks(m);
  }
}