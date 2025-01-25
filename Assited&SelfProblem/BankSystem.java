 
// Account Class
import java.util.ArrayList;

class Account {
    private String accountNumber;
    private double balance;

    // Constructor
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient balance.");
        }
    }
}

// Customer Class

class Customer {
    private String name;
    private ArrayList<Account> accounts;

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    // Method to add an account
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added for customer: " + name);
    }

    // Method to view balance of all accounts
    public void viewBalance() {
        System.out.println("Balances for customer: " + name);
        for (Account account : accounts) {
            System.out.println("Account: " + account.getAccountNumber() + ", Balance: " + account.getBalance());
        }
    }
}

// Bank Class
class Bank {
    private String bankName;
    private ArrayList<Account> accounts;

    // Constructor
    public Bank(String bankName) {
        this.bankName = bankName;
        this.accounts = new ArrayList<>();
    }

    // Method to open a new account
    public Account openAccount(String accountNumber, Customer customer) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.println("Account number already exists.");
                return null;
            }
        }
        Account newAccount = new Account(accountNumber);
        accounts.add(newAccount);
        customer.addAccount(newAccount);
        System.out.println("Account opened with number: " + accountNumber);
        return newAccount;
    }

    // Method to list all accounts in the bank
    public void listAccounts() {
        System.out.println("Accounts in " + bankName + ":");
        for (Account account : accounts) {
            System.out.println("Account: " + account.getAccountNumber() + ", Balance: " + account.getBalance());
        }
    }
}

// Main Class for Testing
public class BankSystem {
    public static void main(String[] args) {
        Bank bank = new Bank("Global Bank");

        Customer customer1 = new Customer("Aman");
        Customer customer2 = new Customer("Rohan");

        bank.openAccount("1001", customer1);
        bank.openAccount("1002", customer2);

        Account account1 = customer1.getAccounts().get(0);
        Account account2 = customer2.getAccounts().get(0);

        account1.deposit(500);
        account1.withdraw(200);

        account2.deposit(1000);
        account2.withdraw(300);

        bank.listAccounts();
        customer1.viewBalance();
        customer2.viewBalance();
    }
}
