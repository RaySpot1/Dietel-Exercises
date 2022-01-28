package chapterFour;

import java.util.Scanner;

public class gasMileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Miles Driven: ");
        double miles = scanner.nextDouble();

        System.out.println("Enter gallons of fuel used: ");
        double gallons = scanner.nextDouble();

        double milesPerGallon = miles/gallons;
        System.out.println("Miles per gallon: " + milesPerGallon);


    }
}
