import Atm.AtmMachine;
import Atm.AtmProxy;
import Atm.GetAtmData;

public class ProxyMain {
    
    public static void main(String[] args) {

        GetAtmData realAtmMachine = new AtmMachine();
        GetAtmData proxyAtmMachine = new AtmProxy(realAtmMachine);
    
        System.out.println("Data="+proxyAtmMachine.getData()+"\nMoney="+proxyAtmMachine.getMoneyinAtm());
        
    }

}
