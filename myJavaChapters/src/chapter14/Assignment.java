package chapter14;

import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
//        14.3 Palindrome
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a Palindrome word: ");
//
//        String userInput = scanner.nextLine();
//
//        String reversed = "";
//        for (int i = userInput.length()-1; i >=0; --i) {
//            reversed = reversed + userInput.charAt(i);
//        }
//
//        userInput = userInput.toLowerCase();
//        if(userInput.equals(reversed)){
//            System.out.println(userInput + " is palindrome");
//        } else{
//            System.out.println(userInput + " is not Palindrome");
//        }


//        14.8 Tokenizing

//        System.out.println("Enter telephone Number: ");
//        String input = scanner.nextLine();
//
//        String[] tokens = input.split(" ");
//
//        for (int i = 0; i < tokens.length; i+=3) {
//            System.out.println("Area code: " + tokens[0]);
//            System.out.println("First three digits: " + tokens[1]);
//            System.out.println("Last four digits: " + tokens[2]);
//        }


//        14.9

        System.out.println("Enter a word to be reversed: ");
        String input = scanner.nextLine();
        StringBuilder reversed = new StringBuilder(" ");


        String[] tokens = input.split(",");

        for (int i = 0; i < tokens.length; i++) {
            reversed.append(tokens[i]);

            reversed.reverse();
        }

        System.out.println(reversed);
















    }
}
