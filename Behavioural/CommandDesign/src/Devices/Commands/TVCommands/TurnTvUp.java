package Devices.Commands.TVCommands;

import Devices.ElectronicDevices;
import Devices.Commands.Command;

public class TurnTvUp implements Command {

    ElectronicDevices device;

    public TurnTvUp(ElectronicDevices newDevice) {
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
