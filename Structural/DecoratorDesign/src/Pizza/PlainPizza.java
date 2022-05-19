package Pizza;

//Complementary class for a more "realistic" code
public class PlainPizza implements Pizza {

    @Override
    public double getPrice() {
        return 4.00;
    }

    @Override
    public String getDescription() {
        return "Thin Dough";
    }
    
}
