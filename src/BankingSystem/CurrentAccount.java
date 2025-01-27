package BankingSystem;

// CurrentAccount Class
public class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.02; // 2% interest for current account
    private double loanAmount;

    // Constructor to initialize specific details for CurrentAccount
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    // Implement calculateInterest for CurrentAccount
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


