//imports
import java.util.*;

//class app ( my main class)
public class App {

// including random class and array list inorder for my game to select among them anonymously
  public static void main(String[] args) {
    List<Character> guess = new ArrayList<>();
    Random randomNumber  = new Random();
    String[] words =
		{ "Gathua" "cow", "chicken", "pizza", "bread", "stones","sticks", "leaves", "letters", "alphabet", "soup", "hungry", "tired", "sleepy", "noisy", "caring", "friends", "month", "day", "light"
	 },

	 { "lyrics", "songs", "ballads", "shapes", "triangle", "circle", "medicine", "six", "seven", "flower", "rose", "petal"
	 },


	 { " specification", " structure", " lexical", " likewise", " management", " manipulate", " mathematics", " hotjava", " vertex", " unsigned", " traditional"
	 }};
  //   Prompter prompter = new Prompter(new HungMan(words[randomNumber.nextInt(words.length)]));
	// // Prompter prompter = new Prompter(new HungMan("collins"));
	//   prompter.promptForGuess();
  //   }


    String difficulty = JOptionPane.showInputDialog ("Select difficulty : 1 for easy -- 2 for normal -- 3 for hard");

    int intDifficulty = Integer.parseInt(difficulty);
    intDifficulty -= 1;

        if(intDifficulty >= dictionaries.length || intDifficulty < 0)
        {
            System.out.println("Sorry answer between 1 and 3");
            return;
        }

        String pickedArray[] = dictionaries[intDifficulty];
        String[] difficultyMsg = {"Easy huh?", "At last!A normal guy.", "You think you are a tough guy?"};
        System.out.println(difficultyMsg[intDifficulty]);
       // Adding Trim bacause some words starts or ends with space
        words = pickedArray[randomNumber.nextInt(pickedArray.length)].trim();
        // make hidden a char array of the word to guess
        char[] hidden = new char[word.length()];
        // and filled it with '_'
        for(int i = 0; i < word.length(); i++)
            hidden[i] = '_';
        // translate the word to guess into an array of char
        char[] digit = word.toCharArray();
         // build a scaner to read user input
        Scanner letterProvided = new Scanner(System.in);

        do {
          // print what we have
          System.out.print("So far: ");
              for(int i = 0; i < word.length(); i++)
                  System.out.print(hidden[i]);

          if (!badGuesses.isEmpty()) {
            System.out.print("\nBad Guesses:");
            for (Character badGuess : badGuesses) {
              System.out.print(" " + badGuess);
            }
          }

          // input letter from user
          System.out.print("\nPlease enter a letter: ");
          // put it in lower case
          String letter = letterProvided.nextLine().toLowerCase();
          // extract first char
          char guess = letter.charAt(0);
          // flag if found
          boolean correctGuess = false;
          // scan if it is a letter in the word
            for(int i = 0; i < word.length(); i++)
              {
                  // yes it is
                  if(guess == digit[i])
                  {
                      // so replace it by the char
                      hidden[i] = guess;
                      // and flag not to increment badGuesses counter
                      correctGuess = true;
                  }
              }
              // if(Arrays.asList(hidden).indexOf('_') == -1){
              //   break;
              // }
              // if not found increment bad guesses
              if(!correctGuess)
                  badGuesses.add(guess);
        }
        while(badGuesses.size() < 5);   // <-- put here number of guess
        System.out.println("Sorry You Lost!!!!");
    }
}
}
