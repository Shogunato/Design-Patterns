package Pizza.Toppings;

import Pizza.Pizza;

//Complementary class for a more "realistic" code
public class TomatoSauce extends IToppingDecorator {
    
    public TomatoSauce(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding tomato sauce");

    }

    public String getDescription() {
        return tempPizza.getDescription()+", tomato sauce";
    }

    public double getPrice() {
        return tempPizza.getPrice()+.35;
    }

}
