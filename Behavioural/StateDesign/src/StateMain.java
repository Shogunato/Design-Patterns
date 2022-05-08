import Atm.BankMachine;

public class StateMain {
    
    public static void main(String[] args) {

        BankMachine machine = new BankMachine();

        machine.insertCard();
        machine.ejectCard();
        machine.insertCard();
        machine.insertPin(1234);
        machine.requestCash(4000.00);
        machine.insertCard();
        machine.insertPin(1234);

    }

}
