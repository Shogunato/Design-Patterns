package Visitable;

import Visitor.Visitor;

public class Necessity implements Visitable {
    
    private double value;

    public Necessity(double newValue){
        this.value = newValue;
    }

    @Override
    public double acceptVisitor(Visitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public double getValue() {return value;}

    @Override
    public void setValue(double newValue) {this.value = newValue;}
    
}
