package Atm;

import Atm.States.*;

public class BankMachine {
    
    private AtmState atmState;
    private AtmState hasCard;
    private AtmState noCard;
    private AtmState hasPin;
    private AtmState noCash;

    private double cashInMachine = 4000.00;

    private boolean pintState = false;

    public BankMachine() {

        this.hasCard = new HasCard(this);
        this.noCard = new NoCard(this);
        this.hasPin = new HasPin(this);
        this.noCash = new NoCash(this);

        this.atmState = noCard;

        if(cashInMachine < 0){
            setATMState(noCash);
        }

    }

    public void insertCard() {
        atmState.insertCard();
        
    }

    public void ejectCard() {
        atmState.ejectCard();
        
    }

    public void insertPin(int pin) {
        atmState.insertPin(pin);
        
    }

    public void requestCash(double request) {

        if(request > cashInMachine) {

            System.out.println("Not enough money in machine.");
            setATMState(hasPin);

        }else {

            System.out.println("Transaction Complete.\nEjecting Card...");
            cashInMachine -= request;

            if(cashInMachine == 0){
                setATMState(noCash);
            }else{
                setATMState(noCard);
            }

        }
        
    }

    public void setATMState(AtmState newState) {
        this.atmState = newState;
    }

    public void setCashInMachine(double newCashInMachine) {
        this.cashInMachine = newCashInMachine;
    }

    public void setPinState(boolean newState){
        this.pintState = newState;
    }

    public AtmState getHasCardState() {return this.hasCard;}
    public AtmState getNoCardState() {return this.noCard;}
    public AtmState getHasPinState() {return this.hasPin;}
    public AtmState getNoCashState() {return this.noCash;}

    public boolean getPinState() {return this.pintState;}

}
