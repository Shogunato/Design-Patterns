package calculator.functions;

import calculator.IChain;
import calculator.Numbers;

public class SumNum implements IChain {
    
    private IChain nextChain;

    public int exec(Numbers n) {
        
        if(n.getFunction().equals("sum")) {return n.getN1()+n.getN2();}
        else{return nextChain.exec(n);}

    }

    @Override
    public void setNextChain(IChain nextChain) {
        this.nextChain = nextChain;
        
    }
    
}
