import org.junit.*;
import static org.junit.Assert.*;

public class HungManTest {

  @Test
  public void newHungman_instantiatesCorrectly() {
    HungMan testHungMan = new HungMan();
    assertEquals(true, testHungMan instanceof HungMan);
  }

@Test
    public void newHungman_getUserAnswer_String() {
    HungMan testHungMan = new HungMan();
    assertEquals("moringa", testHungMan.getAnswer());
  }
}