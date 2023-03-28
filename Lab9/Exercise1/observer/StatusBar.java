package observer;

import java.util.ArrayList;
import java.util.List;

public class StatusBar implements StockObserver{
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
        stock.attach(this);
    }

    public void show() {
        for (Stock stock : stocks)
            System.out.println(stock);
    }

    @Override
    public void update(String symbol, float newPrice) {
        System.out.println("Status Bar: Price updated for " + symbol + ": " + newPrice);
    }
}
