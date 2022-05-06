import Animals.*;

public class StrategyMain {
    
    public static void main(String[] args) {

        Animals dog = new Dog();
        Animals bird = new Bird();

        System.out.println(dog.tryToFly());
        System.out.println(bird.tryToFly());

    }

}
