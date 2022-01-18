package chapterTwo;

import java.util.Scanner;

public class IntSquareSumDiff{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two integers: ");
        int integer1 = scan.nextInt();
        int integer2 = scan.nextInt();

        int square1 = integer1 * integer1;
        int square2 = integer2 * integer2;

        int squareSum = square1 + square2;
        int squareDiff = square1 - square2;

        System.out.printf("The square of %d and %d is %d and %d respectively %n", integer1, integer2, square1, square2);
        System.out.printf("The square sum of %d and %d is %d%n", integer1, integer2, squareSum);
        System.out.printf("The square difference of %d and %d is %d", integer1, integer2, squareDiff);
    }
}

