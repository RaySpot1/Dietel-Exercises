package Assignment;
import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int random = rand.nextInt(100);
        int staticRandom = random + 1;
        int number = 0;
        int counter = 0;
        boolean y = true;
        boolean n = false;


        while (number != staticRandom) {
            System.out.println("Enter random number");
            number = scan.nextInt();

            if (number > staticRandom) {
                System.out.println("Too High!!! \n Try Again!!!");
            }
            if (number < staticRandom) {
                System.out.println("Too Low!!! \n Try Again!!!");
            } else if(number == staticRandom) {
                System.out.println("Congratulations!!!");
                System.out.println("Do you want to retry? Enter y/n");
                String validate = scan.next();
              /*  if(validate){
                    if(number != staticRandom)
                        System.out.println("Enter a new random number: ");
                        number = scan.nextInt();
                        if(number > staticRandom)
                            System.out.println("Too High!!! \n Try Again!!!");
                        if(number < staticRandom)
                            System.out.println("Too Low!!! \n Try Again!!!");
                        else if(number == staticRandom)
                            System.out.println("Congratulations!!! You guessed right");

                } else if (n);
                    break;*/
            }

//            modification
//            if(counter <= 10)
//                break;
//            System.out.println("Either you know the secret or you got Lucky!");
//            if(counter == 10)
//                System.out.println("Aha! Yp=ou know the secret!!!");
//            if(counter > 10)
//                System.out.println("You should be able to do better, Why should it take you more than 10 Guesses!");
        }
    }
}

