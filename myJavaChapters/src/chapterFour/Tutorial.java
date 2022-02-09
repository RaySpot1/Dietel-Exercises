package chapterFour;
import java.util.Scanner;

public class Tutorial {
    public static void main(String[] args) {
       double principal = 1000.0;
       double rate = 0.05;
        System.out.println("=====================================");
       for(int year = 1; year <= 10; year+=1){
           double amount = Math.pow(1.0 + rate, year);
           System.out.printf("%d \t %f%n", year, amount);

       }
        System.out.println("======================================");

    }
}
