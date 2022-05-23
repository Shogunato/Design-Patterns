package Atm.States;

import Atm.BankMachine;

public class HasCard implements IAtmState {

    BankMachine machine;

    public HasCard(BankMachine newMachine) {
        this.machine = newMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Can't insert more than one card.");
        
    }

    @Override
    public void ejectCard() {
        System.out.println("Ejecting card...");
        machine.setATMState(machine.getNoCardState());
        
    }

    @Override
    public void insertPin(int pin) {
        if(pin == 1234) {
        
            System.out.println("Correct pin inserted.");
            machine.setPinState(true);
            machine.setATMState(machine.getHasPinState());
        
        }else{

            System.out.println("Incorrect pin.");
            machine.setPinState(false);
            System.out.println("Ejecting card...");
            machine.setATMState(machine.getNoCardState());
        
        }

    }

    @Override
    public void requestCash(double request) {
        System.out.println("Enter pin first.");
        
    }
    
}
