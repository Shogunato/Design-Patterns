package Atm;

//The proxy itself
public class AtmProxy implements IGetAtmData{

    //The ATM Machine in fact
    private IGetAtmData machine;

    public AtmProxy(IGetAtmData realAtmMachine) {
        this.machine = realAtmMachine;
    }

    @Override
    public String getData() {
        return machine.getData();
    }

    @Override
    public int getMoneyinAtm() {
        return  machine.getMoneyinAtm();
    }
    
}
