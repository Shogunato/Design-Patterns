package Restaurant;

public class VeggieSandwich extends Sandwich {

    String[] vegetablesUsed = {"Peppers", "Tomato", "Lettuce", "Onions"};
    String[] condimentsUsed = {"Oil", "Vinegar"};

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
