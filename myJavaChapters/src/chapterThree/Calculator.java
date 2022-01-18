package chapterThree;
//calculator App

import java.util.Scanner;
public class Calculator{
	
	public static void main(String[] args){
	

		System.out.print("enter first number");
		Scanner dave = new Scanner(System.in);
		int firstNumber = dave.nextInt();

	
		System.out.print("enter second number:");
		int secondNumber = dave.nextInt();
		int sum = firstNumber + secondNumber;

		System.out.printf("The sum of %d and %d = %d", firstNumber, secondNumber, sum);

	}
}