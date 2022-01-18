package chapterTwo;

import java.util.Scanner;
public class CompareInt{
    public static void main(String[] args){
        Scanner intInput = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int firstNum = intInput.nextInt();
        int firstNumSquare = firstNum * firstNum;


        if(firstNum > 100){
            System.out.printf("Your input %d > 100", firstNum);
        }
        if(firstNumSquare > 100){
            System.out.printf("%nThe square of %d is %d and %d > 100", firstNum, firstNumSquare, firstNumSquare);
        }

        if(firstNum == 100){
            System.out.printf("%nYour input %d == 100", firstNum);
        }
        if(firstNumSquare == 100){
            System.out.printf("%nThe square of %d is %d and %d == 100",firstNum, firstNumSquare, firstNumSquare);
        }

        if(firstNum != 100){
            System.out.printf("%nYour input %d != 100", firstNum);
        }
        if(firstNumSquare != 100){
            System.out.printf("%nThe square of %d is %d and %d != 100",firstNum, firstNumSquare, firstNumSquare);
        }

        if(firstNum < 100){
            System.out.printf("%nYour input %d < 100", firstNum);
        }
        if(firstNumSquare < 100){
            System.out.printf("%nThe square of %d is %d and %d < 100", firstNum, firstNumSquare, firstNumSquare);
        }
    }
}

