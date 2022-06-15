package statePattern;

public interface ATMState {
    void insertCard();
    void ejectCard();
    void enterPin(int pin);
    void requestCash(int amount);
}
