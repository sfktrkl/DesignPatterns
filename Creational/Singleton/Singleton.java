import java.util.Collections;

public class Singleton extends Scrabble {

    // It is static because objects like this need to
    // be on the global basis.
    private static Singleton firstInstance = null;

    // Created as private to keep users from instantiation,
    // Only Singleton will be able to instantiate this class
    private Singleton() {

    }

    public static Singleton getInstance() {
        // If the instance isn't needed it isn't created
        // This is known as Lazy Instantiation
        if (firstInstance == null) {
            firstInstance = new Singleton();
            // Shuffle all letters
            Collections.shuffle(firstInstance.letterList);
        }

        return firstInstance;
    }
}
