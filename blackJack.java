import java.util.Scanner; 
import java.util.ArrayList;



class Main {
  private static Scanner input = new Scanner(System.in);
  public static void main(String[] args)  throws InterruptedException{
  Player player1 = new Player();
  Player dealer = new Player();
  Deck deck = new Deck();
Card tempHand;
int bust = 21; 
    double bet ;
    double chips = 500;
    String choice;
    
    

System.out.println("\t\t\t WELCOME TO THE CARD GAME BLACK JACK");

System.out.println("\t\tassuming you already know the rules we will begin.");
System.out.println("\n");
    System.out.println("\n");
    System.out.println("\n");
    System.out.print("What will you be called in the score bored player 1?:");

    var  name = input.next();
     System.out.println("\n");
    
    
    System.out.println("\n");
    System.out.println("Welcome "+ name+ " how much will you be betting?");


    //shuffles the deck
     System.out.println("Cards will be shuffled!");
     Thread.sleep(1000);
      deck.shuffleDeck();
    System.out.println("\n");
    System.out.println("\n");
// hands to player
  // the game in short, keep playin until user quits or runs out of chips
     
    System.out.println("Welcome "+ name+ " how much will you be betting?");
    do {
      if(chips == 0){
        System.out.println("YOU HAVE NO CHIPS LEFT");
        System.exit(0);
      } 
          System.out.println("You have " + chips+ " chips to bet");

    Thread.sleep(1000);
    //gives each dealer and player different cards until they each have 2 then continues with the rest of the code 
    do{System.out.print("Place bet: ");
    bet = input.nextInt();
      } while (!checkValidBet(bet,chips));
      System.out.println("\n");
        Thread.sleep(1000);
    System.out.print("The player gets:");
    player1.set(deck.removeCard());
System.out.println("\n");
       Thread.sleep(500);
    System.out.println("The dealer gets:");
    dealer.set(deck.removeCard());
     Thread.sleep(500);
    System.out.println("\n");
    System.out.print("The player gets:");
    player1.set(deck.removeCard());
       Thread.sleep(500);
           System.out.println("\n");
System.out.println("The dealer gets:[hidden]");
    dealer.set(deck.removeDeal());
    Thread.sleep(500);
    
      System.out.println("\n");
      
    // checks to see if they bust first before proceeding
      if (player1.getHandSum() == 21){
        System.out.println("YOU BUST !!");
    chips = (bet * 1.5);
        
  } 

    // dealer keepson taking cards till they equal or more than 16 then they stop and if their card number is more than 17 they continue with the came
Thread.sleep(500);
   do {
      System.out.println("Dealer will check their cards");
    if ( dealer.getHandSum() >= 17){
     System.out.println("\n");
      System.out.print("Continue");

      // else the dealer keeps on taking a card face down ( hidden)
    } else {
     System.out.println("Dealer takes [hidden]");
      dealer.set(deck.removeDeal()); 
    } 
    
   } while(dealer.getHandSum() <= 16);

  // this gives the conditions/rules for the player or dealer winning     
    System.out.println("\n") ;
      if (dealer.getHandSum() == 21) {
        System.out.println("  : (  : ( ");
        chips = chips - bet; 
  } else if(player1.getHandSum() > dealer.getHandSum() ){
         System.out.println(name +" WINS !!");
        chips = (bet * 1.5);
  } else if(dealer.getHandSum() > player1.getHandSum()) {
         chips = chips - bet;
       System.out.println(name + " LOOSES🤡 ");
  } else if (dealer.getHandSum() == player1.getHandSum()){
        System.out.println("NO ONE WINS ");
  }
// quit method that ensures u end the game when theres no more chips left
System.out.println("\n");
      System.out.print("Do you wish to quit (y/n)? ");
 choice = input.next();
      if ( choice.equalsIgnoreCase("y")) {
        System.out.println("COME AGAIN!!");
        System.exit(0);
      } else {
    
        System.out.println("\n");
      }
      
} while (choice.equalsIgnoreCase("n") || chips == 0 );

    } 
    
    
   
    
    



//method that confirms the valid player bet
  public static boolean checkValidBet(double bet,double chips ){
    if (bet > chips){
      System.out.println("AH AH AH.You dont have enough for that.");
      System.out.println("You have "+ chips);
       System.out.println("\n");
      return false ; 
    } else {
      return true;
    }
    
  } // end of valud method 





  
}
