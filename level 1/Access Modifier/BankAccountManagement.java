// Parent class: BankAccount
 class BankAccount {
    // Instance variables
    public String accountNumber;    // Public: accessible from anywhere
    protected String accountHolder; // Protected: accessible within the class, subclasses, and classes in the same package
    private double balance;         // Private: accessible only within the BankAccount class

    // Constructor to initialize account details
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter method to get the balance
    public double getBalance() {
        return balance;
    }

    // Setter method to modify the balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance amount. Balance cannot be negative.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: Rs" + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {

    // Constructor to initialize SavingsAccount details
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance); // Calling parent class constructor
    }

    // Method to display savings account details
    public void displaySavingsAccountDetails() {
        // Accessing the public 'accountNumber' and protected 'accountHolder' from the parent class
        System.out.println("\nSavings Account Details: ");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}

// Main class to test the functionality
public class BankAccountManagement{
    public static void main(String[] args) {
        // Creating an instance of BankAccount class
        BankAccount account = new BankAccount("123456789", "John Gupta", 5000.0);
        
        // Displaying account details
        System.out.println("Bank Account Details:");
        account.displayAccountDetails();
        
        // Modifying the balance using the setter method
        account.setBalance(6000.0);
        System.out.println("\nUpdated Bank Account Details:");
        account.displayAccountDetails();
        
        // Creating an instance of SavingsAccount class
        SavingsAccount savingsAccount = new SavingsAccount("987654321", "Jane Smith", 10000.0);
        
        // Displaying savings account details
        savingsAccount.displaySavingsAccountDetails();
        
        // Accessing the balance using the getter method
        double balance = savingsAccount.getBalance();
        System.out.println("Balance in Savings Account: $" + balance);
        
        // Attempting to modify the balance to a negative value (Invalid scenario)
        System.out.println("\n try to access negative:");
        savingsAccount.setBalance(-1000.0); // Invalid operation, won't update the balance
    }
}
