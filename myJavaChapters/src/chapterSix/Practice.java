package chapterSix;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three floating numbers: ");

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        double result = maximum(num1, num2, num3);

        System.out.println("Maximum = " + result);
    }

    public static double maximum(double x, double y, double z){
        return Math.max(x, Math.max(y, z));
    }
}
