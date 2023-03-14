package iterator;

public class ConcreteProductIterator implements ProductIterator{

    public ConcreteProductCollection collection;
    public int currentPosition = 0;

    public ConcreteProductIterator(ConcreteProductCollection collection){
        this.collection = collection;
    }

    @Override
    public Product getNext() {
        if(!hasNext()) return null;
        currentPosition++;
        return collection.products.get(currentPosition);
    }

    @Override
    public boolean hasNext() {
        return currentPosition < collection.products.size();
    }    
}
