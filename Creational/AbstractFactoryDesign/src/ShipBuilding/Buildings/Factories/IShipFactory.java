package ShipBuilding.Buildings.Factories;

import ShipBuilding.Buildings.Factories.Parts.Engines.ISEngine;
import ShipBuilding.Buildings.Factories.Parts.Scanners.ISScanner;

//Interface that connects all factories
public interface IShipFactory {
    
    public ISScanner addSScanner();
    public ISEngine addSEngine();

}
