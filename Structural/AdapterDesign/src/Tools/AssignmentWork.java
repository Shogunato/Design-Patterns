package Tools;

//Main class that utilizes the outside class
public class AssignmentWork {
    
    private IPen pen;

    public void writeAssigment(String toWrite) {
        pen.write(toWrite);
    }

    public IPen getPen() {
        return pen;
    }

    public void setPen(IPen pen) {
        this.pen = pen;
    }

}
