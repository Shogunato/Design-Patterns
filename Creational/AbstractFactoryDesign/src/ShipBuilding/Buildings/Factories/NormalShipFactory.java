package ShipBuilding.Buildings.Factories;

import ShipBuilding.Buildings.Factories.Parts.Engines.AverageEngine;
import ShipBuilding.Buildings.Factories.Parts.Engines.SEngine;
import ShipBuilding.Buildings.Factories.Parts.Scanners.AverageScanner;
import ShipBuilding.Buildings.Factories.Parts.Scanners.SScanner;

public class NormalShipFactory implements ShipFactory{

    @Override
    public SScanner addSScanner() {
        return new AverageScanner();
    }

    @Override
    public SEngine addSEngine() {
        return new AverageEngine();
    }
    
}
