package chapterSeven;

//    char[][] ticTacToe = new char[3][3];
//    char[3][3] ticTacToe = {{'x', '0', '0'}, {'X', 'X', 'X'}, {'O','X','O'}
public class ticTacToe {
    public static void main(String[] args) {


        char[][] ticTacToe = {{'X', 'O', 'O'}, {'X', 'X', 'X'}, {'O', 'X', 'O'}};


        for (int row = 0; row < ticTacToe.length; row++) {
            for (int column = 0; column < ticTacToe[row].length; column++) {
                System.out.print(ticTacToe[row][column] + " ");
            }
            System.out.println();
        }

//        for(char[] outer : ticTacToe){
//            for(char innerArray : outer){
//                System.out.println(ticTacToe[outer][innerArray]);
//            }
//        }
    }
}
