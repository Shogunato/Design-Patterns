package Tools;

import Borrow.InkPen;

public class PenAdapter implements Pen {

    InkPen ip = new InkPen();

    @Override
    public void write(String toWrite) {
        
        ip.mark(toWrite);
        
    }
    
}
