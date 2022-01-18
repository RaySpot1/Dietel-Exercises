package chapterTwo;

import java.util.Scanner;

public class worldPopulationCalculator {
    public static void main(String[] args) {
        double worldPopulation = 7.753000000000;
        double annualWorldPopulationRate = 1.0/100;

        System.out.println("Current world population = " + worldPopulation);
        System.out.println("Annual world population growth rate = "+ annualWorldPopulationRate);

        double formula = 1.0/100 * 7.753000000000;
        double oneYear = formula * 365;
        double twoYear = formula * 730;
        double threeYear = formula * 1095;
        double fourYear = formula * 1460;
        double fiveYear = formula * 1825;

        System.out.printf("World population after 1 Year = %f", oneYear);
        System.out.printf("\nworld population after 2 Years = %f", twoYear);
        System.out.printf("\nWorld population after 3 Years = %f", threeYear);
        System.out.printf("\nWorld population after 4 Years = %f", fourYear);
        System.out.printf("\nWorld population after 5 Years = %f", fiveYear);







    }
}
