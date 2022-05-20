package Devices.Commands.TVCommands;

import Devices.IElectronicDevices;
import Devices.Commands.ICommand;

//Particular class that can be executed by the command design executable
public class TurnTvOff implements ICommand {

    IElectronicDevices device;

    public TurnTvOff(IElectronicDevices newDevice) {
        this.device = newDevice;
    }

    @Override
    public void execute() {
        device.turnOff();
        
    }

    @Override
    public void undo() {
        device.turnOn();
        
    }
    
}
