package CardGame;

public enum SuitType {
  DIAMONDS("Diamonds"),
  HEARTS("Hearts"),
  CLUBS("Clubs"),
  SPADES("Spades");

  private final String suitString;

  private SuitType (String suitString) {
    this.suitString = suitString;
  }

  private String getSuit() {
    return suitString;
  }
}