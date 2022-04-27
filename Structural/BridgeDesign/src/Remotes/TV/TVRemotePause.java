package Remotes.TV;

import Devices.EntretainmentDevice;
import Remotes.RemoteButton;

public class TVRemotePause extends RemoteButton {

    public TVRemotePause(EntretainmentDevice newDevice) {
        super(newDevice);
    }

    @Override
    public void buttonNine() {
        System.out.println("TV was paused");
        
    }  

}
