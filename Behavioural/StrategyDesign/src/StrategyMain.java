import Animals.*;
import Animals.AnimalsCaracteristcs.CantFly;
import Animals.AnimalsCaracteristcs.ItFlys;

public class StrategyMain {
    
    public static void main(String[] args) {

        Animals dog = new Dog();
        Animals bird = new Bird();

        System.out.println(dog.tryToFly());
        System.out.println(bird.tryToFly());

        dog.setFlyingType(new ItFlys());
        bird.setFlyingType(new CantFly());

        System.out.println(dog.tryToFly());
        System.out.println(bird.tryToFly());

    }

}
