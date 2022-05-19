package Remotes;

import Devices.EntretainmentDevice;

//Abstract class that is the base for any other class
public abstract class AbstractRemoteButton {

    private EntretainmentDevice device;

    public AbstractRemoteButton(EntretainmentDevice newDevice) {
        this.device = newDevice;
    }

    public void buttonFive() {
        device.buttonFive();
    }

    public void buttonSix() {
        device.buttonSix();
    }

    public void deviceFeedback() {
        device.deviceFeedback();
    }

    //The method for the "addon" to complement
    public abstract void buttonNine();

}
