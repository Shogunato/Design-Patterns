package StockMarket.Mediator;

import StockMarket.Colleague.AbstractColleague;

public interface IMediator {

    //Class to mediate must be able to handle these requests
    public void saleOffer(String stock, int shares, int colleagueCode);
    public void buyOffer(String stock, int shares, int colleagueCode);
    public void addColleague(AbstractColleague colleague);
    
}