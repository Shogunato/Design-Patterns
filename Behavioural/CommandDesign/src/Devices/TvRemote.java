package Devices;

public class TvRemote {
    
    public static IElectronicDevices getDevice() {
        return new Television();
    }
}
