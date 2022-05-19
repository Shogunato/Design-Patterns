import Devices.*;
import Remotes.*;
import Remotes.DVD.*;
import Remotes.TV.*;

public class BridgeMain {

    public static void main(String[] args) {

        AbstractRemoteButton tv = new TVRemoteMute(new TVDevice(1, 200));
        AbstractRemoteButton tv2 = new TVRemotePause(new TVDevice(1, 200));
        AbstractRemoteButton dvd = new DVDRemote(new DVDDevice(1, 14));

        dvd.buttonNine();
        dvd.buttonNine();
        tv.buttonNine();
        tv2.buttonNine();

    }

}