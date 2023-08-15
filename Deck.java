import java.util.ArrayList;
import java.util.Random;
import java.util.Collections; 

public class Deck{
 // declaration of the cards and arraylist
 
  ArrayList<Card> deck = new ArrayList<Card>();
// creates a card variable 
  Card tempCard;
Card tempHand;
  //fills the information that belongs in card the faces and suit that was passed in the suit object
  public Deck(){
    String faces [] ={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

    String suit[ ]= {"Hearts❤️", "Spades ♠️","Clubs ♣️" , "Diamonds💎"};

   // creates a loop that makes 52 cards each with the faces and names
    for(int i = 0; i < 4; i++){
      for(int j = 0; j < 13; j++){
    tempCard = new Card(faces[j], suit[i]);
        deck.add(tempCard);
     
        
      }
    }
  }
  // shuffles the deck and prints out the shuffled version
  public void shuffleDeck(){
    Collections.shuffle(deck); 
     System.out.println(deck);
    
  }

  // remove method that removes the first card (index 0) on the array
  public void remove(){
    Collections.shuffle(deck);
    System.out.println(deck.get(0));
     deck.remove(0);
    
   
  } 
 // takes the card out of the deck  saves it as a new tempCard and then passes that into the method 
  public Card removeCard(){
    Collections.shuffle(deck);
    tempHand  = deck.get(0); 
    System.out.print(deck.get(0));
    deck.remove(0);
return tempHand; 
   
  } 
  // this same thing as before difference is that it doesnt reveal the card dealt
   public Card removeDeal(){
    Collections.shuffle(deck);
    tempHand  = deck.get(0); 
    deck.remove(0);
return tempHand; 
   
  } 
}
