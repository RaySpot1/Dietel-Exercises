package Tutorials;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fun {

    public static int quotient(int numerator, int denominator){
        return numerator / denominator;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        do {
            try {
                System.out.println("Please enter an integer numerator");
                int numerator = scanner.nextInt();

                System.out.println("Please enter an integer denominator");
                int denominator = scanner.nextInt();

                int result = quotient(numerator, denominator);

                System.out.printf("Result: %d / %d = %d", numerator, denominator, result);
                loop = false;
            } catch (ArithmeticException error) {
                System.out.println("Cannot " + error.getMessage());
                scanner.nextInt();
                System.out.println("Enter an integer numerator");

            } catch (InputMismatchException error){
//                System.out.printf("Please follow the instructions %n%n");
                scanner.nextLine();
            }
        } while(loop);

    }

}