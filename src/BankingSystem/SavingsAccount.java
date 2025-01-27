package BankingSystem;

// SavingsAccount Class
public class SavingsAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.05; // 5% interest for savings account
    private double loanAmount;

    // Constructor to initialize specific details for SavingsAccount
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    // Implement calculateInterest for SavingsAccount
    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    // Implement applyForLoan method from Loanable interface
    @Override
    public void applyForLoan(double loanAmount) {
        this.loanAmount = loanAmount;
        System.out.println("Loan applied for: $" + loanAmount);
    }

    // Implement calculateLoanEligibility method from Loanable interface
    @Override
    public boolean calculateLoanEligibility() {
        // Simple loan eligibility: Loan is approved if balance is at least half of loan amount
        if (getBalance() >= loanAmount / 2) {
            System.out.println("Loan eligibility: Approved");
            return true;
        } else {
            System.out.println("Loan eligibility: Denied");
            return false;
        }
    }
}


