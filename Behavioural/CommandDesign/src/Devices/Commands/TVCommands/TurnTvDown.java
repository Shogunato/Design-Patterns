package Devices.Commands.TVCommands;

import Devices.ElectronicDevices;
import Devices.Commands.Command;

public class TurnTvDown implements Command {
    
    ElectronicDevices device;

    public TurnTvDown(ElectronicDevices newDevice) {
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
