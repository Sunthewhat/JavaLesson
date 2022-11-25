public class Customer {
    private String firstname;
    private String lastname;
    private int customerId;

    public Customer(String firstname, String lastname, int customerId) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.customerId = customerId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
