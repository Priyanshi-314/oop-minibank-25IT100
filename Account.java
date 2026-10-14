
public class Account {

    private final String accountNumber;
    private final Customer customer;
    private double balance;
    private boolean active;

    private static int counter = 1000;

    public Account(Customer customer) {
        this.customer = customer;
        this.accountNumber = "ACC" + (++counter);
        this.balance = 0.0;
        this.active = true;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return active;
    }

    public boolean deposit(double amount) {
        if (!active || !Double.isFinite(amount) || amount <= 0) {
            return false;
        }

        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (!active || !Double.isFinite(amount)
                || amount <= 0 || amount > balance) {
            return false;
        }

        balance -= amount;
        return true;
    }
}
