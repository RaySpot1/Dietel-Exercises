package chapterTwo;

import java.util.Scanner;
public class ProductSumAverageSmallestLargest{
    public static void main(String[] args){
        Scanner nums = new Scanner(System.in);

        System.out.println("Enter three integers: ");
        int firstInt = nums.nextInt();
        int secondInt = nums.nextInt();
        int thirdInt = nums.nextInt();

        int sum = firstInt + secondInt + thirdInt;
        System.out.printf("The Sum of %d, %d and %d is %d", firstInt, secondInt, thirdInt, sum);

        int product = firstInt * secondInt * thirdInt;
        System.out.printf("%nThe product of %d, %d and %d is %d", firstInt, secondInt, thirdInt, product);

        int average = sum / 3;
        System.out.printf("%nThe average of %d, %d and %d is %d", firstInt, secondInt, thirdInt, average);

        if(firstInt < secondInt && firstInt < thirdInt)
            System.out.printf("%nSmallest = %d", firstInt);
        if(secondInt < firstInt && secondInt < thirdInt)
            System.out.printf("%nSmallest = %d", secondInt);
        else
            System.out.printf("%nSmallest = %d", thirdInt);

        if(firstInt > secondInt && firstInt > thirdInt)
            System.out.printf("%nLargest = %d", firstInt);
        if(secondInt > firstInt && secondInt > thirdInt)
            System.out.printf("%nLargest = %d", secondInt);
        else
            System.out.printf("%nLargest = %d", thirdInt);
    }
}

