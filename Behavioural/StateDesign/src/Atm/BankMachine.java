package Atm;

import Atm.States.*;

public class BankMachine {
    
    private IAtmState atmState;
    private IAtmState hasCard;
    private IAtmState noCard;
    private IAtmState hasPin;
    private IAtmState noCash;

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

    //It executes atmState as it changes from state to state
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

    public void setATMState(IAtmState newState) {
        this.atmState = newState;
    }

    public void setCashInMachine(double newCashInMachine) {
        this.cashInMachine = newCashInMachine;
    }

    public void setPinState(boolean newState){
        this.pintState = newState;
    }

    public IAtmState getHasCardState() {return this.hasCard;}
    public IAtmState getNoCardState() {return this.noCard;}
    public IAtmState getHasPinState() {return this.hasPin;}
    public IAtmState getNoCashState() {return this.noCash;}

    public boolean getPinState() {return this.pintState;}

}
