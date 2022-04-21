package ComputerParts;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

    private String name;
    List<Component> leafs = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component newComponent) {
        leafs.add(newComponent);
    }

    public void removeComponent(String query) {
        leafs.removeIf(c -> c.getName().equals(query));
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void showPrice(){
        leafs.forEach(c -> c.showPrice());
    }

}
