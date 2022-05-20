package Devices.Commands.TVCommands;

import Devices.IElectronicDevices;
import Devices.Commands.ICommand;

//Particular class that can be executed by the command design executable
public class TurnTvOn implements ICommand {

    IElectronicDevices device;

    public TurnTvOn(IElectronicDevices newDevice) {
        this.device = newDevice;
    }

    @Override
    public void execute() {
        device.turnOn();
        
    }

    @Override
    public void undo() {
       device.turnOff();
        
    }
    
}
