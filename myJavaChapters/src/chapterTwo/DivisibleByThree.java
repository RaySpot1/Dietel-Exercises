package chapterTwo;

import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This program determines if your input is divisible by 3 or not");
        System.out.println("Enter an integer: ");

        int input = scanner.nextInt();

        if(input % 3 == 0)
            System.out.println(input + " Is divisible by 3");
        else
            System.out.println(input + " Is not divisible by 3");
    }

}
