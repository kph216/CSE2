/////////////////////////////////////////////////////////////////////
//Kyle Hughes
//10/20/14
//hw07
//Purpose: Converting between for loop,while loop, and do while loop.

import java.util.Scanner;
public class NumberStack{
  public static void main(String[] args){
    Scanner myScanner;
    myScanner=new Scanner(System.in);
    System.out.print("Enter a number between 1 and 9- "); //ask user
    if(!myScanner.hasNextInt()){// making sure its an int
      System.out.println("You did not enter an int"); 
      System.exit(0);
    }
    int x=myScanner.nextInt();//saves user input as x
    if (x>=1&&x<=9){
      System.out.println("Using for loops:"); //for loop
      for(int a=0;a<=x;a++){ 
        int times = a;
        int length=2*a-1;
        String str = "";
        for(int b=0;b<length;b++){ //length of line
          str +=a;
        }
        for(int c=0;c<times;c++){ //number of times value appears on line
          System.out.println(str);
        }
        for (int d=1;d<=length;d++)
          System.out.print("-");
        System.out.println();
      }
      System.out.println("Using while loops:"); //while loop
      int a=0;
      while(a<=x){
        int times=a;
        int length=2*a-1;
        String str="";    
        int b=0;
        while(b<length){//nested while loop
          str +=a;
          b++;
        }
        int c=0;
        while(c<times){//nested while loop
          System.out.println(str);
          c++;
        }
        int d=1;
        while(d<=length){
          System.out.print("-");
          d++;
        }
        System.out.println();
        a++;
      }
      System.out.println("Using do-while loops:"); //do-while loop
      int e=1 ;
      do{
        int times=e; //statements
        int length=2*e-1;
        String str=""; 
        int f=0;
          do{ //nested do-while loop
          str +=e;
          f++;
        }while(f<length); 
          int g=0;
            do{ //nested do-while loop
            System.out.println(str);
            g++;
          }while(g<times);
            int h=1;
              do{ //nested do-while loop
              System.out.print("-");
              h++;
            }while(h<=length); //nested do-while loop
            System.out.println();
            e++;
      }while(e<=x);
    }
          else{
            System.out.println("You did not enter an int between 1-9");
            System.exit(0);
          }
        }
      }