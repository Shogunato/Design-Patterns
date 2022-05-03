package Restaurant;

public class ItalianSandwich extends Sandwich {

    String[] meatUsed = {"Salami", "Ham", "Pepperoni"};
    String[] cheeseUsed = {"Provolone"};
    String[] vegetablesUsed = {"Peppers", "Tomato", "Lettuce", "Onions"};
    String[] condimentsUsed = {"Oil", "Vinegar"};

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
    void addCheese() {
        System.out.print("Adding cheese: ");

        for(String cheese: cheeseUsed) {System.out.print(cheese+", ");}
        System.out.println();
        
    }

    @Override
    void addMeat() {
        System.out.print("Adding meat: ");
        
        for(String meat: meatUsed) {System.out.print(meat+", ");}
        System.out.println();
        
    }
    
}
