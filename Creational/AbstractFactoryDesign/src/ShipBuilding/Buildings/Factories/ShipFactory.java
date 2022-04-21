package ShipBuilding.Buildings.Factories;

import ShipBuilding.Buildings.Factories.Parts.Engines.SEngine;
import ShipBuilding.Buildings.Factories.Parts.Scanners.SScanner;

public interface ShipFactory {
    
    public SScanner addSScanner();
    public SEngine addSEngine();

}
