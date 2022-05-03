import Restaurant.*;

public class TemplateMethodMain {
    
    public static void main(String[] args) {

        Sandwich s1 = new ItalianSandwich();
        s1.makeSandwich();
        System.out.println();

        Sandwich s2 = new VeggieSandwich();
        s2.makeSandwich();

    }

}
