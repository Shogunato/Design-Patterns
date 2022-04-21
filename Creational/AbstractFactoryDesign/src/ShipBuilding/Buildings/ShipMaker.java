package ShipBuilding.Buildings;

import ShipBuilding.Buildings.Factories.*;
import ShipBuilding.Ships.*;

public class ShipMaker extends ShipBuilder{

    @Override
    public Ship buildShip(String shipType) {
        
        Ship returnShip = null;

        switch(shipType) {
            case("Big"): {
                
                BigShipFactory bigShipPartsFactory = new BigShipFactory();
                returnShip = new BigShip(bigShipPartsFactory);
                returnShip.setName("Big Ship");
                return returnShip;

            }

            case("Small"): {

                SmallShipFactory smallShipPartsFactory = new SmallShipFactory();
                returnShip = new SmallShip(smallShipPartsFactory);
                returnShip.setName("Small Ship");
                return returnShip;

            }

            default: {

                NormalShipFactory normalShipPartsFactory = new NormalShipFactory();
                returnShip = new NormalShip(normalShipPartsFactory);
                returnShip.setName("Normal Ship");
                return returnShip;
                
            }

        }
        
    }
    
}
