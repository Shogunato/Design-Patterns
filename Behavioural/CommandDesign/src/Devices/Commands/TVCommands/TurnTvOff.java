package Devices.Commands.TVCommands;

import Devices.ElectronicDevices;
import Devices.Commands.Command;

public class TurnTvOff implements Command {

    ElectronicDevices device;

    public TurnTvOff(ElectronicDevices newDevice) {
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
