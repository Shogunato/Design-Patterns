package Animals;

import Animals.AnimalsCaracteristcs.*;

public class Dog extends AbstractAnimals {

    public Dog() {
        
        super();
        //Uses a class to define unique characteristics
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
