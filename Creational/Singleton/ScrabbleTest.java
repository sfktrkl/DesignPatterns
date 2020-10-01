import java.util.LinkedList;

public class ScrabbleTest {

    public static void main(String[] args) {

        // How you create a new instance of Singleton
        Singleton firstInstance = Singleton.getInstance();
        // Get unique id for instance object
        System.out.println("Instance ID: " + System.identityHashCode(firstInstance));

        // Get all of the letters stored in the List
        System.out.println(firstInstance.getLetterList());
        LinkedList<String> playerOneTiles = firstInstance.getTiles(7);
        System.out.println("Player 1: " + playerOneTiles);
        System.out.println(firstInstance.getLetterList());

        // Try getting a new instance using getInstance
        Singleton secondInstance = Singleton.getInstance();
        // Get unique id for the new instance object, see both ids are same.
        System.out.println("Instance ID: " + System.identityHashCode(secondInstance));

        // Get the remaining letters stored in the List
        System.out.println(secondInstance.getLetterList());
        LinkedList<String> playerTwoTiles = secondInstance.getTiles(7);
        System.out.println("Player 2: " + playerTwoTiles);
        System.out.println(secondInstance.getLetterList());
    }
}
