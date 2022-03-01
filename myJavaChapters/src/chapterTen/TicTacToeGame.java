package chapterTen;

public class TicTacToeGame {
    public static void main(String[] args) {
        TicTacToe play = new TicTacToe();
        System.out.println("Welcome to TIcTacToe Game");
        TicTacToe.printBoard(play.gameBoard);
    }
}
