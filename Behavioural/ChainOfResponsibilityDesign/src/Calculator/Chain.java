package Calculator;

public interface Chain {
    
    public void setNextChain(Chain nextChain);

    public int exec(Numbers n);

}
