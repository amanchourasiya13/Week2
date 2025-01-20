 class BankAccount{
    
    // Static variable shared across all accounts
    private static String bankName = "SBI Bank";
    // Static counter for tracking total number of accounts
   private  static int totalAccounts = 0;
    
    // Final variable for account number to prevent reassignment
  private  final int accountNumber;
  private  String accountHolderName;

    // Constructor to initialize account details
    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber; // final variable, cannot be reassigned
        totalAccounts++;
    }

    // Static method to get the total number of accounts
    public static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }

    // Method to display account details
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("Invalid account details.");
        }
    }

}
    // Main method to test the BankAccount class
public class BankAccountSystem{
    public static void main(String[] args) {
        // Creating new bank account objects
        BankAccount account1 = new BankAccount("John Doe", 1001);
        BankAccount account2 = new BankAccount("Jane Smith", 1002);

        // Displaying account details for each account
        account1.displayAccountDetails();
        System.out.println();
        account2.displayAccountDetails();
        
        // Getting total number of accounts
       BankAccount.getTotalAccounts();
    }
}
