package chapterSeven;

import java.util.Scanner;

// Produce a code that takes in ten students score. Each student will enter a score. Print out the average, total,
// minimum and maximum of the grades
public class Array{
    public static void main(String[] args) {
        int[] arrays = new int[10];
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        int total = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers");

        for(int num = 0; num < 10; num++){
            arrays[num] = scanner.nextInt();

            total = arrays[num] + total;

            int gradeList = arrays[num];

            if(gradeList > maximum){
                maximum = gradeList;
            }

            if(gradeList < minimum){
                minimum = gradeList;
            }
        }
        for(int i = 0; i < 10; i++){
            System.out.printf("You entered: %d%n", arrays[i]);
        }

        int average = total/10;

        System.out.printf("Total: %d%n", total);
        System.out.printf("Average: %d%n", average);
        System.out.printf("Minimum: %d%n", minimum);
        System.out.printf("Maximum: %d%n", maximum);

    }
}

// for(int number : total_number_of_inputs){
//            System.out.println(number + " ");
//        } enhanced for loop