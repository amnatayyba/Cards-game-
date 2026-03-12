import java.util.Random;
public class Deck{
  Card cards[];
  int top=0;

private String suits[]={"Spades","Clubs","Hearts","Diamonds"};
private String ranks[]={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

Deck(){
    //Ranks=Rank.Ace;
    cards=new Card[52];
    int counter=0;
    for(int i=0;i<suits.length;i++){
        for (int j=0;j<ranks.length;j++){
            cards[counter++]=new Card(suits[i],ranks[j]);
           
     }
   }
}

public void displayDeck(){
          for(int i=0;i<cards.length;i++){
             System.out.println(cards[i]);
    }
}

public void shuffle(){
       Random random=new Random();
       for(int i=0 ; i<cards.length ; i++){
          int index = random.nextInt(cards.length);
          Card temp = cards[i];
          cards[i]= cards[index];
          cards[index] = temp;
    }
  }
  public Card drawCard(){
    if(top<cards.length){
      return cards[top++];
   }
   return null;
  }
}



  // add toString which should return a formatted string of all cards to the caller , you use string builder instead of 

//enum Ranks{
 
   // Ace(13),Two(2),Three(3),Four(4),Five(5),Six(6),Seven(7),Eight(8),Nine(9),Ten(10),Jack(11),Queen(12),King(13)
 //int value;
//private Ranks(int v){
 // value=v;
 // }
//}
//enum Suits{
  // Spades("S"),Clubs("C"),Diamonds("D"),Hearts("H");
  // String symbol;
  // Suits(String s){
// symbol=s;
//}
   
//} 

