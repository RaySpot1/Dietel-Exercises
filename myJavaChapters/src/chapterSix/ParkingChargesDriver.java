package chapterSix;

import java.util.Scanner;

public class ParkingChargesDriver {
    public static void display(String message){
        System.out.print(message);
    }
    static ParkingCharges charge = new ParkingCharges();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        display("Welcome to our Parking Lot \nKindly provide hours of Parked time: ");
        double hoursInput = scanner.nextDouble();
        charge.calculateCharges(hoursInput);

    }
}
