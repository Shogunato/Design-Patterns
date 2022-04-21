package ShipBuilding.Ships;

import ShipBuilding.Buildings.Factories.ShipFactory;

public class NormalShip extends Ship{

    ShipFactory shipFactory;

    public NormalShip(ShipFactory shipFactory) {

        this.shipFactory = shipFactory;

    }

    @Override
    public void makeShip() {

        System.out.println("Making "+getName());

        engine = shipFactory.addSEngine();
        scanner = shipFactory.addSScanner();

    }
    
}
