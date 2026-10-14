
void main() {
    System.out.println("Mobile valid: "
            + Validator.isValidMobile("9876543210"));
    System.out.println("Mobile invalid: "
            + Validator.isValidMobile("12345"));

    System.out.println("Email valid: "
            + Validator.isValidEmail("abc@xyz.com"));
    System.out.println("Email invalid: "
            + Validator.isValidEmail("abc.xyz.com"));

    System.out.println("PAN valid: "
            + Validator.isValidPan("ABCDE1234F"));
    System.out.println("PAN invalid: "
            + Validator.isValidPan("12345ABCDE"));

    System.out.println("IFSC valid: "
            + Validator.isValidIfsc("SBIN0001234"));
    System.out.println("IFSC invalid: "
            + Validator.isValidIfsc("123"));

    Command command = CommandParser.parse("DEPOSIT AC0001 500");

    System.out.println("\nParsed command:");
    System.out.println("Type: " + command.type());
    System.out.println("Account: " + command.accountNumber());
    System.out.println("Amount: " + command.amount());

    Customer customer = new Customer(
            "Riya", "riya@example.com", "9876543210");

    Account account = new Account(customer);
    account.deposit(5000);

    System.out.println("\n" +
            StatementFormatter.buildStatement(account));
}
