package Remotes;

import Devices.EntretainmentDevice;

public abstract class RemoteButton {

    private EntretainmentDevice device;

    public RemoteButton(EntretainmentDevice newDevice) {
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

    public abstract void buttonNine();

}
