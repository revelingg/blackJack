public class Card{
  private String suit, faceName;

// sets what card is and passes this as an array into deck
  public Card(String faces, String suits){
    suit = suits;
    faceName = faces;

  }

    public String getSuit(){
      return suit;
      
    }
  public String getFace(){
    return faceName; 
  }

  // method that basically sets the info for the card
  public String toString(){
    return "\n"+ faceName + " of " + suit; 
  }
}







  

