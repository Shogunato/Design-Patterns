package Devices.Commands.TVCommands;

import Devices.IElectronicDevices;
import Devices.Commands.ICommand;

//Particular class that can be executed by the command design executable
public class TurnTvDown implements ICommand {
    
    IElectronicDevices device;

    public TurnTvDown(IElectronicDevices newDevice) {
        this.device = newDevice;
    }

    @Override
    public void execute() {
        device.volumeDown();
        
    }

    @Override
    public void undo() {
        device.volumeUp();
        
    }

}
