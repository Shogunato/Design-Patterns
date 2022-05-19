package ShipBuilding.Buildings;

import ShipBuilding.Buildings.Factories.*;
import ShipBuilding.Ships.*;

//The Actual ship maker/builder
public class ShipMaker extends AbstractShipBuilder{

    @Override
    public AbstractShip buildShip(String shipType) {
        
        AbstractShip returnShip = null;

        switch(shipType) {
            case("Big"): {
                
                //Creates factory to return the parts to be used for maximum custmization
                BigShipFactory bigShipPartsFactory = new BigShipFactory();
                returnShip = new BigShip(bigShipPartsFactory);
                returnShip.setName("Big Ship");
                return returnShip;

            }

            case("Small"): {

                //Creates factory to return the parts to be used for maximum custmization
                SmallShipFactory smallShipPartsFactory = new SmallShipFactory();
                returnShip = new SmallShip(smallShipPartsFactory);
                returnShip.setName("Small Ship");
                return returnShip;

            }

            default: {

                //Creates factory to return the parts to be used for maximum custmization
                NormalShipFactory normalShipPartsFactory = new NormalShipFactory();
                returnShip = new NormalShip(normalShipPartsFactory);
                returnShip.setName("Normal Ship");
                return returnShip;
                
            }

        }
        
    }
    
}
