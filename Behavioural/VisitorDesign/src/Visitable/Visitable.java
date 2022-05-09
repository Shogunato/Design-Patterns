package Visitable;

import Visitor.Visitor;

public interface Visitable {
    
    public double acceptVisitor(Visitor visitor);
    public double getValue();
    public void setValue(double newValue);

}
