package ShipBuilding.Buildings;

import ShipBuilding.Ships.*;

public abstract class ShipBuilder {
    
    public abstract Ship buildShip(String shipType);

    public Ship orderShip(String shipType) {

        Ship returnShip = buildShip(shipType);

        returnShip.makeShip();

        return returnShip;
    }

}
