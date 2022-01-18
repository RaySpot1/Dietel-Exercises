package chapterTwo;

import java.util.Scanner;

public class negativePositiveAndZeroVaues {
    public static void main(String[] args) {

        int positive = 0;
        int negative = 0;
        int zero = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five digits: ");
        int[] arr = new int[5];


        for(int i = 0; i < 5; i++)
            arr[i] = scanner.nextInt();

        for(int i = 0; i < 5; i++)
            if(arr[i] < 0)
                negative++;
            else if(arr[i] > 0)
                positive++;
            else
                zero++;

        System.out.printf("Positive = %d \n", positive);
        System.out.printf("Negative = %d \n", negative);
        System.out.printf("Zeros = %d", zero);

    }
}
