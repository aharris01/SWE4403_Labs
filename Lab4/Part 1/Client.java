import java.util.ArrayList;

public class Client {
    public ArrayList<Customer> getCustomers(ArrayList<Person> persons){
        ArrayList<Customer> customers = new ArrayList<>();
        for (Person person : persons) {
            customers.add(new PersonToCustomerAdapter(person));
        }
        return customers;
    }
}
