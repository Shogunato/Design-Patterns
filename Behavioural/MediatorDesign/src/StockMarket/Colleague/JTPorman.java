package StockMarket.Colleague;

import StockMarket.Mediator.IMediator;

public class JTPorman extends AbstractColleague {
    
    //Connection of the colleague with the mediator
    public JTPorman(IMediator mediator) {
        super(mediator);

        System.out.println("JT Porman signed up for the exchange.");
    }

}
