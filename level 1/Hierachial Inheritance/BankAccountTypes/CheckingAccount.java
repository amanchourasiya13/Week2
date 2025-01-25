// Subclass: CheckingAccount
public class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

   @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }

  @Override
    public void displayAccountType() {
        System.out.println("Checking Account");
    }
}
