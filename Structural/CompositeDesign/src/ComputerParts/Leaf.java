package ComputerParts;

public class Leaf implements Component {

    private int price;
    private String name;

    public Leaf(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public void showPrice(){
        System.out.println(name+" : "+price);
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

}
