package Visitor;

import Visitable.*;

public interface Visitor {
    
    public double visit(Necessity product);
    public double visit(Tabacco tabacco);
    public double visit(Alchool beer);

}
