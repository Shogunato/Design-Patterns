package Devices.Commands;

//Interface that connects all commands
public interface ICommand {

    public void execute();
    public void undo();

}