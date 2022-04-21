package ShipBuilding.Ships;

import ShipBuilding.Buildings.Factories.Parts.Engines.*;
import ShipBuilding.Buildings.Factories.Parts.Scanners.*;

public abstract class Ship {
    
    private String name;
    SEngine engine;
    SScanner scanner;

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public abstract void makeShip();

    @Override
    public String toString() {
        return "[Name="+name+", Engine="+engine+", Scanner="+scanner+"]";
    }
    
}
