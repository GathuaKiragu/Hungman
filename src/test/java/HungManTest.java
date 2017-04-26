// imports
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

//class hungmanTest
public class HungManTest {
    HungMan hungman ;

    // used to add additional functionality which applies to all tasks within the test class but in a generic way
    @Rule
    public ExpectedException exception = ExpectedException.none();

    // indicates this method must be executed before each test in the class, so as to execute some pre-conditions necessary for the test
    @Before
    public void setUp() throws Exception {
        hungman = new HungMan("collins");

    }

    //is for choosing a character and therefore the answer of the character should match to the word guessed
    @Test
    public void choosingACharacterInTheAnswerReturnsTrue() throws Exception {
        assertTrue(hungman.applyGuess('c'));
    }

    // is to enhance that the character you guess is included and it matters. You cannot alter because its the rules of the game
    @Test
    public void ifAStringIsEnteredOnlyTheFirstCharacterMatters() throws Exception{
        assertTrue(hungman.applyGuess("cljn"));
    }

    // to prevent entering an empty guess
    @Test
    public void givingAnEmptyGuessIsNotAllowed() throws Exception {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Please make sure to enter a guess");

        hungman.applyGuess("");
    }

    // to make the guess that is already been made not to be allowed
    @Test
    public void makingAGuessThatIsAlreadyBeenMadeIsNotAllowed() throws Exception {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("You already made this guess ");

        hungman.applyGuess("c");
        hungman.applyGuess("c");
    }

    // if you have entered your guesses correctly (atleast once) you win
    @Test
    public void enteringAllCharactersInTheAnswerAtLeastOnceResultsInWinningTheGame() throws Exception{
			// we can use name of my pair as an example
        hungman.applyGuess("c");
        hungman.applyGuess("o");
        hungman.applyGuess("l");
        // hungman.applyGuess("l"); // to prevent repetition of placing 
        hungman.applyGuess("i");
        hungman.applyGuess("n");
        hungman.applyGuess("s");

        assertTrue(hungman.isWon());

    }

}
