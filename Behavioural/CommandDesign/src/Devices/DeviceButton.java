package Devices;

import Devices.Commands.ICommand;

//The executioner of the command design pattern
public class DeviceButton {
    
    //custom command
    ICommand theCommand;

    public DeviceButton(ICommand newCommand) {
        this.theCommand = newCommand;
    }

    //execution
    public void press() {
        theCommand.execute();
    }

    //execution
    public void pressUndo() {
        theCommand.undo();
    }

}
