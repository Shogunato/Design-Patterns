package Devices.Commands.TVCommands;

import Devices.ElectronicDevices;
import Devices.Commands.Command;

public class TurnTvOn implements Command {

    ElectronicDevices device;

    public TurnTvOn(ElectronicDevices newDevice) {
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
