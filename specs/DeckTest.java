import static org.junit.Assert.*;
import org.junit.*;
import CardGame.*;


public class DeckTest {

  Deck deck;
  

  @Before
  public void before() {
    deck = new Deck();
  }

    @Test
    public void noOfCardsInDeck() {
      deck.setUpDeck();
      assertEquals(52, deck.noOfCardsInDeck());
    }
  }