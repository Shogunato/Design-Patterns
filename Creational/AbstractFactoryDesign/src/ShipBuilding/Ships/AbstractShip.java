package ShipBuilding.Ships;

import ShipBuilding.Buildings.Factories.Parts.Engines.*;
import ShipBuilding.Buildings.Factories.Parts.Scanners.*;

//Base of a ship
public abstract class AbstractShip {
    
    private String name;
    ISEngine engine;
    ISScanner scanner;

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    //Customization
    public abstract void makeShip();

    @Override
    public String toString() {
        return "[Name="+name+", Engine="+engine+", Scanner="+scanner+"]";
    }
    
}
