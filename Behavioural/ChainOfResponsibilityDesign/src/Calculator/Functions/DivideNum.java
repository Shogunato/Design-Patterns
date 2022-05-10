package calculator.functions;

import calculator.IChain;
import calculator.Numbers;

public class DivideNum implements IChain {

    public int exec(Numbers n) {

        if(n.getFunction().equals("div")) {return n.getN1()/n.getN2();}
        else {
            System.out.println("Incorrect Function, returning 0.");
            return 0;
        }

    }

    @Override
    public void setNextChain(IChain nextChain) {
        
    }

}
