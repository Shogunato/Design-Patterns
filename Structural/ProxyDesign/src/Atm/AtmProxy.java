package Atm;

public class AtmProxy implements GetAtmData{

    private GetAtmData machine;

    public AtmProxy(GetAtmData realAtmMachine) {
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
