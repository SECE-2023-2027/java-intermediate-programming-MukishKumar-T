package BankAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account No: ");
        String accountNo = sc.next();

        System.out.println("Enter account Holder Name: ");
        String name = sc.nextLine();

        sc.nextLine();

        System.out.println("Enter Initial Deposit Amount: ");
        double balance = sc.nextDouble();

        Bank acc = new Bank(accountNo, name, balance);

        acc.deposit(200);
        acc.withdraw(800);

        System.out.println(acc.getBalance());
    }
}
