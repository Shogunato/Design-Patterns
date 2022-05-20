package StockMarket.Colleague;

import StockMarket.Mediator.IMediator;

public class GormanSlacks extends AbstractColleague {
    
    //Connection of the colleague with the mediator
    public GormanSlacks(IMediator mediator) {
        super(mediator);

        System.out.println("Gorman Slacks signed up for the exchange.");
    }

}
