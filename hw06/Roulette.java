/////////////////////////////////////////////////////////////////////////////
//Kyle Hughes
//10/14/14
//hw06
//Purpose: use a random number generator (recall Math.random()) to simulate 
//this person’s betting on 100 spins, but run the simulation 1000 times and 
//collect data on the outcome. 

public class Roulette{ // define a class
  public static void main(String[] args) {    // define a main method
    int exp=0,lose=0,win=0,spin=0,success=0,totsuccess=0,fail=0; //variables
    while (exp<1000){ //nested loop outside
      success=0;
      spin=0;
      fail=0;
      while(spin<100){    //nested loop inner
        double x=Math.random();
        if (x<0.02631579){
          success++;
          totsuccess++;}
        else{
          fail++;}
        spin++;}
      if (success>2) 
        win++;
      else{
        lose++;}
      exp++;
    }
    int tot=totsuccess*36;
    System.out.println("The number of times I lose everything is "+lose);
    System.out.println("The total winings is $"+tot);
    System.out.println("The number of times a walked away with winings is "+win);
  }//end of main method
}//end of class
