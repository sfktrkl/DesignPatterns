// This interface handles adding, deleting and updating all observers 
public interface Subject {

    public void register(Observer observer);

    public void unregister(Observer observer);

    public void notifyObservers();

}
