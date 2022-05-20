import Devices.*;
import Devices.Commands.TVCommands.*;

public class CommandMain {
    
    public static void main(String[] args) {

        IElectronicDevices device = TvRemote.getDevice();
        TurnTvOn on = new TurnTvOn(device);
        DeviceButton buttonOn = new DeviceButton(on);

        TurnTvOff off = new TurnTvOff(device);
        DeviceButton buttonOff = new DeviceButton(off);

        TurnTvDown down = new TurnTvDown(device);
        DeviceButton buttonDown = new DeviceButton(down);

        TurnTvUp up = new TurnTvUp(device);
        DeviceButton buttonUp = new DeviceButton(up);

        buttonOn.press();
        buttonOff.press();
        buttonUp.press();
        buttonUp.press();
        buttonDown.press();
        buttonDown.press();
        System.out.println();
        buttonOn.pressUndo();
        buttonOff.pressUndo();
        buttonUp.pressUndo();
        buttonUp.pressUndo();
        buttonDown.pressUndo();
        buttonDown.pressUndo();

    }

}
