import java.util.Scanner;

record BankInfo(String name, String branch) {}

enum MenuOption {
    OPEN_ACCOUNT,
    DEPOSIT,
    WITHDRAW,
    TRANSFER,
    EXIT
}

void main() {

    Scanner sc = new Scanner(System.in);

    BankInfo bank = new BankInfo("MiniBank", "Main Branch");

    System.out.println("==============================");
    System.out.println("     WELCOME TO " + bank.name());
    System.out.println("     Branch: " + bank.branch());
    System.out.println("==============================");

    int choice = 0;

    while (choice != 5) {

        System.out.println("\n---------- MAIN MENU ----------");
        System.out.println("1. Open Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Transfer");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Enter a number.");
            sc.nextLine();
            continue;
        }

        choice = sc.nextInt();

        MenuOption option = switch (choice) {
            case 1 -> MenuOption.OPEN_ACCOUNT;
            case 2 -> MenuOption.DEPOSIT;
            case 3 -> MenuOption.WITHDRAW;
            case 4 -> MenuOption.TRANSFER;
            case 5 -> MenuOption.EXIT;
            default -> null;
        };

        if (option == null) {
            System.out.println("Invalid choice! Select 1 to 5.");
            continue;
        }

        switch (option) {

            case OPEN_ACCOUNT ->
                System.out.println("Open Account selected.");

            case DEPOSIT ->
                System.out.println("Deposit selected.");

            case WITHDRAW ->
                System.out.println("Withdraw selected.");

            case TRANSFER ->
                System.out.println("Transfer selected.");

            case EXIT ->
                System.out.println("Thank you for using MiniBank!");
        }
    }

    sc.close();
}