//////////////////////////////////////////////////////////////////////////////////////////////
//Kyle Hughes
//hw10
//11/18/14
//(Prog2)The method showOneHand() should generate random poker hands, 
//prompting the user if they would like another hand to be generated (it will repeat as long 
//the user desires). The method simulateOdds() should randomly generate 10000 hands and count 
//the number of times that a hand with a pair of a specific rank occurs, along with the number 
//of hands that do not have a pair.
import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
    simulateOdds();
  }
  
  
  public static String showHands() {
    // allocate array and create random number generator
    final int NUM_CARDS = 5;
    cards = new Card[NUM_CARDS];
    Random gen = new Random();
    for (int i = 0; i < cards.length; i++) {
      // pick new rank and suit values randomly
      cards[i] = new Card(gen.nextInt(13) + 2,
                          gen.nextInt(4));
    }
    String result = "";
    for (int i = 0; i < cards.length; i++) {
      result = result + cards[i] + "\n";
    }
    return result;
  }
  
  public static String simulateOdds(){
    System.out.println("rank");
    String labels[]={“Ace”, ”King”, “Queen“, “Jack”};
    for(int j=11;j=<15;j++){ 
      System.out.println(+labels[j]) }
    for(int j=2;j=<10;j++){
      System.out.println(j) }
  }
  
}



