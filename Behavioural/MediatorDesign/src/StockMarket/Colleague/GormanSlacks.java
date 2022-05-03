package StockMarket.Colleague;

import StockMarket.Mediator.Mediator;

public class GormanSlacks extends Colleague {
    
    public GormanSlacks(Mediator mediator) {
        super(mediator);

        System.out.println("Gorman Slacks signed up for the exchange.");
    }

}
