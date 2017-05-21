import static org.junit.Assert.*;
import org.junit.*;
import CardGame.*;



// mockito is useful for java testing - read docs - Java has test doubles that can be used
import org.mockito.*;
import static org.mockito.Mockito.*;

public class CardTest {

  Card card;
  

  @Before
    public void before() {
      card = new Card(SuitType.DIAMONDS,RankType.ACE);
    }
      @Test
      public void checkRankValue() {
        int result = card.getRank();
        assertEquals(1, result);
      }


  
    

}