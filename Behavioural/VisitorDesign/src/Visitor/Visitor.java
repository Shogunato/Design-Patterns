package Visitor;

import Visitable.*;

public interface Visitor {
    
    //Classes that the visitor can "visit"
    public double visit(Necessity product);
    public double visit(Tabacco tabacco);
    public double visit(Alchool beer);

}
