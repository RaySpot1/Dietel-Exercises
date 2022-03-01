package chapterSeven;

public class InitArray {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] arr2 = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("Row of arr1 = " );
        outPutArray(arr1);

        System.out.println("Row of arr2 = ");
        outPutArray(arr2);
    }

    private static void outPutArray(int[][] array) {
        for(int row = 0; row < array.length; row++){
            for(int column = 0; column < array[row].length; column++){
                System.out.printf("%d ", array[row][column]);
            }
            System.out.println();
        }
    }
}
