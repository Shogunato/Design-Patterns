package calculator.functions;

import calculator.IChain;
import calculator.Numbers;

//One of the functions that can be chained
public class DivideNum implements IChain {

    public int exec(Numbers n) {

        //Validate if the request inside n is for this function
        if(n.getFunction().equals("div")) {return n.getN1()/n.getN2();}
        else {
            System.out.println("Incorrect Function, returning 0.");
            return 0;
        }

    }

    @Override
    public void setNextChain(IChain nextChain) {
        //Meant to be the last one in the chain
    }

}
