package ShipBuilding.Buildings;

import ShipBuilding.Ships.*;

//Abstract class used for the request and standardization of makers
public abstract class AbstractShipBuilder {
    
    //Maker standardization
    public abstract AbstractShip buildShip(String shipType);

    //Request
    public AbstractShip orderShip(String shipType) {

        AbstractShip returnShip = buildShip(shipType);

        returnShip.makeShip();

        return returnShip;
    }

}
