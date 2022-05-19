package Atm;

//Interface used for connecting the proxy with the class itself
public interface IGetAtmData {
    
    //Methods from the class that the proxy/user will be able to use
    public int getMoneyinAtm();
    public String getData();

}
