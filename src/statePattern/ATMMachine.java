package statePattern;

public class ATMMachine {
    private final ATMState hasCard;
   private final ATMState noCard;
   private final ATMState hasCorrectPin;
   private final ATMState outOfCash;
  private   ATMState atmState;

    int cashInAtm = 0;
    boolean isCorrectPin = false;

    public ATMMachine(){
        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasCorrectPin = new HasCorrectPin(this);
        outOfCash = new OutOfCash(this);
        atmState = noCard;
    }

    public void setAtmState(ATMState newAtmState){
        atmState = newAtmState;
    }

    public void withdrawCash(int amount){
        cashInAtm-=amount;
    }
    public void addCash(int amount){
        cashInAtm+=amount;
    }

    public void insertCard(){
        atmState.insertCard();
    }
    public void ejectCard(){
        atmState.ejectCard();
    }
    public void enterPin(int pin){
        atmState.enterPin(pin);
    }
    public void requestCash(int amount){
        atmState.requestCash(amount);
    }

    public ATMState getHasCard() {
        return hasCard;
    }

    public ATMState getNoCard() {
        return noCard;
    }

    public ATMState getHasCorrectPin() {
        return hasCorrectPin;
    }

    public ATMState getOutOfCash() {
        return outOfCash;
    }
}
