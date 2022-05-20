package calculator.functions;

import calculator.IChain;
import calculator.Numbers;

//One of the functions that can be chained
public class SumNum implements IChain {
    
    private IChain nextChain;

    public int exec(Numbers n) {
        
        //Validate if the request inside n is for this function
        if(n.getFunction().equals("sum")) {return n.getN1()+n.getN2();}
        else{return nextChain.exec(n);}

    }

    @Override
    public void setNextChain(IChain nextChain) {
        this.nextChain = nextChain;
        
    }
    
}
