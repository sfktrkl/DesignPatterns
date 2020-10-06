// Context (Account): Maintains an instance of a Concrete State
// subclass that defines current state.
public class ATMMachine {

    // Possible states for the ATM:
    // HasCard, NoCard, HasPin, NoCash
    private ATMState hasCard;
    private ATMState noCard;
    private ATMState hasPin;
    private ATMState noCash;

    private ATMState state;

    public int cash = 2000;
    public boolean correctPinEntered = false;

    public ATMMachine() {
        this.hasCard = new HasCard(this);
        this.noCard = new NoCard(this);
        this.hasPin = new HasPin(this);
        this.noCash = new NoCash(this);

        this.state = this.noCard;

        if (cash < 0) {
            this.state = this.noCash;
        }
    }

    public void setATMState(ATMState state) {
        this.state = state;
    }

    public void setCashInMachine(int cash) {
        this.cash = cash;
    }

    public void insertCard() {
        state.insertCard();
    }

    public void ejectCard() {
        state.ejectCard();
    }

    public void insertPin(int pin) {
        state.insertPin(pin);
    }

    public void requestCash(int cash) {
        state.requestCash(cash);
    }

    public ATMState getHasCardState() {
        return hasCard;
    }

    public ATMState getNoCardState() {
        return noCard;
    }

    public ATMState getHasPinState() {
        return hasPin;
    }

    public ATMState getNoCashState() {
        return noCash;
    }

}
