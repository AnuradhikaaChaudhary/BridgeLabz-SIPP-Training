package KeyWords;

class BankAccount {
    
    static String bankName = "ABC National Bank";

    
    private static int totalAccounts = 0;

    
    private String accountHolderName;
    private final int accountNumber; 

    
    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    
    public static void getTotalAccounts() {
        System.out.println("Total Bank Accounts: " + totalAccounts);
    }

   
    public void displayAccountDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("-----------------------------");
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        
        BankAccount a1 = new BankAccount("Alice Johnson", 1001);
        BankAccount a2 = new BankAccount("Bob Smith", 1002);
        BankAccount a3 = new BankAccount("Charlie Brown", 1003);

        
        if (a1 instanceof BankAccount) {
            a1.displayAccountDetails();
        }

        if (a2 instanceof BankAccount) {
            a2.displayAccountDetails();
        }

        if (a3 instanceof BankAccount) {
            a3.displayAccountDetails();
        }

        
        BankAccount.getTotalAccounts();
    }
}
