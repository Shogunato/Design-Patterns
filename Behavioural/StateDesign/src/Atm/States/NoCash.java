package Atm.States;

import Atm.BankMachine;

public class NoCash implements IAtmState {

    BankMachine machine;

    public NoCash(BankMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCard() {
        System.out.println("No cash in machine.");
        
    }

    @Override
    public void ejectCard() {
        System.out.println("No cash in machine.");
        
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("No cash in machine.");
        
    }

    @Override
    public void requestCash(double request) {
        System.out.println("No cash in machine.");
        
    }
    
}
