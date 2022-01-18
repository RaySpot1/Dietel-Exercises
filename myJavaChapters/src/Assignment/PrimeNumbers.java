package Assignment;

public class PrimeNumbers {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        System.out.println("Prime number to determine = 10000");
        int number = 10000;
        int counter = 0;
        int i;

        for (i = 0; i <= number; i++){
            i += 3;
            System.out.println(i);
            counter++;

            int counterAdd = i;
            int division = counterAdd / 2;
            System.out.printf("Division Test for %d = %d%n ",i, division);

            System.out.println("SquareRoot Test" + Math.sqrt(i));


        }
        System.out.printf("%d numbers were tested to find the primes between 0-10000 %n", counter);



//        System.out.println(Math.sqrt(counter));
    }
}
