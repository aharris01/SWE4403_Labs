package observer;

public class Exercise1Demo {
    public static void main(String[] args){
        Stock stock1 = new Stock("APP", 0.51f);
        Stock stock2 = new Stock("AMZ", 1.51f);

        StockListView listView = new StockListView();
        StatusBar statusBar = new StatusBar();

        listView.addStock(stock1);
        statusBar.addStock(stock1);
        statusBar.addStock(stock2);

        stock1.setPrice(0.75f);
        stock2.setPrice(0.02f);

    }
}
