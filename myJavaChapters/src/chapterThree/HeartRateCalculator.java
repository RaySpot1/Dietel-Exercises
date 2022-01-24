package chapterThree;

import java.util.Scanner;

public class HeartRateCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HealthProfile profile = new HealthProfile("", "", 0, 0, 0);

        System.out.println("This app Calculates your Age(in year's), Maximum Heart Rate and Target Heart Rate Range");
        System.out.print("Enter your First Name: ");
        String firstName = scanner.nextLine();
        profile.setFirstName(firstName);

        System.out.print("\nEnter your Last Name: ");
        String lastName = scanner.nextLine();
        profile.setLastName(lastName);

        System.out.print("\nEnter your gender in format female/male ");
        String gender = scanner.nextLine();
        profile.setGender(gender);

        System.out.print("\nEnter Date of Birth in format dd/mm/yy ");
        int[] dob = new int[3];

        for(int i = 0; i < 3; i++){
            dob[i] = scanner.nextInt();
        }
        profile.setDayOfBirth(dob[0]);
        profile.setMonthOfBirth(dob[1]);
        profile.setYearOfBirth(dob[2]);

        System.out.print("\ninfo stored \n generating results...");
        System.out.println();

        System.out.printf("%nFull Name: %s%n", profile.getFullName());
        System.out.printf("Age: %d%n", profile.getAgeInYears());
        System.out.printf("Gender: %s%n", profile.getGender());
        System.out.printf("Maximum Heart Rate: %d%n", profile.getMaximumHearthRate());
        System.out.printf("Target-Heart-Rate Range: %d", profile.getTargetHeartRange());

    }
}
