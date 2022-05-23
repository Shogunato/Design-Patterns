package Restaurant;

public class VeggieSandwich extends AbstractSandwich {

    String[] vegetablesUsed = {"Peppers", "Tomato", "Lettuce", "Onions"};
    String[] condimentsUsed = {"Oil", "Vinegar"};

    //It overrides what it wans to customize from the sandwich
    @Override
    boolean customerWantsCheese() {return false;}

    @Override
    boolean customerWantsMeat() {return false;}

    @Override
    void addCondiments() {
        System.out.print("Adding condiments: ");

        for(String condiment: condimentsUsed) {System.out.print(condiment+ ", ");}
        System.out.println();
        
    }

    @Override
    void addVegetables() {
        System.out.print("Adding vegetables: ");

        for(String vegetable: vegetablesUsed) {System.out.print(vegetable+", ");}
        System.out.println();
        
    }

    @Override
    void addCheese() {}

    @Override
    void addMeat() {}
    
}
