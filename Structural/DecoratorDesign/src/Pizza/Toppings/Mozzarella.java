package Pizza.Toppings;

import Pizza.Pizza;

//Complementary class for a more "realistic" code
public class Mozzarella extends IToppingDecorator {

    public Mozzarella(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding mozzarella");
        System.out.println("Adding Dough");
    }

    public String getDescription() {
        return tempPizza.getDescription()+ ", mozzarella";
    }

    public double getPrice() {
        return tempPizza.getPrice()+.50;
    }
    
}
