package statePattern;

public class Main {
    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine();
        atmMachine.addCash(30000);

        atmMachine.ejectCard();
        atmMachine.insertCard();
        atmMachine.requestCash(300);
        atmMachine.enterPin(1234);
        atmMachine.requestCash(300);
        atmMachine.requestCash(29700);
        atmMachine.ejectCard();

    }
}
