package chapterSix;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        display("Add calculator");

        add(1000000, 500004);

    }

    public static void add(int num1, int num2){
        int result = num1 + num2;
        System.out.println(result);
    }

    public static void display(String message){
        System.out.println(message);
    }
}
