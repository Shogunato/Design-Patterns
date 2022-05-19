import ComputerParts.*;

public class CompositeMain {
    
    public static void main(String[] args) {
        
        //Objects itself

        IComponent hardDrive = new Leaf(1000, "HardDrive");
        IComponent mouse = new Leaf(100, "Mouse");
        IComponent monitor = new Leaf(600, "Monitor");
        IComponent ram = new Leaf(300, "Ram");
        IComponent cpu = new Leaf(1300, "CPU");

        //Categories

        Composite peripheral = new Composite("Peripheral");
        Composite cabinet = new Composite("Cabinet");
        Composite motherBoard = new Composite("MotherBoard");
        Composite computer = new Composite("Computer");

        //Creation of the tree

        motherBoard.addComponent(ram);
        motherBoard.addComponent(cpu);

        peripheral.addComponent(mouse);
        peripheral.addComponent(monitor);
        cabinet.addComponent(hardDrive);
        cabinet.addComponent(motherBoard);
        computer.addComponent(peripheral);
        computer.addComponent(cabinet);

        computer.showPrice();

    }

}
