package Animals;

import Animals.AnimalsCaracteristcs.IFlys;

public abstract class AbstractAnimals {
    
    //Leaves it blank as to what flyingType the animal may be
    public IFlys flyingType;

    public abstract void makeSound();

    public void eat() {
        System.out.println("I eat yes.");
    }

    public void drink() {
        System.out.println("I drink yes.");
    }

    public String tryToFly() {
        return flyingType.fly();
    }

    public void setFlyingType(IFlys type) {
        this.flyingType = type;
    }

}
