package Assignment;

import java.util.Scanner;

public class Encryption1B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int a = 5;
         int b = 9;
         int c = 3;
         int d = 1;

        System.out.println("Enter four Integers: ");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();
        int number4 = scan.nextInt();

        number1 = a;
        number2 = b;
        number3 = c;
        number4 = d;

        System.out.printf("Decrypted value = %d%d%d%d", number1, number2, number3, number4);



    }
}
