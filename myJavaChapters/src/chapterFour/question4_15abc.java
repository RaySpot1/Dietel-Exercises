package chapterFour;
//4.15 Identify and correct the errors in each of the following pieces of code. [Note: There may be
//        more than one error in each piece of code.]
// a) if (age >= 65);
//        System.out.println("Age is greater than or equal to 65");
//        else
//        System.out.println("Age is less than 65)";
//b) int x == 1, total == 0;
//        while (x <= 10) {
//        total ++x;
//        System.out.println(x);
//        }
//  c) while (x <= 100)
//        total += x;
//        ++x;
//  d) while (y =! 0)
//        {
//        System.out.println (y);
public class question4_15abc {
    private static void partA(){
        int age = 65;
        if( age >= 65)
            System.out.println("Age is greater than or equal to 65");
        else
            System.out.println("Age is less than65");

    }

    private static void partB(){
        int x = 1, total = 0;
        while (x <= 10) {
            total += x;
            System.out.println(x);
        }
    }

    private static void partC(){
        int x = 200, total = 0;
        System.out.println(++x);
    }

    private static void partD(){
        int y = 30;
        while (y != 0)
            System.out.println (y);
    }
    public static void main(String[] args) {
        partA();
        partB();
        partC();
        partD();
    }
}

//todo: repair
