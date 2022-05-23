import Animals.*;
import Animals.AnimalsCaracteristcs.CantFly;
import Animals.AnimalsCaracteristcs.ItFlys;

public class StrategyMain {
    
    public static void main(String[] args) {

        AbstractAnimals dog = new Dog();
        AbstractAnimals bird = new Bird();

        System.out.println(dog.tryToFly());
        System.out.println(bird.tryToFly());

        dog.setFlyingType(new ItFlys());
        bird.setFlyingType(new CantFly());

        //a dog that flies and a bird that cant fly, customization i suppose...
        System.out.println(dog.tryToFly());
        System.out.println(bird.tryToFly());

    }

}
