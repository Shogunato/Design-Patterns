import Tools.AssignmentWork;
import Tools.PenAdapter;

public class AdapterMain {
    
    public static void main(String[] args) {
        
        PenAdapter pa = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        
        aw.setPen(pa);
        aw.writeAssigment("Hello word! :)");

    }

}
