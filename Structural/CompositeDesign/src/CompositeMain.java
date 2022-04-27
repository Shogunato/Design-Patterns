import ComputerParts.*;

public class CompositeMain {
    
    public static void main(String[] args) {
        
        Component hardDrive = new Leaf(1000, "HardDrive");
        Component mouse = new Leaf(100, "Mouse");
        Component monitor = new Leaf(600, "Monitor");
        Component ram = new Leaf(300, "Ram");
        Component cpu = new Leaf(1300, "CPU");

        Composite peripheral = new Composite("Peripheral");
        Composite cabinet = new Composite("Cabinet");
        Composite motherBoard = new Composite("MotherBoard");
        Composite computer = new Composite("Computer");

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
