package chapterThree;

import java.util.Scanner;

public class ClockApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clock clock = new Clock(00, 00, 00);

        System.out.println("Enter hour in format hh: ");
        int hour = scanner.nextInt();
        clock.setHour(hour);

        System.out.println("Enter minutes in format mm:");
        int minutes = scanner.nextInt();
        clock.setMinutes(minutes);

        System.out.println("Enter seconds on format ss:");
        int seconds = scanner.nextInt();
        clock.setSeconds(seconds);

        System.out.println(clock.displayTime());
    }
}
