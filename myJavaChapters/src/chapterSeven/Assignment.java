package chapterSeven;

// given an array numbers = {3, 4, 2, 5, 1}; sum = 15
// less 3 = 4+2+5+1 = 12;
// less 4 = 3+2+5+1 = 11;
// less 2 = 3+4+5+1 = 13;
// less 5 = 3+4+2+1 = 10;
// less 1 = 3+4+2+5 = 14;

// write a function that takes numbers and returns maximum less 1 number and minimum less 1 number
// it'll add all the numbers together and returns the result of the minimum number and
// the result of the maximum number less 1

public class Assignment {

    int[] numbers = {3, 4, 2, 5, 1};

    public int total(){
        int result = 0;
        for(int i : numbers){
            result = result + i;
        }
        return result;
    }

    public int maxOneLess() {
        int maximum = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > maximum)
                maximum = numbers[i];
        }
        return maximum;
    }

    public int minOneLess() {
        int minimum = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < minimum)
                minimum = numbers[i];
        }
        return minimum;
    }

    public static void main(String[] args) {
        Assignment assignment = new Assignment();

        int maximum = assignment.maxOneLess();
        int minimum = assignment.minOneLess();
        int total = assignment.total();

        if(maximum < total){
            maximum = total - maximum;
            System.out.println("minimum = " + maximum);
        }

        if(minimum > total){
            minimum = total - minimum;
        }
        int newNumber = total - minimum;
        System.out.println("Maximum = " + newNumber);
    }
}

