package Calculator;

public class Numbers {
    
    private int n1;
    private int n2;
    private String function;

    public Numbers(int n1, int n2, String function) {

        this.n1 = n1;
        this.n2 = n2;
        this.function = function;

    }

    public int getN1() {return n1;}
    public int getN2() {return n2;}
    public String getFunction() {return function;}

}
