import StockMarket.Colleague.GormanSlacks;
import StockMarket.Colleague.JTPorman;
import StockMarket.Mediator.StockMediator;

public class MediatorMain {
    
    public static void main(String[] args) {

        StockMediator nyse = new StockMediator();

        GormanSlacks gman = new GormanSlacks(nyse);
        JTPorman jman = new JTPorman(nyse);

        gman.saleOffer("MSFT", 100);
        gman.saleOffer("GOOG", 50);

        jman.buyOffer("MSFT", 100);
        jman.saleOffer("NRG", 10);

        gman.buyOffer("NRG", 10);

        nyse.getStockOffering();
    }

}
