    // BankAccountMain class to test the hierarchy
public class BankAccountMain {
    public static void main(String[] args) {
        // Creating objects for different account types
        BankAccount bank=new BankAccount("123", 1000);
        bank.displayAccountType();
        bank.displayAccountInfo();
        System.out.println("-----------");
        SavingsAccount savings = new SavingsAccount("SA12345", 10000.0, 4.5);
        savings.displayAccountType();
        savings.displayAccountInfo();
        System.out.println("----------");
        CheckingAccount checking = new CheckingAccount("CA12345", 5000.0, 2000.0);
        checking.displayAccountType();
        checking.displayAccountInfo();
        System.out.println("----------");
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FDA12345", 20000.0, 5);
        fixedDeposit.displayAccountType();
        fixedDeposit.displayAccountInfo();
     
    }
}
