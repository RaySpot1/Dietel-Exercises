package chapterTwo;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        int weight = scanner.nextInt();

        System.out.println("Enter your height: ");
        int height = scanner.nextInt();

        double weightInPounds = weight * 2.2046;
        double heightInMeters = height * 3.28;
        double userBmi = (weightInPounds * 703) / (heightInMeters * heightInMeters);

        System.out.printf("Your 'BMI' = %.2f: ", userBmi);
        System.out.println();

        if(userBmi < 18.5) {
            System.out.println("Underweight");
        }
        else if(userBmi > 18.5 && userBmi < 24.9) {
            System.out.println("Normal weight");
        }
        else if(userBmi > 25 && userBmi < 29.9) {
            System.out.println("Overweight");
        }
        else if(userBmi >= 30) {
            System.out.println("Obesity");
        }

    }

}
