
void main() {
    Customer.Address address = new Customer.Address(
        "12 College Road", "Anand", "388001"
    );

    Customer customer = new Customer(
        "Riya", "riya@example.com", "9876543210", address
    );

    Account a1 = new Account(customer, "ACC2001");
    a1.deposit(4000);

    Account a2 = new Account(customer, "ACC2001");

    System.out.println("Account details:");
    System.out.println(a1);

    System.out.println("\nAddress:");
    System.out.println(customer.getAddress().getLine());
    System.out.println(customer.getAddress().getCity());
    System.out.println(customer.getAddress().getPincode());

    System.out.println("\nAre accounts equal? " + a1.equals(a2));
    System.out.println("Same hash code? "
        + (a1.hashCode() == a2.hashCode()));

    Object obj = a1;
    System.out.println("Is obj an Account? " + (obj instanceof Account));

    Customer copy = customer.clone();
    System.out.println("Original customer: " + customer.getName());
    System.out.println("Cloned customer: " + copy.getName());
    System.out.println("Different customer objects? "
        + (customer != copy));
}
