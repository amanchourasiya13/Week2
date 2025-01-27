package BankingSystem;
import java.util.ArrayList;
import java.util.List;

public class BankSystemMain{
    public static void main(String[] args) {
        // Creating sample bank accounts
        BankAccount savings = new SavingsAccount("SA123", "John Doe", 1000);
        BankAccount current = new CurrentAccount("CA456", "Alice Smith", 5000);

        // Creating a list of bank accounts
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(savings);
        accounts.add(current);

        // Demonstrating polymorphism and calculating interest for each account
        processAccounts(accounts);

        // Demonstrating loan functionality for SavingsAccount
        SavingsAccount savingsAccount = (SavingsAccount) savings;
        savingsAccount.applyForLoan(800);
        savingsAccount.calculateLoanEligibility();

        // Demonstrating loan functionality for CurrentAccount
        CurrentAccount currentAccount = (CurrentAccount) current;
        currentAccount.applyForLoan(3000);
        currentAccount.calculateLoanEligibility();
    }

    // Method to process each account and calculate interest
    public static void processAccounts(List<BankAccount> accounts) {
        for (BankAccount account : accounts) {
            double interest = account.calculateInterest();
            System.out.println(account.getHolderName() + "'s Account Interest: $" + interest);
        }
    }
}
