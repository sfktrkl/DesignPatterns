// Concrete State: Each subclass implements a behaviour
// associated with a state of Context.
public class NoCard implements ATMState {

    ATMMachine atmMachine;

    public NoCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    public void insertCard() {
        System.out.println("Please enter your pin");
        atmMachine.setATMState(atmMachine.getHasCardState());
    }

    public void ejectCard() {
        System.out.println("You have not entered your card");
    }

    public void requestCash(int cash) {
        System.out.println("You have not entered your card");
    }

    public void insertPin(int pin) {
        System.out.println("You have not entered your card");
    }

}
