package statePattern;

public class NoCard implements ATMState {
    ATMMachine atmMachine;
    public NoCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
      atmMachine.setAtmState(atmMachine.getHasCard());
        System.out.println("card inserted");
    }

    @Override
    public void ejectCard() {
        System.out.println("no card exists on this atm");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("please insert a card first");
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("please insert a card first");
    }
}
