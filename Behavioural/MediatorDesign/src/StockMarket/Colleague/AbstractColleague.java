package StockMarket.Colleague;

import StockMarket.Mediator.IMediator;

public abstract class AbstractColleague {
    
    private IMediator mediator;
    private int colleagueCode;

    public AbstractColleague(IMediator mediator) {
        this.mediator = mediator;
    }

    //A colleague will have access to these methods from the mediator
    public void saleOffer(String stock, int shares) {

        mediator.saleOffer(stock, shares, this.colleagueCode);

    }

    public void buyOffer(String stock, int shares) {

        mediator.buyOffer(stock, shares, this.colleagueCode);

    }

    public void setColleagueCode(int colleagueCode) {this.colleagueCode = colleagueCode;}

}
