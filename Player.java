
import java.util.ArrayList;
import java.util.Collections;

public class Player{
// declare arraylist with cards 
  ArrayList<Card> hand = new ArrayList<Card>();
private double bets,chip;
  private  int handSum = 0;



  
public void set(Card playerCard){
 hand.add(playerCard); 
}

  public boolean cardNumb(){
     
    if (this.getHandSum() >= 21 ){
      System.out.println("YOU LOOSE🤡");
      return false ;
    } else {
      
      return true; 
    }
  } // end of cardNumb method 

  public int getHandSum(){
   
    String cardType = null;
    int numAces = 0;

   // all this sets the point value for the cards that are needed
for(int c = 0;  c < hand.size(); c++){
    cardType = hand.get(c).getFace();
}
  if (cardType.equalsIgnoreCase("Ace")){
    numAces++;
    handSum +=11; 
  } else if ( cardType.equalsIgnoreCase("King")) {
    handSum +=10;
  } else if ( cardType.equalsIgnoreCase("Queen")) {
    handSum +=10;
  } else if ( cardType.equalsIgnoreCase("Jack")) {
    handSum +=10;
  } else if ( cardType.equalsIgnoreCase("2")) {
    handSum +=2;
  } else if ( cardType.equalsIgnoreCase("3")) {
    handSum +=3;
  }else if ( cardType.equalsIgnoreCase("4")) {
    handSum +=4;
  }
   else if ( cardType.equalsIgnoreCase("5")) {
    handSum +=5;
  }
   else if ( cardType.equalsIgnoreCase("6")) {
    handSum +=6;
  }
   else if ( cardType.equalsIgnoreCase("7")) {
    handSum +=7;
  }
   else if ( cardType.equalsIgnoreCase("8")) {
    handSum +=8;
  }else if ( cardType.equalsIgnoreCase("9")) {
    handSum +=9;
  }
   // sets aces to 1 if there to many ace values 
    
  
    
 while(handSum > 21 && numAces > 0)
     {
      handSum -= 10;
      numAces--; 
    }
  return handSum; 
    }

  //printing out players hand

  public void printHand(){
    
  }






  
}
