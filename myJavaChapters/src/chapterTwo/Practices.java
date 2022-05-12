package chapterTwo;
import java.util.Scanner;

public class Practices {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first num: ");
        int firstNum = scanner.nextInt();

        System.out.print("Enter second num: ");
        int secondNum = scanner.nextInt();

        if(firstNum == secondNum){
            System.out.printf("%d == %d%n", firstNum, secondNum);
        }
        if(firstNum != secondNum){
            System.out.printf("%d != %d%n", firstNum, secondNum);
        }
        if(firstNum > secondNum)
            System.out.printf("%d > %d%n", firstNum, secondNum);
        if(firstNum < secondNum)
            System.out.printf("%d < %d%n", firstNum, secondNum);
        if(firstNum >= secondNum)
            System.out.printf("%d >= %d%n", firstNum, secondNum);
        if(firstNum <= secondNum)
            System.out.printf("%d <= %d%n", firstNum, secondNum);
    }
}
