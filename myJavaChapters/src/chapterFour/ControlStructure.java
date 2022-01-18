package chapterFour;
import java.util.Scanner;

public class ControlStructure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a score: ");
        int score = input.nextInt();

//        if(score >= 90){
//            System.out.println("Excellent!");
//        }
//        else
//            if(score >= 70){
//                System.out.println("Great!!!");
//            }
//            else
//                if(score >= 50 ){
//                    System.out.println("Passed!!");
//                }
//                else
//                    if(score >= 30){
//                        System.out.println("Average!!");
//                    }
//                    else {
//                        System.out.println("FAILURE!!!!!");
//                    }
       // System.out.println(score >= 90 ? "Excellent!!!" : score >= 70 ? "Great!!!" : score >= 50 ? "Passed" : score >= 30 ? "Average!!!" : "FAILED!!!");
        System.out.println(score >= 90 ? "Excellent!!!" : "Invalid");
    }
}
