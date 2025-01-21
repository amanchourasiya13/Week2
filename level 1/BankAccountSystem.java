 class BankAccount{
    
    // Static variable shared across all accounts
    private static String bankName = "SBI Bank";
    // Static counter for tracking total number of accounts
    private static int totalAccounts = 0;
    
    // Final variable for account number to prevent reassignment
    private final int accountNumber;
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
            System.out.println("\nBank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
          }
}

class Account extends BankAccount{
    Account(String accountHolderName,int accountNumber){
super(accountHolderName,accountNumber);
    }
}

    // Main method to test the BankAccount class
public class BankAccountSystem{
    public static void main(String[] args) {
        BankAccount account3=new Account("aman ", 1001);
        if(account3 instanceof BankAccount){
            account3.displayAccountDetails();
        }
        BankAccount account4=new Account("rohan",234);
if(account4 instanceof Account){
    account4.displayAccountDetails();
}

    //   // Creating new bank account objects
    //   BankAccount account1 = new BankAccount("John Doe", 1001);
    //   BankAccount account2 = new BankAccount("Jane Smith", 1002);
    //     // Displaying account details for each account
    //       account1.displayAccountDetails();
    //      account2.displayAccountDetails();
        
        // Getting total number of accounts
       BankAccount.getTotalAccounts();
    }
}
