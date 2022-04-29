import Pizza.*;
import Pizza.Toppings.*;

public class DecoratorMain {
    
    public static void main(String[] args) {

        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
        System.out.println(basicPizza.getDescription());
        System.out.println(basicPizza.getPrice());

    }

}
