package nvhoang_lesson7;

import java.text.NumberFormat;
import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        System.out.print("Enter account number: ");
        long accountNumber = scanner.nextLong();
        account.setAccountNumber(accountNumber);

        System.out.print("Enter account name: ");
        String accountName = scanner.next();
        account.setAccountName(accountName);

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        account.setBalance(initialBalance);

        System.out.println();
        System.out.println("Account Information");
        System.out.println("--------------------");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Name: " + account.getAccountName());
        System.out.println("Balance: " + NumberFormat.getCurrencyInstance().format(account.getBalance()));

        System.out.println();
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.println();
        System.out.println("Account Information after deposit");
        System.out.println("--------------------------------");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Name: " + account.getAccountName());
        System.out.println("Balance: " + NumberFormat.getCurrencyInstance().format(account.getBalance()));

        System.out.println();
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        System.out.println();
        System.out.println("Account Information after withdraw");
        System.out.println("---------------------------------");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Name: " + account.getAccountName());
        System.out.println("Balance: " + NumberFormat.getCurrencyInstance().format(account.getBalance()));
    }

}
