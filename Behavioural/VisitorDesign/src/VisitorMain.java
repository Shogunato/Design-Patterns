import Visitable.*;
import Visitor.*;

public class VisitorMain {
    
    public static void main(String[] agrs) {

        Necessity milk = new Necessity(5.90);
        Tabacco cigar = new Tabacco(15.60);
        Alchool beer = new Alchool(10.40);

        TaxVisitor taxer = new TaxVisitor();

        System.out.println(milk.acceptVisitor(taxer));
        System.out.println(cigar.acceptVisitor(taxer));
        System.out.println(beer.acceptVisitor(taxer));

    }

}
