package Bank;

//Actual implementation of the Facade design pattern were the actual methods reside outside of the mais class
//on complementary classes

public class BankAccountFacade {
    
    private int accountNumber;
    private int key;
    AccountCheck acctCheck;
    FundsCheck fundCheck;
    SecurityCodeCheck securityChek;
    Bank bank;


    public BankAccountFacade(int accountNumber, int key) {

        this.accountNumber = accountNumber;
        this.key = key;

        acctCheck = new AccountCheck();
        fundCheck = new FundsCheck();
        securityChek = new SecurityCodeCheck();
        bank = new Bank();

    }

    public void withdraw(double request) {

        //Bunch of the checkers for "security"
        if(acctCheck.accountActive(getAccountNumber()) 
           && securityChek.sercurityCodeActive(getKey()) 
           && fundCheck.withdrawMoney(request)) {

            System.out.println("Transaction Complete");

           } else {
               System.out.println("Transaction Failed");
           }
    }

    public void deposit(double deposit) {

        //Checkers for "security"
        if(acctCheck.accountActive(getAccountNumber()) && securityChek.sercurityCodeActive(getKey())) {

            fundCheck.despositCash(deposit);
            System.out.println("Transaction Complete");

        } else {
            System.out.println("Transaction Failed");
        }

    }

    public int getAccountNumber() { return accountNumber;}
    public int getKey() { return key; }

}
