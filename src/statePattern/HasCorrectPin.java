package statePattern;

public class HasCorrectPin implements ATMState {
    ATMMachine atmMachine;
    public HasCorrectPin(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("already have a card");
    }

    @Override
    public void ejectCard() {
        atmMachine.setAtmState(atmMachine.getNoCard());
        System.out.println("card ejected");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("pin already entered");
    }

    @Override
    public void requestCash(int amount) {
        atmMachine.setAtmState(atmMachine.getNoCard());
        System.out.println("card ejected");
        if(amount<= atmMachine.cashInAtm){
            atmMachine.withdrawCash(amount);
            System.out.println("Cash withdrawn");
            if(atmMachine.cashInAtm <= 0){
                atmMachine.setAtmState(atmMachine.getOutOfCash());
            }
        }else {
            System.out.println("insufficient balance");
        }
    }
}
