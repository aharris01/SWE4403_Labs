package observer;

public class Stock{
    private String symbol;
    private float price;
    private StockPublisher publisher = new StockPublisher();

    public Stock(String symbol, float price) {
        this.symbol = symbol;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        publisher.notifyObservers(symbol, price);
    }

    public void attach(StockObserver observer){
        publisher.attach(observer);
    }

    public void detach(StockObserver observer){
        publisher.detach(observer);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", price=" + price +
                '}';
    }
}
