package chapterFour;

//4.10: IF single statement is based on whether a condition is true or false.
//If the condition is true, the single-selection statement performs it's actions once.
//The while repetition statement repeatedly performs the action(s) until the condition becomes false.
//4.11: The fractional part gets Truncated.
//4.12: Control Statement stacking: connects the exit point of one statement to the entry point of another.
// Control Statement Nesting: One control statement appears inside another.
//4.13: Counter-Controlled Repetition can be used for calculating the sum of the first 100
//	positive integers.
//
//		Uses a counter (or control variable) to control the number of times a set of statements
//		will execute.
//
//	Sentinel-Controlled Repetition can be used for calculating the sum of an arbitrary
//	number of positive integers.
//
//		use a special value called a sentinel value (also called a signal value, a dummy value
//		or a flag value) to indicate “end of data entry.” A sentinel value must be chosen that
//		cannot be confused with an acceptable input value.
//4.14: integer x++ will be equal 3 while integer ++x will equal 4
//4.15: a. Age is not initialized
//      b. Double equals cannot be used for initializing a value, total = ++x
//      c. Nothing
//      d. while (x != 10) not =!
public class exercise4_10{
    public static void main(String[] args) {
       int x = 1, total = 0;

       while(x <= 100){
           total += x;
           ++x;
           System.out.println(total);
       }
    }
}
