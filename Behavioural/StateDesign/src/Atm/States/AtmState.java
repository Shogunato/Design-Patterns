package Atm.States;

//Interface that connects all possible states for the ATM 
public interface AtmState {
    
    //Each state class has an unique response to one of these methods depending on the current state
    public void insertCard();
    public void ejectCard();
    public void insertPin(int pin);
    public void requestCash(double request);

}
