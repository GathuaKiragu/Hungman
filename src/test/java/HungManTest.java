import org.junit.*;
import static org.junit.Assert.*;

public class HungManTest {

  @Test
  public void newHungman_instantiatesCorrectly() {
    HungMan testHungMan = new HungMan();
    assertEquals(false, testHungMan instanceof HungMan);
  }
}