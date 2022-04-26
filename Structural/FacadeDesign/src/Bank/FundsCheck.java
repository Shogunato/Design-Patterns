package Bank;

public class FundsCheck {
    
    private double cashInAccount = 3000.00;

    private double getCashInAccount() {
        return cashInAccount;
    }

    private void descreaseCashInAccount(double cash) {
        cashInAccount -= cash;
    }

    private void depositCashInAccount(double cash) {
        cashInAccount += cash;
    }

    public boolean withdrawMoney(double cash) {
        
        if(cash > getCashInAccount()) {
            System.out.println("Error: Current balance: "+getCashInAccount());
            return false;
        } else {
            descreaseCashInAccount(cash);
            System.out.println("New Balance: "+getCashInAccount());
            return true;
        }
    }

    public void despositCash(double cash) {

        depositCashInAccount(cash);
        System.out.println("New Balance: "+getCashInAccount());

    }

}
