package chapterThree;

import java.util.Scanner;

public class CarApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car1 = new Car("Chevrolet Spark", "2021", 14000.00, 0.05);
        Car car2 = new Car("Mitsubishi", "2021", 15290.00, 0.07);

        System.out.println("AUTOMOBILE STORE!!!\n");
        System.out.println("MODEL \t\t\t\t YEAR \t PRICE\n");
        System.out.printf("%s \t %s \t %.2f%n", car1.getModel(), car1.getYear(), car1.getPrice());
        System.out.printf("%s \t\t\t %s \t %.2f", car2.getModel(), car2.getYear(), car2.getPrice());

        System.out.println("\n\nPunch 'Enter' to apply discounts...");
//        String input = scanner.nextLine();
        try{System.in.read();}
                    catch(Exception e){};
//        scanner.nextLine();

        System.out.println("applying discounts...\n\n");

        System.out.println("MODEL \t\t\t\t YEAR \t PRICE\n");
        System.out.printf("%s \t %s \t %.2f%n", car1.getModel(), car1.getYear(), car1.getDiscount());
        System.out.printf("%s \t\t\t %s \t %.2f", car2.getModel(), car2.getYear(), car2.getDiscount());
        System.out.println();
    }
}
