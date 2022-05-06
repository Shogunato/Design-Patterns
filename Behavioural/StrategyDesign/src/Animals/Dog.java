package Animals;

import Animals.AnimalsCaracteristcs.*;

public class Dog extends Animals {

    public Dog() {
        
        super();
        flyingType = new CantFly();

    }

    @Override
    public void makeSound() {
        System.out.println("Bark bark");
        
    }

    public void dig() {
        System.out.println("I dig yes.");
    }
    
}
