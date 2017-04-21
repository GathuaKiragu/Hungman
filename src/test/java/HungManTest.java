import org.junit.*;
import static org.junit.Assert.*;
public class HungManTest {

// This test checks that the newHungman is instantiated correctly
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

// This test checks that the letter inputted by the user is present in the answer
@Test
	public void newHungman_checkLetterAgainstAnswer_String() {
	HungMan testHungMan = new HungMan();
	assertEquals("r", testHungMan.checkLetter("r"));
	}
}