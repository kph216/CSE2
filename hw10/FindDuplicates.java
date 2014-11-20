//////////////////////////////////////////////////////////////////////////////////////////////
//Kyle Hughes
//11/18/14
//HW10
//Purpose: (Prog1)Given part of the program add 2 methods ,hasDups() and exactlyOneDup(). 
//This program should find duplicates when given 10 ints and print out if it has duplicates
//or just one duplicate.
import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }
  public static boolean hasDups(int[] input){
    for(int i=0;i<input.length; i++){
      for(int j=0;j<input.length;j++){
        if((input[i]==(input[j]))&&(i!=j)){
          return true;
        }
      }
    }
    return false;
  }
  public static boolean exactlyOneDup(int[] input){
    int count = 0;
    for(int i=0;i<input.length; i++){
      for(int j=0;j<input.length;j++){
        if((input[i]==(input[j]))&&(i!=j)){
          count++;
        }
      }
    }
    return (count == 2);
  }
  
  public static String listArray(int[] num){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
}

