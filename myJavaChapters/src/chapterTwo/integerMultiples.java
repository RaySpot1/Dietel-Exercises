package chapterTwo;

import java.util.Scanner;

public class integerMultiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 2 numbers: ");
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();

        int input1Tripled = (int) Math.pow(input1, 3);
        int input2Doubled =  (int) Math.pow(input2, 2);

        if(input1Tripled % input2Doubled == 0)
            System.out.println(input1Tripled + " is a multiple of " + input2Doubled);
        else
            System.out.println(input1Tripled + " is not a multiple of " + input2Doubled);
    }
}
