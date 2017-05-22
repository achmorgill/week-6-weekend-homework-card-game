package CardGame;
import java.util.*;


public class Deck {
  ArrayList<Card> deck;

  public Deck(ArrayList<Card> deck) {
    this.deck = deck;
  }

  public void setUpDeck() {
    for (Suit suit: Suit.values()) {
      for (Rank rank: Rank.values()) {
        Card dealtCard = new Card(suit, rank);
        this.deck.add(dealtCard);
      }
    }
    Collections.shuffle(deck);
  }


  public int noOfCardsInDeck() {
    int count = this.deck.size;
    return count;
  }

}
