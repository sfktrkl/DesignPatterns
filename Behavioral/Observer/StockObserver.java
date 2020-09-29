// Represents each Observer that is monitoring changes in the subject
public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    // Counter to keep track of given IDs
    private static int observerIDTracker = 0;

    // Used to track observers
    private int observerID;

    // Will hold reference to the StockGrabber object
    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;

        // Add the observer to the Subject's ArrayList
        this.stockGrabber.register(this);

        // Inform when a new observer is created
        System.out.println("Observer: " + this.observerID + " created.");
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;

        // Print the prices
        System.out.println(observerID + "\nIBM: " + this.ibmPrice + "\nAAPL: " + this.aaplPrice + "\nGOOG: "
                + this.googPrice + "\n");
    }

}
