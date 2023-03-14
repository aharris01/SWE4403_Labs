package iterator;

public interface ProductCollection {

    public void add(Product product);

    public ProductIterator createIterator();
}
