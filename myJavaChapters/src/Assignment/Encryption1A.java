package Assignment;
import java.util.Scanner;

public class Encryption1A {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter Four Digit Numbers");
        int number1 = scan.nextInt();
        int number2 =  scan.nextInt();
        int number3 = scan.nextInt();
        int number4 = scan.nextInt();

        int newValue1 =  number1 + 7;
        int newValue2 =  number2 + 7;
        int newValue3 =  number3 + 7;
        int newValue4 =  number4 + 7;

        int remainder1 =  newValue1%10; //x
        int remainder2 =  newValue2%10; //a
        int remainder3 =  newValue3%10; //y
        int remainder4 =  newValue4%10; //b

        int d = remainder1;
        int a = remainder3;
        int b = remainder1;

        int t = remainder2;
        int x = remainder4;
        int y = remainder2;

        System.out.printf("Initial remainder values are %d%d%d%d%n", remainder1, remainder2, remainder3, remainder4);
        System.out.printf("Swapped values %d%d%d%d", a, x, b, y);

    }
}
