package CodSoft.Atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(1000);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw cash");
            System.out.println("3. Deposit cash");
            System.out.println("4. Exit");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline not consumed by nextInt()

            switch (option) {
                case 1:
                    System.out.println("Your current balance is: " + account.getBalance());
                    break;
                case 2:
                    System.out.println("Enter the amount you want to withdraw:");
                    double withdrawalAmount = scanner.nextDouble();

                    if (withdrawalAmount > account.getBalance()) {
                        System.out.println("Insufficient balance. Please try again.");
                    } else {
                        account.withdraw(withdrawalAmount);
                        System.out.println("Withdrawal successful. Your new balance is: " + account.getBalance());
                    }
                    break;
                case 3:
                    System.out.println("Enter the amount you want to deposit:");
                    double depositAmount = scanner.nextDouble();

                    if (depositAmount <= 0) {
                        System.out.println("Invalid deposit amount. Please try again.");
                    } else {
                        account.deposit(depositAmount);
                        System.out.println("Deposit successful. Your new balance is: " + account.getBalance());
                    }
                    break;
                case 4:
                    System.out.println("Exiting the application...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}