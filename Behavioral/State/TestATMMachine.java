public class TestATMMachine {

    public static void main(String[] args) {

        ATMMachine atmMachine = new ATMMachine();
        atmMachine.insertCard(); // Initial state, NoCard
        atmMachine.ejectCard(); // HasCard
        atmMachine.insertCard(); // NoCard
        atmMachine.insertPin(1234); // HasCard
        atmMachine.requestCash(2000); // HasPin
        atmMachine.insertCard(); // NoCash
        atmMachine.insertPin(1234); // NoCash

    }
}
