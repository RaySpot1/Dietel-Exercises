package chapterFour;

import java.util.Scanner;
import java.util.Arrays;

public class TenNumbersAMM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter 10 numbers: ");
       int minimum = Integer.MAX_VALUE;
       int maximum = Integer.MIN_VALUE;
       int number;
       int total = 0;
       int counter = 1;

       while(counter <= 10){
           System.out.println("Enter 10 numbers: ");
           number = scanner.nextInt();
           total += number;
           ++counter;
           int current = number;
           if(current > maximum){
               maximum = current;
           }
           if(current < minimum){
               minimum = current;
           }
       }
        int average = total / 10;
        System.out.printf("Average numbers = %d%n", average);
        System.out.printf("The Minimum number is: %d%n", minimum);
        System.out.printf("The Maximum number is: %d", maximum);

    }
}