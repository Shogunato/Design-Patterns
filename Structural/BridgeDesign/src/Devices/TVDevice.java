package Devices;

//"Addon" for the abstract class
public class TVDevice extends EntretainmentDevice {

    public TVDevice(int newDeviceState, int newMaxSetting) {

        deviceStat = newDeviceState;
        maxSetting = newMaxSetting;

    }

    //The "addon" contribution
    @Override
    public void buttonFive() {
        deviceStat --;
        System.out.println("Channel down");
        
    }

    //The "addon" contribution
    @Override
    public void buttonSix() {
        deviceStat ++;
        System.out.println("Channel up");
        
    }
    
}
