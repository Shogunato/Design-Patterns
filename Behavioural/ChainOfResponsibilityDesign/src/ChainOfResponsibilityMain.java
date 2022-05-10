import calculator.*;
import calculator.functions.*;

public class ChainOfResponsibilityMain {

    public static void main(String[] args) {

        IChain chainCal1 = new SumNum();
        IChain chainCal2 = new SubtractNum();
        IChain chaincal3 = new MultiNum();
        IChain chaincal4 = new DivideNum();

        Numbers request = new Numbers(47, 74, "sum");

        chainCal1.setNextChain(chainCal2);
        chainCal2.setNextChain(chaincal3);
        chaincal3.setNextChain(chaincal4);

        System.out.println(chainCal1.exec(request));

    }

}
