package JavaConstructors;
class Bank{
    public long accountNumber;
    protected String accountHolder;
    private double balance;

    
    public Bank(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds.");
    }
}


class SavingsAccount extends Bank {
    public SavingsAccount(long accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displayAccountInfo() {
        System.out.println("Account Number : " + accountNumber);    
        System.out.println("Account Holder : " + accountHolder);    
        System.out.println("Balance        : Rs. " + getBalance()); 
    }
}
