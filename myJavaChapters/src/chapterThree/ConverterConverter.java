//Oludare David
import java.util.Scanner;

public class ConverterConverter {

		public static void main(String[] args){			

			Scanner input = new Scanner(System.in);
			System.out.printf("Enter a number in Celsius: ");
			double celsiusNum = input.nextInt();
			double formulae = (9.0/5.0) * celsiusNum + 32;

			System.out.printf("Celsius %f = %f Fahrenheit", celsiusNum, formulae);
	}
}