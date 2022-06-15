package statePattern;

public class HasCard implements ATMState {
    ATMMachine atmMachine;
    public HasCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("you already have a card inserted");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected");
        atmMachine.setAtmState(atmMachine.getNoCard());
    }

    @Override
    public void enterPin(int pin) {
        atmMachine.isCorrectPin = pin == 1234;
        if(atmMachine.isCorrectPin) {
            System.out.println("correct pin entered");
            atmMachine.setAtmState(atmMachine.getHasCorrectPin());
        }
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("ENTER PIN : ");
    }
}
