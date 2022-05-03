package Restaurant;

public abstract class Sandwich {

    public final void makeSandwich() {

        cutBun();

        if(customerWantsMeat()){ addMeat();}
        if(customerWantsCheese()) {addCheese();}
        if(customerWantsCondiments()) {addCondiments();}
        if(customerWantsVegetables()) {addVegetables();}

        closeSandwich();
    }

    public void cutBun() {
        System.out.println("Cutting sandwich...");
    }

    abstract void addCondiments();
    boolean customerWantsCondiments() {return true;}

    abstract void addVegetables();
    boolean customerWantsVegetables() {return true;}

    abstract void addCheese();
    boolean customerWantsCheese() {return true;}

    abstract void addMeat();
    boolean customerWantsMeat() {return true;}

    public void closeSandwich() {
        System.out.println("Closing sandwich...");
    }

}
