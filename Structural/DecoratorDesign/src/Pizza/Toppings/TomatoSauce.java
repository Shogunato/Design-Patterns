package Pizza.Toppings;

import Pizza.Pizza;

public class TomatoSauce extends ToppingDecorator {
    
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
