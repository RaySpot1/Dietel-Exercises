package chapterSix;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to refactor: ");
        int input = scanner.nextInt();

        int count = 0;
        for(int counter = 1; counter <= input; counter++){
            if(input % counter == 0) {      //5 ans = 1,
                System.out.print(counter + ", ");
                count++;
            }
        }
        System.out.printf("%nOccurred %d times", count);
    }
}
