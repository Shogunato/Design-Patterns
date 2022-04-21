package ShipBuilding.Buildings.Factories;

import ShipBuilding.Buildings.Factories.Parts.Engines.SEngine;
import ShipBuilding.Buildings.Factories.Parts.Engines.StrongEngine;
import ShipBuilding.Buildings.Factories.Parts.Scanners.LongRangeScanner;
import ShipBuilding.Buildings.Factories.Parts.Scanners.SScanner;

public class BigShipFactory implements ShipFactory{

    @Override
    public SScanner addSScanner() {
        return new LongRangeScanner();
    }

    @Override
    public SEngine addSEngine() {
        return new StrongEngine();
    }
    
}
