package chapterSix;

public class Cata {

    public char calculateGradeFor(int score) {
        if(score >= 90) return 'A';
        if(score >= 80) return 'B';
        if(score >= 70) return 'C';
        if(score >= 60) return 'D';
        return 'F';
    }

    public int setPriceFor(int estimate1) {
        int price = 0;
        if(estimate1 <= 4){
            price = estimate1 * 2000;
        }
        return price;
    }

// class exercise
    int[] numbers = {1, 2, 3, 4, 5};
    public int calculateTotalOf(int[] numbers) {

       int result = 0;
       for(int i : numbers){
           result = result + i;
       }
       return result;
    }

    public int calculateMinimumOf(int[] numbers) {
        int minimum = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < minimum)
                minimum = numbers[i];
        }
        return minimum;
    }

    public int calculateMaximumOf(int[] numbers) {
        int maximum = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > maximum)
                maximum = numbers[i];
        }
        return maximum;
    }

    public double calculateAverageOf(int[] numbers) {
        double average;
        int total = 0;
        for(int i = 0; i < numbers.length; i++){
            total = numbers[i];
        }
        average = total/numbers.length;
        return average;

    }

    public int add(int... numbers) {
        int total = 0;
        for(int number : numbers){
            total += number;

        }
        return total;
    }

    //Assignment
    public int calculateOneLastMinOf(int[] numbers) {
        return calculateTotalOf(numbers) - calculateMaximumOf(numbers);
    }

    public int calculateOneLastMaxOf(int[] numbers) {
        return calculateTotalOf(numbers) - calculateMinimumOf(numbers);
    }
}
