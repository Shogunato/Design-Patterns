package Atm;

public class Card {
    
    private int pin;

    public Card(int pin) {
        this.pin = this.setPin(pin);
    }

    public int getPin() {
        return this.pin;
    }

    public boolean insertPin(int pinQuery){
        return insertPinProtected(pinQuery);
    }
    
    private boolean insertPinProtected(int pinQuery) {
        if(pin == 0) {
            return false;
        }
        else if(pin == pinQuery) {
            return true;
        }else {
            return false;
        }
    }

    public int setPin(int newPin) {

        if(newPin < 1000 || newPin > 9999) {
            new Error("Please inser 4 digits.");
            return 0;
        }else {
            return newPin;
        }

    }

}
