package iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteProductCollection implements ProductCollection{
  public List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }

  @Override
  public ProductIterator createIterator() {
    return new ConcreteProductIterator(this);
  }
}
