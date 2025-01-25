// Subclass: SavingsAccount
public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

  //  @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }

// @Override
    public void displayAccountType() {
        System.out.println("Savings Account");
    }
}
