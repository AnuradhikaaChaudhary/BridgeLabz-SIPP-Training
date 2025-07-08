package ObjectModeling;

class Customer {
    String name;
    double balance;

    Customer(String name) {
        this.name = name;
    }

    void viewBalance() {
        System.out.println(name + "'s balance: $" + balance);
    }
}

class Bank {
    String name;

    Bank(String name) {
        this.name = name;
    }

    void openAccount(Customer customer, double initialDeposit) {
        customer.balance = initialDeposit;
        System.out.println("Account opened for " + customer.name + " with $" + initialDeposit);
    }
}

public class BankandAccountHolders {
    public static void main(String[] args) {
        Bank bank = new Bank("ABC Bank");
        Customer cust = new Customer("Alice");

        bank.openAccount(cust, 1000.0);
        cust.viewBalance();
    }
}
