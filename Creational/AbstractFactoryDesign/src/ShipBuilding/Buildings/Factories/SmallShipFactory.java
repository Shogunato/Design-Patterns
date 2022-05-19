package ShipBuilding.Buildings.Factories;

import ShipBuilding.Buildings.Factories.Parts.Engines.ISEngine;
import ShipBuilding.Buildings.Factories.Parts.Engines.WeakEngine;
import ShipBuilding.Buildings.Factories.Parts.Scanners.ISScanner;
import ShipBuilding.Buildings.Factories.Parts.Scanners.ShortRangeScanner;

//The creation of the ship itself
public class SmallShipFactory implements IShipFactory {

    @Override
    public ISScanner addSScanner() {
        return new ShortRangeScanner();
    }

    @Override
    public ISEngine addSEngine() {
        return new WeakEngine();
    }
    
}
