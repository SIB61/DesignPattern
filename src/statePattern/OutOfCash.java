package statePattern;

public class OutOfCash implements ATMState {
    ATMMachine atmMachine;
    public OutOfCash(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("this machine is out of money");
    }

    @Override
    public void ejectCard() {
        System.out.println("this machine is out of money");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("this machine is out of money");
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("this machine is out of money");
    }
}
