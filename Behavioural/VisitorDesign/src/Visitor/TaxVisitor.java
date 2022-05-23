package Visitor;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import Visitable.*;

public class TaxVisitor implements Visitor {

    //Just for better output
    DecimalFormat df = new DecimalFormat("##.##", new DecimalFormatSymbols(Locale.UK));

    //The "visiting" itself
    @Override
    public double visit(Necessity product) {
        return Double.parseDouble(df.format(product.getValue() + product.getValue()*0.9));
    }

    @Override
    public double visit(Tabacco tabacco) {
        return Double.parseDouble(df.format(tabacco.getValue() + tabacco.getValue()*0.9));
    }

    @Override
    public double visit(Alchool beer) {
        return Double.parseDouble(df.format(beer.getValue() + (beer.getValue()*0.9)));
    }
    
}
