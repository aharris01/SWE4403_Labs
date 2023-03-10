package proxy;

public class Demo {
  public static void main(String[] args) {
    show();
  }
  public static void show() {
    DbContext dbContext = new DbContext();

    // We read an object (eg a product) from a database.
    ProductProxy product = new ProductProxy(dbContext.getProduct(1).getId(), dbContext);

    // We modify the properties of the object in memory.
    product.setName("Updated Name");

    // DbContext should keep track of changed objects in memory.
    // When we call saveChanges(), it'll automatically generate
    // the right SQL statements to update our database.
    dbContext.saveChanges();

    // After saving the changes to the database, we can
    // change our in-memory object again and save the changes.
    product.setName("Another name");
    dbContext.saveChanges();
  }
}
