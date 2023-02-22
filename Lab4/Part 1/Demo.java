import java.util.ArrayList;

public class Demo {
    public static void main(String[] args){
        Client client = new Client();
        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Person("John Smith"));
        persons.add(new Person("Jane Doe"));
        persons.add(new Person("Gary Morrison"));

        ArrayList<Customer> customers = client.getCustomers(persons);

        for(Customer customer: customers){
            System.out.println(customer);
        }
    }
}
