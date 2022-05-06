package Animals;

import Animals.AnimalsCaracteristcs.Flys;

public abstract class Animals {
    
    public Flys flyingType;

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

    public void setFlyingType(Flys type) {
        this.flyingType = type;
    }

}
