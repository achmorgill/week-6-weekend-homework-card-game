package CardGame;

 public class Card{
  private SuitType suit;  
  private RankType rank; 


  public Card(SuitType suit,RankType rank){
    this.rank = rank;
    this.suit = suit;
  } 


  public String getSuitName() {
    return suit.getSuitName();
  }

  public int getRankValue() {
    return rank.getRankValue();
  }

  
}