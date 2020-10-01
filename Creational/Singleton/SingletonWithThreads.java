import java.util.Collections;

public class SingletonWithThreads extends Scrabble {

    private static SingletonWithThreads firstInstance = null;

    // Used to slow down 1st thread
    static boolean firstThread = true;

    private SingletonWithThreads() {
    }

    // We could make getInstance a synchronized method to force
    // every thread to wait its turn. That way only one thread
    // can access a method at a time.
    // This can really slow everything down though
    // public static synchronized Singleton getInstance()
    public static SingletonWithThreads getInstance() {
        if (firstInstance == null) {

            // This is here to test what happens if threads try
            // to create instances of this class
            if (firstThread) {
                firstThread = false;
                try {
                    Thread.currentThread();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // Here we just use synchronized when the first object is created
            synchronized (SingletonWithThreads.class) {
                if (firstInstance == null) {
                    firstInstance = new SingletonWithThreads();
                    Collections.shuffle(firstInstance.letterList);
                }
            }
        }

        return firstInstance;
    }

}