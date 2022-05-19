package Devices;

//"Addon" for the abstract class
public class DVDDevice extends EntretainmentDevice {

    public DVDDevice (int newDeviceState, int newMaxSetting) {

        this.deviceStat = newDeviceState;
        this.maxSetting = newMaxSetting;

    }

    //The "addon" contribution
    @Override
    public void buttonFive() {
        System.out.println("Moving backwards a chapter");
        deviceStat --;
        
    }

    //The "addon" contribution
    @Override
    public void buttonSix() {
        System.out.println("Moving foward a chapter");
        deviceStat ++;
        
    }
        
}
