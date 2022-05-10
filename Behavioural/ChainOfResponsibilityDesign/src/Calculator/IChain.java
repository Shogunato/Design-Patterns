package calculator;

public interface IChain {
    
    public void setNextChain(IChain nextChain);

    public int exec(Numbers n);

}
