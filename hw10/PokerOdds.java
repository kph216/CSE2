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
      showHands(); //call method
      simulateOdds(); //call method
    }
    public static void showHands(){
        int cards[]=new int[52];
         int y[]=new int[5];
        String scan1="";
        int x=51,draw1=0,initdeck=0,draw;
      Scanner scan=new Scanner(System.in);
     
      while(initdeck<52){
        cards[initdeck]=initdeck+1;
        initdeck++;
      } //create the deck
      
      do{
        x=51;
        draw1=0;
        while(draw1<5){
          draw=(int)(Math.random()*x);
          y[draw1]=cards[draw];
          int temp = cards[draw];
          for(int j=0;j<51;j++){
            if(j>=draw){
              cards[j] = cards[j+1];}
          }
          cards[x] = temp;//swap the tested value all the way to the end
          draw1++;
          x--;
        } //draw a hand
        
        int k=0;
        String s="",c="",h="",d=""; //clubs,spades,diamonds,hearts
        int tests=(int)(y[k]/13);
        int test=y[k]%13; //initiate variables
        while(k<5){
          test=y[k]%13;
          tests=(int)(y[k]/13);
          switch (tests){
          case (0):
            switch(test){ //add to spades
              case (0):
                s=s+" A";
                break;
              case (1):
                s=s+" K";
                break;
              case (2):
                s=s+" Q";
                break;
              case (3):
                s=s+" J";
                break;
              case (4):
                s=s+" 10";
                break;
              case (5):
                s=s+" 9";
                break;
              case (6):
                s=s+" 8";
                break;
              case (7):
                s=s+" 7";
                break;
              case (8):
                s=s+" 6";
                break;
              case (9):
                s=s+" 5";
                break;
              case (10):
                s=s+" 4";
                break;
              case (11):
                s=s+" 3";
                break;
              default:
                s=s+" 2";
                break;
            }
            break;
          case (1):
              switch(test){// add to clubs
              case (0):
                c=c+" A";
                break;
              case (1):
                c=c+" K";
                break;
              case (2):
                c=c+" Q";
                break;
              case (3):
                c=c+" J";
                break;
              case (4):
                c=c+" 10";
                break;
              case (5):
                c=c+" 9";
                break;
              case (6):
                c=c+" 8";
                break;
              case (7):
                c=c+" 7";
                break;
              case (8):
                c=c+" 6";
                break;
              case (9):
                c=c+" 5";
                break;
              case (10):
                c=c+" 4";
                break;
              case (11):
                c=c+" 3";
                break;
              default:
                c=c+" 2";
                break;
            }
            break;
          case (2):
              switch(test){ //add to hearts
              case (0):
                h=h+" A";
                break;
              case (1):
                h=h+" K";
                break;
              case (2):
                h=h+" Q";
                break;
              case (3):
                h=h+" J";
                break;
              case (4):
                h=h+" 10";
                break;
              case (5):
                h=h+" 9";
                break;
              case (6):
                h=h+" 8";
                break;
              case (7):
                h=h+" 7";
                break;
              case (8):
                h=h+" 6";
                break;
              case (9):
                h=h+" 5";
                break;
              case (10):
                h=h+" 4";
                break;
              case (11):
                h=h+" 3";
                break;
              default:
                h=h+" 2";
                break;
            }
            break;
          default:
          switch(test){ //add to diamonds
              case (0):
                d=d+" A";
                break;
              case (1):
                d=d+" K";
                break;
              case (2):
                d=d+" Q";
                break;
              case (3):
                d=d+" J";
                break;
              case (4):
                d=d+" 10";
                break;
              case (5):
                d=d+" 9";
                break;
              case (6):
                d=d+" 8";
                break;
              case (7):
                d=d+" 7";
                break;
              case (8):
                d=d+" 6";
                break;
              case (9):
                d=d+" 5";
                break;
              case (10):
                d=d+" 4";
                break;
              case (11):
                d=d+" 3";
                break;
              default:
                d=d+" 2";
                break;
            }
            break;
          }
          k++;}
        System.out.println("Clubs:"+c);
        System.out.println("Diamonds:"+d);
        System.out.println("Hearts:"+h);
        System.out.println("Spades:"+s);
        System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");//ask if user wants to run again.
        scan1=scan.next();//saves input
      }while(scan1.equals("y")||scan1.equals("Y"));
    }
    
    public static void simulateOdds(){
      
      int A=0,K=0,Q=0,J=0,Ten=0,Nine=0,Eight=0,Seven=0,
        Six=0,Five=0,Four=0,Three=0,Two=0,not=0,hands=0; //initiate variables
      do{
        int x=51,initdeck=0,draw1=0,draw;
        int cards[]=new int[52];
        int y[]=new int[5];
        while(initdeck<52){
          cards[initdeck]=initdeck+1;
          initdeck++;}//create the deck
        while(draw1<5){
          draw=(int)(Math.random()*x);
          y[draw1]=cards[draw];
          
          int temp = cards[draw];
          for(int j=0;j<51;j++){
            if(j>=draw){
              cards[j] = cards[j+1];}
          }
          cards[x] = temp;//swap the tested value to the end
          
          draw1++;
          x--;
        } 
        //next test on duplicates
        int test1=0;
        int counts=0;
        int i=-1; 
        // test each one of the cards for duplicates
        while(test1<5){
          if(y[0]%13==y[test1]%13){
            counts++;//count the number of sames.
            i=0;
          }
          test1++;}
        if(counts==2&&i!=-1){
          int test=y[i]%13;
          switch(test){
            case (0):
              A++;
              break;
            case (1):
              K++;
              break;
            case (2):
              Q++;
              break;
            case (3):
              J++;
              break;
            case (4):
              Ten++;
              break;
            case (5):
              Nine++;
              break;
            case (6):
              Eight++;
              break;
            case (7):
              Seven++;
              break;
            case (8):
              Six++;
              break;
            case (9):
              Five++;
              break;
            case (10):
              Four++;
              break;
            case (11):
              Three++;
              break;
            default:
              Two++; 
              break;
          }
        }
        else
          not++;
        
        hands++;
        counts=0;
      }while(hands<10000);
      System.out.println("rank  frequency of exactly one pair");
      System.out.println(" A    "+A);
      System.out.println(" K    "+K);
      System.out.println(" Q    "+Q);
      System.out.println(" J    "+J);
      System.out.println(" 10   "+Ten);
      System.out.println(" 9    "+Nine);
      System.out.println(" 8    "+Eight);
      System.out.println(" 7    "+Seven);
      System.out.println(" 6    "+Six);
      System.out.println(" 5    "+Five);
      System.out.println(" 4    "+Four);
      System.out.println(" 3    "+Three);
      System.out.println(" 2    "+Two);
      System.out.println("----------------------------");
      System.out.println("total not exactly one pair: "+not);
      
      //print out the results.
    }
  }
  