import Calculator.*;
import Calculator.Functions.*;

public class ChainOfResponsibilityMain {

    public static void main(String[] args) {

        Chain chainCal1 = new SumNum();
        Chain chainCal2 = new SubtractNum();
        Chain chaincal3 = new MultiNum();
        Chain chaincal4 = new DivideNum();

        Numbers request = new Numbers(47, 74, "sum");

        chainCal1.setNextChain(chainCal2);
        chainCal2.setNextChain(chaincal3);
        chaincal3.setNextChain(chaincal4);

        System.out.println(chainCal1.exec(request));

    }

}
