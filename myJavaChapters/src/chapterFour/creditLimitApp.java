package chapterFour;

import java.util.Scanner;

public class creditLimitApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        creditLimitCalculator creditLimit1 = new creditLimitCalculator(12345, 1500, 50, 5000, 500);
        creditLimitCalculator creditLimit2 = new creditLimitCalculator(678910, 5000, 50, 2000, 500);

        System.out.print("Enter Customer 'A' Account number: ");
        int account1 = scanner.nextInt();

        int repeat1 = 0;
        while(account1 != creditLimit1.getAccountNumber()){
            System.out.println("Invalid Account number \n Please try again!");
            repeat1 += 1;

            System.out.print("\nEnter your account number: ");
            account1 = scanner.nextInt();
        }

        if (account1 == creditLimit1.getAccountNumber()){
            creditLimit1.setAccountNumber(account1);

            System.out.printf("Account number: %d", creditLimit1.getAccountNumber());
            System.out.printf("\nBeginning Balance: %d", creditLimit1.getNewBalance());
            System.out.printf("\nCharges: %d", creditLimit1.getCharges());
            System.out.printf("\nCredits: %d ", creditLimit1.getCredits());
            System.out.printf("\nCredit Limit: %d ", creditLimit1.getCreditLimit());
            System.out.printf("\nNew Balance: %d", creditLimit1.getNewBalance());
        }

        if(creditLimit1.getNewBalance() > creditLimit1.getCreditLimit()){
            System.out.println("\nBalanced account!");
        } else{
            System.out.println("\nCredit Limit Exceeded!!!");
        }

        System.out.println("\nEnter Customer 'B' Account Number: ");
        int account2 = scanner.nextInt();

        int repeat2 = 0;
        while(account2 != creditLimit2.getAccountNumber()){
            System.out.println("\nInvalid Account number\n Please try again!");
            repeat2 += 1;

            System.out.print("Enter Customer 'B' Account Number: ");
            account2 = scanner.nextInt();
        }

        if(account2 == creditLimit2.getAccountNumber()){
            creditLimit2.setAccountNumber(account2);

            System.out.printf("\nAccount number: %d", creditLimit2.getAccountNumber());
            System.out.printf("\nBeginning balance: %d", creditLimit2.getBeginningBalance());
            System.out.printf("\nCharges: %d", creditLimit2.getCharges());
            System.out.printf("\nCredits: %d", creditLimit2.getCredits());
            System.out.printf("\nNew Balance: %d", creditLimit2.getNewBalance());
        }

        if(creditLimit2.getNewBalance() > creditLimit2.getCreditLimit()){
            System.out.println("\nBalanced Account!");
        } else{
            System.out.println("Credit Limit Exceeded!!!");
        }
    }
}
