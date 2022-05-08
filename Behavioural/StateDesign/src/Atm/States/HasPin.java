package Atm.States;

import Atm.BankMachine;

public class HasPin implements AtmState {

    BankMachine machine;

    public HasPin(BankMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card already inserted.");
        
    }

    @Override
    public void ejectCard() {
        System.out.println("Ejecting card...");
        machine.setATMState(machine.getNoCardState());
        
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("Pin already inserted.");
        
    }

    @Override
    public void requestCash(double request) {
        machine.requestCash(request);
        
    }
    
}
