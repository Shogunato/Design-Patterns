package Visitable;

import Visitor.Visitor;

public class Tabacco implements Visitable {

    private double value;

    public Tabacco(double newValue) {
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
