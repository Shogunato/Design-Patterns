package ShipBuilding.Buildings.Factories;

import ShipBuilding.Buildings.Factories.Parts.Engines.SEngine;
import ShipBuilding.Buildings.Factories.Parts.Engines.WeakEngine;
import ShipBuilding.Buildings.Factories.Parts.Scanners.SScanner;
import ShipBuilding.Buildings.Factories.Parts.Scanners.ShortRangeScanner;

public class SmallShipFactory implements ShipFactory {

    @Override
    public SScanner addSScanner() {
        return new ShortRangeScanner();
    }

    @Override
    public SEngine addSEngine() {
        return new WeakEngine();
    }
    
}
