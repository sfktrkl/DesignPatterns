import java.util.Arrays;
import java.util.LinkedList;

public class Scrabble {

    String[] scrabbleLetters = { "a", "a", "a", "a", "a", "a", "a", "a", "a", "b", "b", "c", "c", "d", "d", "d", "d",
            "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h", "h", "i", "i",
            "i", "i", "i", "i", "i", "i", "i", "j", "k", "l", "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n",
            "o", "o", "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r", "r", "r", "s", "s", "s", "s",
            "t", "t", "t", "t", "t", "t", "u", "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z", };
    protected LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));

    protected Scrabble() {

    }

    public LinkedList<String> getLetterList() {
        return this.letterList;
    }

    public LinkedList<String> getTiles(int howManyTiles) {

        // Tiles to be returned to the user
        LinkedList<String> tilesToSend = new LinkedList<String>();

        // Cycle through the LinkedList while adding the starting
        // Strings to the to be returned LinkedList while deleting
        // them from letterList
        for (int i = 0; i <= howManyTiles; i++) {
            tilesToSend.add(this.letterList.remove(0));
        }

        // Return the number of letter tiles requested
        return tilesToSend;
    }
}
