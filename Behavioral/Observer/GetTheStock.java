public class GetTheStock implements Runnable {

    private String stock;
    private double price;

    private Subject stockGrabber;

    public GetTheStock(Subject stockGrabber, String newStock, double newPrice) {
        this.stockGrabber = stockGrabber;
        this.stock = newStock;
        this.price = newPrice;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            try {
                // Sleep 2 seconds
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }

            // Generate a random number between -0.3 and 0.3
            double randNum = Math.floor(Math.random() * (60) - 30) / 100;

            // Change the price
            price = price + randNum;

            if (this.stock == "IBM")
                ((StockGrabber) stockGrabber).setIBMPrice(price);

            if (this.stock == "AAPL")
                ((StockGrabber) stockGrabber).setAAPLPrice(price);

            if (this.stock == "GOOG")
                ((StockGrabber) stockGrabber).setGOOGPrice(price);

            // Inform about new price and the price change
            System.out.println(stock + ": " + price + " " + randNum);
        }
    }

}
