import Bank.*;

public class FacadeMain {
    
    public static void main(String[] args) {

        BankAccountFacade accessBank = new BankAccountFacade(1234567, 1234);

        accessBank.deposit(3000.00);
        accessBank.withdraw(2000.00);

    }

}
