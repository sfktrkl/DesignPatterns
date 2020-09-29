import java.util.ArrayList;

// Uses the Subject interface to update all Observers
public class StockGrabber implements Subject {

    // Create an ArrayList to hold all observers
    private ArrayList<Observer> observers;

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        int observerIndex = observers.indexOf(observer);
        observers.remove(observerIndex);

        // Inform when an observer is deleted
        System.out.println("Observer: " + (observerIndex + 1) + " unregistered.");
    }

    @Override
    public void notifyObservers() {
        // Cycle through all observers and notifiy them about prices
        for (Observer observer : observers)
            observer.update(ibmPrice, aaplPrice, googPrice);
    }

    // Change prices for stocks and notify observers from changes
    public void setIBMPrice(double newIBMPrice) {
        this.ibmPrice = newIBMPrice;
        notifyObservers();
    }

    public void setAAPLPrice(double newAAPLPrice) {
        this.aaplPrice = newAAPLPrice;
        notifyObservers();
    }

    public void setGOOGPrice(double newGOOGPrice) {
        this.googPrice = newGOOGPrice;
        notifyObservers();
    }

}
