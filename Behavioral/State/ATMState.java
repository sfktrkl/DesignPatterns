// State: Defines an interface for encapsulating the behaviour
// associated with a particular state of the Context.
public interface ATMState {

    // Different ways user could use the ATM
    void insertCard();

    void ejectCard();

    void insertPin(int pin);

    void requestCash(int cash);

}