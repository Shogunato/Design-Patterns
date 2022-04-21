package ShipBuilding.Ships;

import ShipBuilding.Buildings.Factories.ShipFactory;

public class BigShip extends Ship{

    ShipFactory shipFactory;

    public BigShip(ShipFactory shipFactory) {

        this.shipFactory = shipFactory;

    }

    @Override
    public void makeShip() {

        System.out.println("Making "+getName());

        engine = shipFactory.addSEngine();
        scanner = shipFactory.addSScanner();

    }

}
