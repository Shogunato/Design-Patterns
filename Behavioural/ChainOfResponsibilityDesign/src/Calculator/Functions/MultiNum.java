package Calculator.Functions;

import Calculator.Chain;
import Calculator.Numbers;

public class MultiNum implements Chain {
    
    private Chain nextChain;

    public int exec(Numbers n) {

        if(n.getFunction().equals("multi")) {return n.getN1()*n.getN2();}
        else {return nextChain.exec(n);}
        
    }

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
        
    }

}
