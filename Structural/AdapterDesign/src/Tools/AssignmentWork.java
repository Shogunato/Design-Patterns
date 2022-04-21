package Tools;
public class AssignmentWork {
    
    private Pen pen;

    public void writeAssigment(String toWrite) {
        pen.write(toWrite);
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

}
