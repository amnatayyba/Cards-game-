public class Game{
    Deck deck;
    Player[] players;
    int round = 5;
    Game(String[] names){
       deck = new Deck();
       deck.shuffle();
        players = new Player[names.length];
      for(int i=0; i<names.length; i++){
         players[i] = new Player(names[i]);
     }
  }
 public void playGame(){
     for(int r=1; r<=round; r++){
    System.out.println("Round " + r);
         Card highestCard = null;
         int winner = 0;
    for(int i=0; i<players.length; i++){
         Card card = deck.drawCard();
    System.out.println(players[i].name + " drew " + card);
          if(highestCard==null || card.getValue() > highestCard.getValue()){
             highestCard = card;
              winner = i;
       }
 }
  players[winner].score++;
     System.out.println("Winner of round: " + players[winner].name);
  }
    System.out.println("Final Scores:");
      for(int i=0; i<players.length; i++){
        System.out.println(players[i].name + " : " + players[i].score);
   }
     int max = players[0].score;
      String winner = players[0].name;
      for(int i=1; i<players.length; i++){
          if(players[i].score > max){
            max = players[i].score;
            winner = players[i].name;
     }
  }
  System.out.println("Game Winner: " + winner);
}
   public String toString(){
     StringBuilder playerDetails = new StringBuilder();
        for(int i=0; i<players.length; i++){
           playerDetails.append(players[i]).append("\n");
    }
 return playerDetails.toString();
   }
}



class Player{
    String name;
    int score;
    Player(String name){
       this.name = name;
       score = 0;
 }
    public String toString(){
        return name + " " + score;
   }
}