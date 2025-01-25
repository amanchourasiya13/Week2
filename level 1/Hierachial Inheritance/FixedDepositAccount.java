// Subclass: FixedDepositAccount
public class FixedDepositAccount extends BankAccount {
    private int tenure; // in years

    public FixedDepositAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

  //  Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Tenure: " + tenure + " years");
    }

  //  Override
    public void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}
