package conversion.expressions;

//Conversion from liters to...
//Object that the user can ask for
public class Liters extends AbstractExpression {

    @Override
    public String liters(double question) {
        return Double.toString(question);
    }

    @Override
    public String deciliters(double question) {
        return Double.toString(question*10);
    }

    @Override
    public String centiliters(double question) {
        return Double.toString(question*100);
    }

    @Override
    public String milliliters(double question) {
        return Double.toString(question*1000);
    }

    
}
