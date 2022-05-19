package Bank;

//Complementary class for a more "realistic" code
public class AccountCheck {
    
    private int accountNumber = 1234567;

    public int getAccountNumber(){
        return accountNumber;
    }

    public boolean accountActive(int accountCheck) {
        return accountCheck == getAccountNumber()? true:false;
    }
}  
