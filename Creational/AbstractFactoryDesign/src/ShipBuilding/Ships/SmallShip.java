package ShipBuilding.Ships;

import ShipBuilding.Buildings.Factories.IShipFactory;

//Ship template for creation
public class SmallShip extends AbstractShip{

    IShipFactory shipFactory;

    public SmallShip(IShipFactory shipFactory) {

        this.shipFactory = shipFactory;

    }

    @Override
    public void makeShip() {

        System.out.println("Making "+getName());

        engine = shipFactory.addSEngine();
        scanner = shipFactory.addSScanner();

    }
    
}
