package Remotes.DVD;

import Devices.EntretainmentDevice;
import Remotes.RemoteButton;

public class DVDRemote extends RemoteButton {

    private boolean play = true;

    public DVDRemote(EntretainmentDevice newDevice) {
        super(newDevice);
    }

    @Override
    public void buttonNine() {
        play = !play;
        System.out.println("DVD is playing: "+play);
        
    }
    
}
