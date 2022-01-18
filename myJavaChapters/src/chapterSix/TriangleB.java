package chapterSix;

public class TriangleB {
    public static void main(String[] args) {
        for(int num = 6; num >= 1; num--){
            for(int row = 1; row <= num; row++){
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
