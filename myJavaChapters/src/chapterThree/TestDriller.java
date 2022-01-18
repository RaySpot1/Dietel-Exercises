package chapterThree;
//We first write a code that takes an input, then we and then we write conditions
//that assigns different multiplications to the input arcording to the number imputed,
//so therefore, as the numbers increases the figure they are multiplied by decreases.
import java.util.Scanner;

public class TestDriller{

        public static void main(String[] args){
            Scanner store = new Scanner(System.in);
            System.out.println("How many copy(s) do you want?: ");
            int quantity = store.nextInt();

            int estimate1 = quantity * 2000;
            if(quantity <= 4 && quantity >= 1)
                System.out.printf ("Your total estimate @ %d: ", estimate1);

            int estimate2 = quantity * 1800;
            if(quantity <= 9 && quantity >= 5)
                System.out.printf ("Your total estimate @ %d: ", estimate2);

            int estimate3 = quantity * 1600;
            if(quantity <= 29 && quantity >= 10)
                System.out.printf ("Your total estimate @ %d: ", estimate3);

            int estimate4 = quantity * 1500;
            if(quantity <= 49 && quantity >= 30)
                 System.out.printf("Your total estimate @ %d: ", estimate4);

            int estimate5 = quantity * 1300;
            if(quantity <= 99 && quantity >= 50)
                System.out.printf ("Your total estimate @ %d: ", estimate5);

            int estimate6 = quantity * 1200;
            if(quantity <= 199 && quantity >= 100)
                System.out.printf ("Your total estimate @ %d: ", estimate6);

            int estimate7 = quantity * 1100;
            if(quantity <= 499 && quantity >= 200)
                System.out.printf ("Your total estimate @ %d: ", estimate7);

            int estimate8 = quantity * 1000;
            if(quantity >= 500)
                System.out.println ("Your total estimate @ %d: " + estimate5);
    }
}