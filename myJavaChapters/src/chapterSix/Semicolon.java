package chapterSix;

import java.util.Scanner;

public class Semicolon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = scanner.next();
        System.out.println("Enter scv number: ");
        int scvNumber = scanner.nextInt();

        Native aNative = new Native(name, scvNumber);
        System.out.println(aNative.getName());
        System.out.println(aNative.getScvId());


    }
}
