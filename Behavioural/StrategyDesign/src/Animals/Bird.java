package Animals;

import Animals.AnimalsCaracteristcs.ItFlys;

public class Bird extends AbstractAnimals {

    public Bird() {
        super();
        //Uses a class to define unique characteristics
        this.flyingType = new ItFlys();
    }

    @Override
    public void makeSound() {
        System.out.println("i dont... i dont know what sound a bird makes... cri cri?");
        
    }
    
    public void haveWeakBones() {
        System.out.println("Weird fact you choose uhm... i guess i have weak bones...");
    }

}
