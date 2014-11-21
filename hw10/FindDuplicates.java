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
    int num[]=new int[10]; //array with 10 ints, initializing array
    String answer="";
    do{
      System.out.print("Enter 10 ints- "); //ask user for input
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt(); //saves imput
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){ //if input has dups continue
        out+="has ";
      }
      else{ //if input doesnt have dups continues
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){ //if input has one duplicate continue
        out+="has ";
      }
      else{ //if input doesnt have one duplicate continue
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }
  public static boolean hasDups(int[] input){ //method for to find duplicates
    for(int i=0;i<input.length; i++){ //
      for(int j=0;j<input.length;j++){
        if((input[i]==(input[j]))&&(i!=j)){ //if duplicates exist return true
          return true;
        }
      }
    }
    return false; //if not return false
  }
  public static boolean exactlyOneDup(int[] input){
    int count = 0;//initialize count for pairs
    for(int i=0;i<input.length; i++){
      for(int j=0;j<input.length;j++){
        if((input[i]==(input[j]))&&(i!=j)){
          count++; // increments count for every pair
        }
      }
    }
    return (count == 2); //returns if only one pair 
  }
  
  public static String listArray(int[] num){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", "; //if statement to print ints neatly
      }
      out+=num[j];
    }
    out+="} ";
    return out; //returns to out adding on to what is going to be print
  }
}

