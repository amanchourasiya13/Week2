import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor to initialize bank account
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money into the account
    public void depositMoney() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter account number: ");
        String yourAccountNumber = input.nextLine();

        if (yourAccountNumber.equals(accountNumber)) {
            System.out.println("Deposit process");
            System.out.println("Account holder name: " + accountHolder);
            double money = 0;
            boolean validInput = false;

            // Loop until a valid deposit amount is entered
            while (!validInput) {
                System.out.print("Add money (positive amount): ");
                money = input.nextDouble();
                input.nextLine();  // Clear the buffer after reading numeric input

                if (money <= 0) {
                    System.out.println("Deposit amount must be greater than zero. Please try again.");
                } else {
                    validInput = true;
                }
            }

            balance += money;
            System.out.println("Deposit successful!");
            System.out.println("Available balance: " + balance);
        } else {
            System.out.println("Enter correct account number");
        }
    }

    // Method to withdraw money from the account
    public void withdrawMoney() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter account number: ");
        String yourAccountNumber = input.nextLine();

        if (yourAccountNumber.equals(accountNumber)) {
            System.out.println("Withdraw process");
            System.out.println("Account holder name: " + accountHolder);
            double money = 0;
            boolean validInput = false;

            // Loop until a valid withdrawal amount is entered
            while (!validInput) {
                System.out.print("Enter withdraw amount (positive amount): ");
                money = input.nextDouble();
                input.nextLine();  // Clear the buffer after reading numeric input

                if (money <= 0) {
                    System.out.println("Withdrawal amount must be greater than zero. Please try again.");
                } else if (money > balance) {
                    System.out.println("Insufficient balance. Please enter a smaller amount.");
                } else {
                    validInput = true;
                }
            }

            balance -= money;
            System.out.println("Withdrawal successful!");
            System.out.println("Available balance: " + balance);
        } else {
            System.out.println("Enter correct account number");
        }
    }

    // Method to display bank account information
    public void displayInformation() {
        System.out.println("Account holder name: " + accountHolder);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Available balance: " + balance);
    }

    // Getter methods (if needed for other purposes, not strictly necessary here)
    public double getBalance() {
        return balance;
    }
}

public class Atm{
    public static void main(String[] args) {
        // Creating an object to access methods of BankAccount class
        BankAccount account = new BankAccount("Aman Chourasiya", "123456789", 40000);

        // Display account information
        account.displayInformation();

        // Deposit money
        account.depositMoney();

        // Withdraw money
        account.withdrawMoney();
    }
}
