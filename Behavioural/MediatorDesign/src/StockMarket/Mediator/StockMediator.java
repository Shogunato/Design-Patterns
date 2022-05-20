package StockMarket.Mediator;

import java.util.ArrayList;

import StockMarket.StockOffer;
import StockMarket.Colleague.AbstractColleague;

//An example of an mediator
public class StockMediator implements IMediator {

    private ArrayList<AbstractColleague> colleagues;
    private ArrayList<StockOffer> stockBuyOffers;
    private ArrayList<StockOffer> stockSellOffers;

    private int colleagueCodes = 0;

    public StockMediator() {

        colleagues = new ArrayList<>();
        stockBuyOffers = new ArrayList<>();
        stockSellOffers = new ArrayList<>();

    }

    @Override
    public void saleOffer(String stock, int shares, int colleagueCode) {

        for(StockOffer offer: stockBuyOffers) {
            
            if(offer.getStockShares() == shares && offer.getStockSymbol().equals(stock)) {

                System.out.println(shares+" shares of "+stock+" sold to colleague code: "+offer.getColleagueCode());
                stockBuyOffers.remove(offer);
                return;

            }

        }

        System.out.println(shares+" shares of "+stock+" added to inventory.");
        stockSellOffers.add(new StockOffer(shares, colleagueCode, stock));
        
    }

    @Override
    public void buyOffer(String stock, int shares, int colleagueCode) {

        for(StockOffer offer: stockSellOffers){

            if(offer.getStockShares() == shares && offer.getStockSymbol().equals(stock)) {

                System.out.println(shares+" shares of "+stock+" bought from colleague code: "+offer.getColleagueCode());
                stockSellOffers.remove(offer);
                return;

            }

        }

        stockBuyOffers.add(new StockOffer(shares, colleagueCode, stock));
        
    }

    @Override
    public void addColleague(AbstractColleague colleague) {
        
        colleagues.add(colleague);
        colleagueCodes ++;
        colleague.setColleagueCode(colleagueCodes);

    }

    public void getStockOffering() {

        System.out.println("Stocks for sale: ");
        for(StockOffer offer: stockSellOffers) {System.out.println(offer);}

        System.out.println("Stock buy offers: ");
        for(StockOffer offer: stockBuyOffers) {System.out.println(offer);}
        
    }
    
}
