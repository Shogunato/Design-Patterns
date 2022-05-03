package StockMarket.Colleague;

import StockMarket.Mediator.Mediator;

public class JTPorman extends Colleague {
    
    public JTPorman(Mediator mediator) {
        super(mediator);

        System.out.println("JT Porman signed up for the exchange.");
    }

}
