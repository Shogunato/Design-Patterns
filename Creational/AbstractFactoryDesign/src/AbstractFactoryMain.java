import ShipBuilding.Buildings.ShipBuilder;
import ShipBuilding.Buildings.ShipMaker;
import ShipBuilding.Ships.Ship;

public class AbstractFactoryMain {
    
    public static void main(String[] args) {

        ShipBuilder shipMaker = new ShipMaker();

        Ship bigShip = shipMaker.orderShip("Big");
        Ship smallShip = shipMaker.orderShip("Small");
        Ship ship = shipMaker.orderShip("i dunno");

        System.out.println(bigShip);
        System.out.println(smallShip);
        System.out.println(ship);

    }

}
