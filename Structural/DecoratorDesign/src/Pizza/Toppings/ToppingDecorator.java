package Pizza.Toppings;

import Pizza.Pizza;

public abstract class ToppingDecorator implements Pizza{

    protected Pizza tempPizza;

    public ToppingDecorator(Pizza newPizza) {
        this.tempPizza = newPizza;
    }

    public String getDescription() {
        return tempPizza.getDescription();
    }

    public double getPrice() {
        return tempPizza.getPrice();
    }

}