package ShipBuilding.Ships;

import ShipBuilding.Buildings.Factories.IShipFactory;

//Ship template for creation
public class NormalShip extends AbstractShip{

    IShipFactory shipFactory;

    public NormalShip(IShipFactory shipFactory) {

        this.shipFactory = shipFactory;

    }

    @Override
    public void makeShip() {

        System.out.println("Making "+getName());

        engine = shipFactory.addSEngine();
        scanner = shipFactory.addSScanner();

    }
    
}
