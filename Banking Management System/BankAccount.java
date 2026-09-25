public class BankAccount {

    private int accountNumber;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    // Deposit money
    public void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Money deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount.");
        }
        else if (amount > balance) {
            System.out.println("Insufficient balance.");
        }
        else {
            balance = balance - amount;
            System.out.println("Money withdrawn successfully.");
        }
    }

    // Get balance
    public double getBalance() {
        return balance;
    }

    // Get account number
    public int getAccountNumber() {
        return accountNumber;
    }
}
