package chapterTen;

import java.util.Scanner;

public class TicTacToe {
    public static Scanner scanner = new Scanner(System.in);
    char[][] gameBoard = {
            {'_','|','_','|','_'},
            {'_','|','_','|','_'},
            {' ','|',' ','|',' '}

    };

    public static void playerMove(char[][] gameBoard){
        System.out.println("Please make a move 1-9");
        int move = scanner.nextInt();

        boolean result = validMove(move, gameBoard);
        updateBoard(move, 1, 1, gameBoard);

        while(!result){
            System.out.println("Sorry, invalid move. Try again!");
            move = scanner.nextInt();
            result = validMove(move, gameBoard);
        }

        System.out.println("Player moved at position " + move);
        updateBoard(move, 1, 2, gameBoard);
    }

    public static boolean validMove(int move, char[][] gameBoard){
        switch (move){
            case 1:
                if(gameBoard[0][0] == '-'){
                    return true;
                } else {
                    return false;
                }

            case 2:
                if(gameBoard[0][2] == '_'){
                    return true;
                } else {
                    return false;
                }

            case 3:
                if(gameBoard[0][4] == '_'){
                    return true;
                } else{
                    return false;
                }

            case 4:
                if(gameBoard[1][0] == '_'){
                    return true;
                } else{
                    return false;
                }

            case 5:
                if(gameBoard[1][2] == ' '){
                    return true;
                } else{
                    return false;
                }

            case 6:
                if(gameBoard[1][4] == ' '){
                    return true;
                } else{
                    return false;
                }

            case 7:
                if(gameBoard[2][0] == ' '){
                    return true;
                }else {
                    return false;
                }

            case 8:
                if(gameBoard[2][2] == ' '){
                    return true;
                }else {
                    return false;
                }

            case 9:
                if(gameBoard[2][4] == ' '){
                    return true;
                } else{
                    return false;
                }
            default:
                return false;

        }
    }

    public static void printBoard( char[][] gameBoard){
        for(char[] row : gameBoard){
            for(char column : row){
                System.out.print(column);
            }
            System.out.println();
        }
    }


    public static void updateBoard(int position, int player1, int player2, char[][] gameBoard){
        char character = 0;

        if(player1 == 1){
            character = 'x';
        }else if (player2 == 2){
            character = 'o';
        }

        switch(position){
            case 1:
                gameBoard[0][0] = character;
                printBoard(gameBoard);
                break;

            case 2:
                gameBoard[0][2] = character;
                printBoard(gameBoard);
                break;

            case 3:
                gameBoard[0][4] = character;
                printBoard(gameBoard);
                break;

            case 4:
                gameBoard[1][0] = character;
                printBoard(gameBoard);
                break;

            case 5:
                gameBoard[1][2] = character;
                printBoard(gameBoard);
                break;

            case 6:
                gameBoard[1][4] = character;
                printBoard(gameBoard);
                break;

            case 7:
                gameBoard[2][0] = character;
                printBoard(gameBoard);
                break;

            case 8:
                gameBoard[2][2] = character;
                printBoard(gameBoard);
                break;

            case 9:
                gameBoard[2][4] = character;
                printBoard(gameBoard);
                break;

            default:
                break;
        }
    }

}
