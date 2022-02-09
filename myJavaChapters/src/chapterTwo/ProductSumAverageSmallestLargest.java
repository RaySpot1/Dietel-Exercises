package chapterTwo;

import java.util.Scanner;
public class ProductSumAverageSmallestLargest{
    public static void main(String[] args){
        Scanner nums = new Scanner(System.in);

        System.out.println("Enter three integers: ");
        int num1 = nums.nextInt();
        int num2 = nums.nextInt();
        int num3 = nums.nextInt();

        int sum = num1 + num2 + num3;
        System.out.printf("The Sum of %d, %d and %d is %d", num1, num2, num3, sum);

        int product = num1 * num2 * num3;
        System.out.printf("%nThe product of %d, %d and %d is %d", num1, num2, num3, product);

        int average = sum / 3;
        System.out.printf("%nThe average of %d, %d and %d is %d", num1, num2, num3, average);

        System.out.println("\nLargest value = " + maximum(num1, num2, num3));


    }

    public static int maximum(int x, int y, int z){
        return Math.max(x, (Math.max(x, z)));
    }
}

