import java.util.Scanner;
class BankAccount{
 String accountHolder;
 String accountNumber;
 double balance;

public BankAccount(String accountHolder,String accountNumber,double balance){
    this.accountHolder=accountHolder;
    this.accountNumber=accountNumber;
    this.balance=balance;
}

// creating a method to deposit money from account.
public static  double DepositMoney(String accountHolder,String accountNumber,double balance){
// create input object to take input from user.
  Scanner input=new Scanner(System.in); // taking input as account number from user.
  System.out.print("enter account number: ");
 String yourAccountNumber=input.nextLine();
 if(yourAccountNumber.equals(accountNumber)){   // checking condition that account number is same.
    System.out.println("Deposit process");
    System.out.println("account holder name: "+accountHolder);
System.out.print("add money:");
double money=input.nextDouble();  // taking input  money to add in balance from  user.
balance+=money;
System.out.print("available balance:"+balance);
 }
 else {
  System.out.println("enter correct account number");
 }
return 0;
}

// creating a  method to withdraw money from account.
public static  double WithdrawMoney(String accountHolder,String accountNumber,double balance){
// create input object to take input from user.
  Scanner input=new Scanner(System.in); 
  System.out.print("\n enter account number: ");
 String yourAccountNumber=input.nextLine();  // taking input as account number from user.
 if(yourAccountNumber.equals(accountNumber)){  // checking condition that account number is same.
   System.out.println("Withdraw process");
    System.out.println("account holder name: "+accountHolder);
    System.out.println("enter withdraw money:");
double money=input.nextDouble();    // taking input  money to  withdraw.
if(money<=balance){          // checking balance is more than zero rupees to withdraw.
balance-=money;
}
else {
  System.out.println("money not sufficient");
}
System.out.println("available balance:"+balance);
 }
 else{
  System.out.println("enter correct account number");
 }

return 0;
}
// method to dispaly the information of bank account.
void displayInformation(){
  System.out.println("Account holder name:"+accountHolder);
  System.out.println("Account Number :"+accountNumber);
  System.out.println("Available balance: "+balance);
}

}
public class Atm {
    public static void main(String[] args) {
// creating an obj object to access methods of BankAccount class.
    BankAccount obj=new BankAccount("Aman Chourasiya","123456789",40000);
    obj.displayInformation();
    obj.DepositMoney("Aman Chourasiya","123456789",40000);
    obj.WithdrawMoney("Aman Chourasiya","123456789",40000);
    }
}
