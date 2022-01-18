package chapterTwo;

import java.util.Scanner;

public class LargeAndSmallIntegers {
    public static void main(String[] args) {
        int maximumNum = 0;

        int input1 = input("Enter a first number");
        int input2 = input("Enter second number");
        int input3 = input("Enter third number");
        int input4 = input("Enter fourth number");
        int input5 = input("Enter fight number");


        if(input1 > input2 && input1 > input3 && input1 > input4 && input1 > input5)
            System.out.println("Maximum number = " + input1);
        if(input2 > input1 && input2 > input3 && input2 > input4 && input2 > input5)
            System.out.println("Maximum number = " + input2);
        if(input3 > input1 && input3 > input2 && input3 > input4 && input3 > input5)
            System.out.println("Maximum number = " + input3);
        if(input4 > input1 && input4 > input2 && input4 > input3 && input4 > input5)
            System.out.println("Maximum number = " + input4);
        if(input5 > input1 && input5 > input2 && input5 > input3 && input5 > input4)
            System.out.println("Maximum number = " + input5);

        if(input1 < input2 && input1 < input3 && input1 < input4 && input1 < input5)
            System.out.println("Minimum number = " + input1);
        if(input2 < input1 && input2 < input3 && input2 < input4 && input2 < input5)
            System.out.println("Minimum number = " + input2);
        if(input3 < input1 && input3 < input2 && input3 < input4 && input3 < input5)
            System.out.println("Minimum number = " + input3);
        if(input4 < input1 && input4 < input2 && input4 < input3 && input4 < input5)
            System.out.println("Minimum number = " + input4);
        if(input5 < input1 && input5 < input2 && input5 < input3 && input5 < input4)
            System.out.println("Minimum number = " + input5);
    }

    private static int input(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
