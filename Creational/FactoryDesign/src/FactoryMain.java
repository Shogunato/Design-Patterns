import Phone.*;

public class FactoryMain {

    public static void main(String[] args) {

        OperatingSystemFactory osf = new OperatingSystemFactory();

        OS obj1 = osf.getInstance("Open");
        obj1.spec();

        OS obj2 = osf.getInstance("Closed");
        obj2.spec();

        OS obj3 = osf.getInstance("Different");
        obj3.spec();        

    }

}