package chapterTwo;

import java.io.PrintStream;
import java.util.Scanner;

public class seperatingDigitsInInteger {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int nr, nr1, nr2, nr3, nr4, nr5;

        System.out.println("Enter 5 digits");
        nr = scanner.nextInt();

        nr1 = nr / 10000;
        nr2 = (nr % 10000) / 1000;
        nr3 = ((nr % 10000) % 1000) / 100;
        nr4 = (((nr % 10000) % 1000) % 100) / 100;
        nr5 = (((nr % 10000) % 1000) % 100) % 10;

        System.out.printf("%d%d%d%d%d", nr1 + " " + nr2 + " " + nr3 + " " + nr4 + " " + nr5
        );
    }
}

