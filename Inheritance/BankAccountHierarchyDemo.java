package Inheritance;
//Superclass
class BankAccount {
 protected String accountNumber;
 protected double balance;

 public BankAccount(String accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 public void displayAccountDetails() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Balance: $" + balance);
 }

 public void displayAccountType() {
     System.out.println("Generic Bank Account");
 }
}

//Subclass 1
class SavingsAccount extends BankAccount {
 private double interestRate;

 public SavingsAccount(String accountNumber, double balance, double interestRate) {
     super(accountNumber, balance);
     this.interestRate = interestRate;
 }

 @Override
 public void displayAccountType() {
     super.displayAccountDetails();
     System.out.println("Account Type: Savings Account");
     System.out.println("Interest Rate: " + interestRate + "%");
 }
}

//Subclass 2
class CheckingAccount extends BankAccount {
 private double withdrawalLimit;

 public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
     super(accountNumber, balance);
     this.withdrawalLimit = withdrawalLimit;
 }

 @Override
 public void displayAccountType() {
     super.displayAccountDetails();
     System.out.println("Account Type: Checking Account");
     System.out.println("Withdrawal Limit: $" + withdrawalLimit);
 }
}

//Subclass 3
class FixedDepositAccount extends BankAccount {
 private int maturityPeriod; // in months

 public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
     super(accountNumber, balance);
     this.maturityPeriod = maturityPeriod;
 }

 @Override
 public void displayAccountType() {
     super.displayAccountDetails();
     System.out.println("Account Type: Fixed Deposit Account");
     System.out.println("Maturity Period: " + maturityPeriod + " months");
 }
}

//Demo class
public class BankAccountHierarchyDemo {
 public static void main(String[] args) {
     SavingsAccount savings = new SavingsAccount("SA-12345", 5000.00, 4.5);
     CheckingAccount checking = new CheckingAccount("CA-67890", 2000.00, 1000.00);
     FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD-54321", 10000.00, 12);

     System.out.println("=== Savings Account ===");
     savings.displayAccountType();

     System.out.println("\n=== Checking Account ===");
     checking.displayAccountType();

     System.out.println("\n=== Fixed Deposit Account ===");
     fixedDeposit.displayAccountType();
 }
}
