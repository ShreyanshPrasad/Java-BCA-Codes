class BankAccount {

    // Instance variables
    private String ownerName;
    private double balance;

    // Static variable
    static String bankName = "Java National Bank";

    // Constructor
    BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;   // this → instance variable
        this.balance = initialBalance;
    }

    // Method with local variables
    void deposit(double amount) {
        double newBalance = balance + amount;  // local variable
        balance = newBalance;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount > balance) {                // local condition
            System.out.println("Insufficient funds!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    void showDetails() {
        System.out.println("Bank: " + bankName);
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating objects
        BankAccount acc1 = new BankAccount("Alice", 5000);
        BankAccount acc2 = new BankAccount("Bob", 3000);

        acc1.deposit(1000);
        acc1.withdraw(500);
        acc1.showDetails();

        System.out.println("---");

        acc2.deposit(2000);
        acc2.showDetails();
    }
}
