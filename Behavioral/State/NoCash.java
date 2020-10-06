// Concrete State: Each subclass implements a behaviour
// associated with a state of Context.
public class NoCash implements ATMState {

    ATMMachine atmMachine;

    public NoCash(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    public void insertCard() {
        System.out.println("We don't have any money");
    }

    public void ejectCard() {
        System.out.println("We don't have any money");
    }

    public void requestCash(int cash) {
        System.out.println("We don't have any money");
    }

    public void insertPin(int pin) {
        System.out.println("We don't have any money");
    }

}