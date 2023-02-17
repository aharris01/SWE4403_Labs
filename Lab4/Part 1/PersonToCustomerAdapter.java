public class PersonToCustomerAdapter implements Customer{
    private String lastName;
    private String firstName;

    public PersonToCustomerAdapter(Person person) {
        String[] fullName = person.getFullName().split(" ");
        lastName = fullName[1];
        firstName = fullName[0];
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString(){
        return lastName + ", " + firstName;
    }
}
