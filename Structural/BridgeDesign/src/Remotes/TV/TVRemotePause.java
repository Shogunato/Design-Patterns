package Remotes.TV;

import Devices.EntretainmentDevice;
import Remotes.AbstractRemoteButton;

//"Addon" for the abstract class
public class TVRemotePause extends AbstractRemoteButton {

    public TVRemotePause(EntretainmentDevice newDevice) {

        super(newDevice);
    }

    //The "addon" contribution
    @Override
    public void buttonNine() {
        System.out.println("TV was paused");
        
    }  

}
