package Remotes.TV;

import Devices.EntretainmentDevice;
import Remotes.RemoteButton;

public class TVRemoteMute extends RemoteButton {

    public TVRemoteMute(EntretainmentDevice newDevice) {

        super(newDevice);

    }

    @Override
    public void buttonNine() {
        System.out.println("TV muted");
        
        
    }

}