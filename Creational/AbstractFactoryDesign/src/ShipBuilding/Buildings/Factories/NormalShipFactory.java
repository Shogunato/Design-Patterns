package ShipBuilding.Buildings.Factories;

import ShipBuilding.Buildings.Factories.Parts.Engines.AverageEngine;
import ShipBuilding.Buildings.Factories.Parts.Engines.ISEngine;
import ShipBuilding.Buildings.Factories.Parts.Scanners.AverageScanner;
import ShipBuilding.Buildings.Factories.Parts.Scanners.ISScanner;

//The creation of the ship itself
public class NormalShipFactory implements IShipFactory{

    @Override
    public ISScanner addSScanner() {
        return new AverageScanner();
    }

    @Override
    public ISEngine addSEngine() {
        return new AverageEngine();
    }
    
}
