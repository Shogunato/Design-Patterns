package Pizza.Toppings;

import Pizza.Pizza;

//The class that implements the Decorator design wich will connect every Topping to be of the same interface
public abstract class IToppingDecorator implements Pizza{

    protected Pizza tempPizza;

    public IToppingDecorator(Pizza newPizza) {
        this.tempPizza = newPizza;
    }

    public String getDescription() {
        return tempPizza.getDescription();
    }

    public double getPrice() {
        return tempPizza.getPrice();
    }

}