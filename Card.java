public class Card{
      private final String SUIT;
      private final String RANK;
      

   Card(String suit,String rank){
     this.SUIT=suit;
     this.RANK=rank;
     
}
public String getSUIT(){
   return SUIT;
}
public String getRANK(){
    return RANK;
}
  public int getValue(){
    if (RANK.equals("Ace")) return 14;
    if (RANK.equals("King")) return 13;
    if (RANK.equals("Queen")) return 12;
    if (RANK.equals("Jack")) return 11;

   return Integer.parseInt(RANK);
}
public String toString(){
   return String.format("%s of %s",RANK,SUIT);
   }
}