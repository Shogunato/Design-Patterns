import Restaurant.*;

public class TemplateMethodMain {
    
    public static void main(String[] args) {

        AbstractSandwich s1 = new ItalianSandwich();
        s1.makeSandwich();
        System.out.println();

        AbstractSandwich s2 = new VeggieSandwich();
        s2.makeSandwich();

    }

}
