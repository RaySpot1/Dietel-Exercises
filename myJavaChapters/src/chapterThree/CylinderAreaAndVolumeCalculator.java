//Oludare David
import java.util.Scanner;

public class CylinderAreaAndVolumeCalculator {
	
	public static void main(String[] args){
		
		Scanner radiusInput = new Scanner(System.in);
		System.out.println("Enter the radius and length of a cylinder: ");
		int radius = radiusInput.nextInt();
		int length = radiusInput.nextInt();
		
		int area = radius * radius * 22/7;
		int volume = area * length;

		System.out.printf("The area is %d%n", area);
		System.out.printf("The volume is %d", volume);
		
	}
}