package CardGame;

public enum SuitType {
  DIAMONDS("Diamonds"),
  HEARTS("Hearts"),
  CLUBS("Clubs"),
  SPADES("Spades");

  private final String suitName;

  private SuitType(String suitName) {
    this.suitName = suitName;
  }

  public String getSuitName() {
    System.out.println(this.suitName);
    return this.suitName;
  }
}