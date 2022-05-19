package Remotes.TV;

import Devices.EntretainmentDevice;
import Remotes.AbstractRemoteButton;

//"Addon" for the asbstract class
public class TVRemoteMute extends AbstractRemoteButton {

    public TVRemoteMute(EntretainmentDevice newDevice) {

        super(newDevice);

    }

    //The "addon" contribution
    @Override
    public void buttonNine() {
        System.out.println("TV muted");
        
        
    }

}