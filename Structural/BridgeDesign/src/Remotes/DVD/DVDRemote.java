package Remotes.DVD;

import Devices.EntretainmentDevice;
import Remotes.AbstractRemoteButton;

//"Addon" for the abstract class
public class DVDRemote extends AbstractRemoteButton {

    private boolean play = true;

    public DVDRemote(EntretainmentDevice newDevice) {
        super(newDevice);
    }

    //The "addon" contribution
    @Override
    public void buttonNine() {
        play = !play;
        System.out.println("DVD is playing: "+play);
        
    }
    
}
