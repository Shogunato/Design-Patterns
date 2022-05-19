package ShipBuilding.Buildings.Factories;

import ShipBuilding.Buildings.Factories.Parts.Engines.ISEngine;
import ShipBuilding.Buildings.Factories.Parts.Engines.StrongEngine;
import ShipBuilding.Buildings.Factories.Parts.Scanners.LongRangeScanner;
import ShipBuilding.Buildings.Factories.Parts.Scanners.ISScanner;

//The creation of the ship itself
public class BigShipFactory implements IShipFactory{

    @Override
    public ISScanner addSScanner() {
        return new LongRangeScanner();
    }

    @Override
    public ISEngine addSEngine() {
        return new StrongEngine();
    }
    
}
