package conversion;

public class ConversionContext {
    
    private String conversionQues;
    private String conversionResponse;
    private String fromConversion;
    private String toConversion;

    private double quantity;

    String[] partsOfQues;

    public ConversionContext(String input) {

        this.conversionQues = input;

        partsOfQues = getInput().split(" ");
        fromConversion = getCapitalized(partsOfQues[1]);
        toConversion = partsOfQues[3].toLowerCase();
        conversionResponse = partsOfQues[0]+" "+partsOfQues[1]+" equals ";

        quantity = Double.valueOf(partsOfQues[0]);

    }

    private String getCapitalized(String string) {

        if(string.charAt(string.length()-1) != 's'){

            string += "s";

        }
        return Character.toUpperCase(string.charAt(0))+string.substring(1);

    }

    public String getInput() {return conversionQues;}

    public String getConversionResponse() {
        return conversionResponse;
    }

    public String getFromConversion() {
        return fromConversion;
    }

    public String getToConversion() {
        return toConversion;
    }

    public double getQuantity() {
        return quantity;
    }   

}
