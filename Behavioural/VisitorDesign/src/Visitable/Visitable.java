package Visitable;

import Visitor.Visitor;

public interface Visitable {
    
    //The methods that connect a visitor to a visitable
    public double acceptVisitor(Visitor visitor);
    public double getValue();
    public void setValue(double newValue);

}
