package Visitable;

import Visitor.Visitor;

public class Alchool implements Visitable {
    
    private double value;

    public Alchool(double newValue){
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
