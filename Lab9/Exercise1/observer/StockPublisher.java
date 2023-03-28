package observer;

import java.util.ArrayList;

public class StockPublisher {
    private ArrayList<StockObserver> observers = new ArrayList<>();

    public void attach(StockObserver observer){
        observers.add(observer);
    }

    public void detach(StockObserver observer){
        observers.remove(observer);
    }

    public void notifyObservers(String symbol, float newPrice){
        for(StockObserver observer : observers){
            observer.update(symbol, newPrice);
        }
    }
}
