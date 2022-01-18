package chapterTwo;

import java.util.Scanner;
public class diameterCircumferenceAndArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This programs prints the Diameter, Circumference & Area of a Circle");
        System.out.print("Enter the radius of the circle: ");

        int radius = scanner.nextInt();

        int diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * (radius * radius);

        System.out.printf("Diameter: %d", diameter);
        System.out.printf("\nCircumference %.2f:", circumference);
        System.out.printf("\nArea: %.2f", area);
    }
}
