import ShipBuilding.Buildings.AbstractShipBuilder;
import ShipBuilding.Buildings.ShipMaker;
import ShipBuilding.Ships.AbstractShip;

public class AbstractFactoryMain {
    
    public static void main(String[] args) {

        AbstractShipBuilder shipMaker = new ShipMaker();

        AbstractShip bigShip = shipMaker.orderShip("Big");
        AbstractShip smallShip = shipMaker.orderShip("Small");
        AbstractShip ship = shipMaker.orderShip("i dunno");

        System.out.println(bigShip);
        System.out.println(smallShip);
        System.out.println(ship);

    }

}
