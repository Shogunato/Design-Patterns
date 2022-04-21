package ShipBuilding.Ships;

import ShipBuilding.Buildings.Factories.ShipFactory;

public class SmallShip extends Ship{

    ShipFactory shipFactory;

    public SmallShip(ShipFactory shipFactory) {

        this.shipFactory = shipFactory;

    }

    @Override
    public void makeShip() {

        System.out.println("Making "+getName());

        engine = shipFactory.addSEngine();
        scanner = shipFactory.addSScanner();

    }
    
}
