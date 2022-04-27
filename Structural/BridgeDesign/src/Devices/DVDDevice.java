package Devices;

public class DVDDevice extends EntretainmentDevice {

    public DVDDevice (int newDeviceState, int newMaxSetting) {

        this.deviceStat = newDeviceState;
        this.maxSetting = newMaxSetting;

    }

    @Override
    public void buttonFive() {
        System.out.println("Moving backwards a chapter");
        deviceStat --;
        
    }

    @Override
    public void buttonSix() {
        System.out.println("Moving foward a chapter");
        deviceStat ++;
        
    }
        
}
