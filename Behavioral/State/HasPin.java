// Concrete State: Each subclass implements a behaviour
// associated with a state of Context.
public class HasPin implements ATMState {

    ATMMachine atmMachine;

    public HasPin(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    public void insertCard() {
        System.out.println("You already entered a card");
    }

    public void ejectCard() {
        System.out.println("Your card is ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }

    public void requestCash(int cash) {

        if (cash > atmMachine.cash) {
            System.out.println("You don't have that much cash available");
            System.out.println("Your card is ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
        } else {
            System.out.println(cash + " is provided by the machine");
            atmMachine.setCashInMachine(atmMachine.cash - cash);

            System.out.println("Your card is ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());

            if (atmMachine.cash <= 0) {
                atmMachine.setATMState(atmMachine.getNoCashState());
            }
        }
    }

    public void insertPin(int pin) {
        System.out.println("You already entered a PIN");
    }

}
