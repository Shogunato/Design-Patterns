package Devices;

public class TVDevice extends EntretainmentDevice {

    public TVDevice(int newDeviceState, int newMaxSetting) {

        deviceStat = newDeviceState;
        maxSetting = newMaxSetting;

    }

    @Override
    public void buttonFive() {
        deviceStat --;
        System.out.println("Channel down");
        
    }

    @Override
    public void buttonSix() {
        deviceStat ++;
        System.out.println("Channel up");
        
    }
    
}
