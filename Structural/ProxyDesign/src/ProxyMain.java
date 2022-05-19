import Atm.AtmMachine;
import Atm.AtmProxy;
import Atm.IGetAtmData;

public class ProxyMain {
    
    public static void main(String[] args) {

        IGetAtmData realAtmMachine = new AtmMachine();
        IGetAtmData proxyAtmMachine = new AtmProxy(realAtmMachine);
    
        System.out.println("Data="+proxyAtmMachine.getData()+"\nMoney="+proxyAtmMachine.getMoneyinAtm());
        
    }

}
