
public class Customer {

    private final String customerId;
    private String name;
    private String email;
    private String mobile;

    private static int counter = 100;

    public Customer(String name, String email, String mobile) {
        this.customerId = "CUST" + (++counter);
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }
}
