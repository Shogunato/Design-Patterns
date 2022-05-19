package ComputerParts;

import java.util.ArrayList;
import java.util.List;

//Upper class in the tree the composite
public class Composite implements IComponent{

    private String name;
    List<IComponent> leafs = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(IComponent newComponent) {
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
