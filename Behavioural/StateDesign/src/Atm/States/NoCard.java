package Atm.States;

import Atm.BankMachine;

public class NoCard implements IAtmState {

    BankMachine machine;

    public NoCard(BankMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card inserted.");
        machine.setATMState(machine.getHasCardState());
        
    }

    @Override
    public void ejectCard() {
        System.out.println("No card to be ejected.");
        
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("Please insert a card first.");
        
    }

    @Override
    public void requestCash(double request) {
        System.out.println("Please insert a card first.");
        
    }
    
}
