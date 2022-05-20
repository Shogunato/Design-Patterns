package Devices.Commands.TVCommands;

import Devices.IElectronicDevices;
import Devices.Commands.ICommand;

//Particular class that can be executed by the command design executable
public class TurnTvUp implements ICommand {

    IElectronicDevices device;

    public TurnTvUp(IElectronicDevices newDevice) {
        this.device = newDevice;
    }

    @Override
    public void execute() {
        device.volumeUp();
        
    }

    @Override
    public void undo() {
        device.volumeDown();
        
    }
    
}
