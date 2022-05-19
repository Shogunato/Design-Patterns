package Bank;

//Complementary class for a more "realistic" code
public class SecurityCodeCheck {
    
    private int securityCode = 1234;

    public int getSecurityCode() {
        return securityCode;
    }

    public boolean sercurityCodeActive(int checkCode) {
        return getSecurityCode() == checkCode? true: false;
    }

}
