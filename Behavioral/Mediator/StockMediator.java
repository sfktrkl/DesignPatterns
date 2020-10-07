import java.util.ArrayList;

// ConcreteMediator: It implements the mediator interface and coordinates communication between colleague objects. 
public class StockMediator implements Mediator {

    private ArrayList<Colleague> colleagues;
    private ArrayList<StockOffer> stockBuyOffers;
    private ArrayList<StockOffer> stockSaleOffers;

    private int colleagueCodes = 0;

    public StockMediator() {
        colleagues = new ArrayList<Colleague>();
        stockBuyOffers = new ArrayList<StockOffer>();
        stockSaleOffers = new ArrayList<StockOffer>();
    }

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
        colleague.setCollCode(++colleagueCodes);
    }

    public void saleOffer(String stock, int shares, int collCode) {

        for (StockOffer offer : stockBuyOffers) {
            if ((offer.getStockSymbol() == stock) && (offer.getstockShares() == shares)) {
                System.out.println(shares + " shares of " + stock + " sold to colleague code " + offer.getCollCode());
                stockBuyOffers.remove(offer);
                return;
            }
        }

        System.out.println(shares + " shares of " + stock + " added to inventory");
        stockSaleOffers.add(new StockOffer(shares, stock, collCode));

    }

    public void buyOffer(String stock, int shares, int collCode) {

        for (StockOffer offer : stockSaleOffers) {
            if ((offer.getStockSymbol() == stock) && (offer.getstockShares() == shares)) {
                System.out.println(shares + " shares of " + stock + " bought by colleague code " + offer.getCollCode());
                stockSaleOffers.remove(offer);
                return;
            }
        }

        System.out.println(shares + " shares of " + stock + " added to inventory");
        stockBuyOffers.add(new StockOffer(shares, stock, collCode));

    }

    public void getstockOfferings() {

        System.out.println("\nStocks for Sale");
        for (StockOffer offer : stockSaleOffers) {
            System.out.println(offer.getstockShares() + " of " + offer.getStockSymbol());
        }

        System.out.println("\nStock Buy Offers");
        for (StockOffer offer : stockBuyOffers) {
            System.out.println(offer.getstockShares() + " of " + offer.getStockSymbol());
        }

    }

}
