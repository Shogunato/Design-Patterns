package StockMarket;

public class StockOffer {
    
    private int colleagueCode = 0;
    private int stockShares = 0;
    private String stockSymbol = "";

    public StockOffer(int numbShares, int colleagueCode, String stockSymbol) {

        this.colleagueCode = colleagueCode;
        this.stockShares = numbShares;
        this.stockSymbol = stockSymbol;

    }

    public int getStockShares() {return stockShares;}
    public int getColleagueCode() {return colleagueCode;}
    public String getStockSymbol() {return stockSymbol;}
    
    @Override
    public String toString() {
        return stockShares+" of "+stockSymbol;
    }
}
