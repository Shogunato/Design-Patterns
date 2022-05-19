package Tools;

import Borrow.InkPen;

//Adapt outside classes
public class PenAdapter implements IPen {

    InkPen ip = new InkPen();

    @Override
    public void write(String toWrite) {
        
        ip.mark(toWrite);
        
    }
    
}
