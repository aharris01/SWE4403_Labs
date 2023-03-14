package iterator;

public class Demo {
    public static void main(String[] args){
        ProductCollection collection = new ConcreteProductCollection();

        collection.add(new Product(001, "Bike"));
        collection.add(new Product(002, "Bouncy Ball"));
        collection.add(new Product(003, "Video Game"));

        ProductIterator iterator = collection.createIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.getNext());
        }
    }
}
