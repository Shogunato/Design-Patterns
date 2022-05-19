package Devices;

//Abstract class that is the base for the Object
public abstract class EntretainmentDevice {
    
    public int deviceStat;
    public int maxSetting;
    public int volumeLevel = 0;

    //Methods that require implemetation
    public abstract void buttonFive();
    public abstract void buttonSix();

    public void deviceFeedback() {

        if(deviceStat > maxSetting || deviceStat < 0) {deviceStat = 0;}
        System.out.println("On: "+deviceStat);

    }

    public void buttonSeven() {
        volumeLevel ++;
        System.out.println("Volume: "+volumeLevel);
    }

    public void buttonEight() {
        volumeLevel --;
        System.out.println("Volume: "+volumeLevel);
    }
    
}
