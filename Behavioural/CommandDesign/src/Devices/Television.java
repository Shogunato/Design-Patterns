package Devices;

public class Television implements ElectronicDevices {

    private boolean power = false;
    private int volume = 0;

    @Override
    public void turnOn() {
        power = true;
        System.out.println("TV state: "+power);
        
    }

    @Override
    public void turnOff() {
        power = false;
        System.out.println("TV state: "+power);
        
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("Volume: "+volume);
        
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("Volume: "+volume);
        
    }
    
}
