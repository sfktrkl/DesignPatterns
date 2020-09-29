public class GrabStocks {

    public static void main(String[] args) {

        // Create the Subject
        // It will handle updating observers
        // as well as deleting and adding them
        StockGrabber stockGrabber = new StockGrabber();

        // Create an Observer that will be sent updates from Subject
        StockObserver observer1 = new StockObserver(stockGrabber);
        // It will inform changes one by one for Observer 1
        stockGrabber.setIBMPrice(197.0);
        stockGrabber.setAAPLPrice(677.6);
        stockGrabber.setGOOGPrice(676.4);

        // Create another Observer
        // So, there will be two information since another observer is added to Subject
        StockObserver observer2 = new StockObserver(stockGrabber);
        stockGrabber.setIBMPrice(202.0);
        stockGrabber.setAAPLPrice(621.3);
        stockGrabber.setGOOGPrice(698.9);

        // Unregister one of the observers
        // So, it will not supply any information from Subject anymore
        stockGrabber.unregister(observer1);
        stockGrabber.setIBMPrice(191.0);
        stockGrabber.setAAPLPrice(650.2);
        stockGrabber.setGOOGPrice(660.1);

        // Use threads within an observer pattern,
        // since it is very common to occur.

        // Create 3 threads using the Runnable interface
        // GetTheStock implements Runnable, so it doesn't waste
        // its one extendable class option
        Runnable getIBM = new GetTheStock(stockGrabber, "IBM", 190.0);
        Runnable getAAPL = new GetTheStock(stockGrabber, "AAPL", 670.0);
        Runnable getGOOG = new GetTheStock(stockGrabber, "GOOG", 700.0);

        new Thread(getIBM).start();
        new Thread(getAAPL).start();
        new Thread(getGOOG).start();
    }

}
