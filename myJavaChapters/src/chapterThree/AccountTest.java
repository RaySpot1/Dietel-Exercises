package chapterThree;

import chapterThree.Account;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Oludare David", 50.0);
        Account account2 = new Account("Grace Adunni", -7.0);

        System.out.printf("%s current balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s current balance: %.2f%n%n", account2.getName(), account2.getBalance());

        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s How much do you want to deposit: ", account1.getName());
        double user1Deposit = scanner.nextDouble();
        System.out.printf("%n adding %.2f to %s balance", user1Deposit, account1.getName());
        account1.deposit(user1Deposit);
        System.out.printf("%n%n%s new balance: %.2f", account1.getName(), account1.getBalance());

        System.out.printf("%n%n%s How much do you want to deposit: ", account2.getName());
        double user2Deposit = scanner.nextDouble();
        System.out.printf("%n adding %.2f to %s balance", user2Deposit, account2.getName());
        account2.deposit(user2Deposit);

        System.out.printf("%n%s new balance: %.2f", account2.getName(), account2.getBalance());

        System.out.printf("\n\n %s Enter amount you want to withdraw: ", account1.getName());
        double user1Withdraw = scanner.nextDouble();
        System.out.printf("%s new balance: %.2f\n\n", account1.getName(), account1.withdrawal(user1Withdraw));

        System.out.printf("\n\n %s Enter amount you want to withdraw: ", account2.getName());
        double user2Withdraw = scanner.nextDouble();
        System.out.printf("%s new balance: %.2f\n", account2.getName(), account2.withdrawal(user2Withdraw));

    }
}
