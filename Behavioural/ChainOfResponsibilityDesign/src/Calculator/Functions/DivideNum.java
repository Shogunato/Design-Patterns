package Calculator.Functions;

import Calculator.Chain;
import Calculator.Numbers;

public class DivideNum implements Chain {

    public int exec(Numbers n) {

        if(n.getFunction().equals("div")) {return n.getN1()/n.getN2();}
        else {
            System.out.println("Incorrect Function, returning 0.");
            return 0;
        }

    }

    @Override
    public void setNextChain(Chain nextChain) {
        
    }

}
