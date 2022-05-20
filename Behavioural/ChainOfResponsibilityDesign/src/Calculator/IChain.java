package calculator;

//Interface that connects all functions to be chained
public interface IChain {
    
    public void setNextChain(IChain nextChain);

    public int exec(Numbers n);

}
