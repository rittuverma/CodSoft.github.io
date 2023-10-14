package CodSoft.Atm;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Your new balance is: " + balance);
        } else {
            System.out.println("Insufficient balance. Please try again.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Your new balance is: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}
