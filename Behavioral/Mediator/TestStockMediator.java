public class TestStockMediator {

    public static void main(String[] args) {

        StockMediator nyse = new StockMediator();

        GormanSlacks gormanSlacks = new GormanSlacks(nyse);
        JTPoorman jtPoorman = new JTPoorman(nyse);

        gormanSlacks.saleOffer("MSFT", 100);
        gormanSlacks.saleOffer("GOOG", 50);

        jtPoorman.buyOffer("MSFT", 100);
        jtPoorman.buyOffer("NRG", 10);

        nyse.getstockOfferings();

    }

}
