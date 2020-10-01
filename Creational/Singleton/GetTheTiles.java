import java.util.LinkedList;

public class GetTheTiles implements Runnable {

    public void run() {
        SingletonWithThreads instance = SingletonWithThreads.getInstance();
        System.out.println("Instance ID: " + System.identityHashCode(instance));
        System.out.println(instance.getLetterList());

        LinkedList<String> playerTiles = instance.getTiles(7);
        System.out.println("Player 1: " + playerTiles);
        System.out.println(instance.getLetterList());

        System.out.println("Got Tiles.");
    }
}
