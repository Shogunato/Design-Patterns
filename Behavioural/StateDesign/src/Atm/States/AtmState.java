package Atm.States;

public interface AtmState {
    
    public void insertCard();
    public void ejectCard();
    public void insertPin(int pin);
    public void requestCash(double request);

}
