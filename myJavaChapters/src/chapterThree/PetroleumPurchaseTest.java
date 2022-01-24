package chapterThree;

import java.util.Scanner;

public class PetroleumPurchaseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PetroleumPurchase petrol = new PetroleumPurchase("Lagos, Nigeria", "OCTANE-95 gasoline",0,165.77,0.05);

        System.out.println("Welcome to BEST PETROLEUM NIG LTD");
        System.out.printf("Location: %s%n", petrol.getLocation());
        System.out.printf("Petrol Type: %s%n", petrol.getPetrolType());
        System.out.printf("Price per Litre: %.2f%n", petrol.getLitre());
        System.out.printf("Discount per purchase @ %.2f", petrol.getDiscount());

        System.out.print("\n\nHow much Litres of fuel do you want: ");
        int input = scanner.nextInt();
        petrol.getPurchaseAmount(input);
        System.out.println("\n\ncomputing...\n\n");
        System.out.printf("%nPurchase Amount: %.2f" , petrol.getPurchase());
        System.out.println("\nThank you for purchasing!!!");

    }
}
