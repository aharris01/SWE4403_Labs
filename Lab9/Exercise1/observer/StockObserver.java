package observer;

public interface StockObserver {
    public void update(String symbol, float newPrice);
}
