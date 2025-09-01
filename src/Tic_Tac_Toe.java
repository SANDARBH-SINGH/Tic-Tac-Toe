import java.util.*;
public class Tic_Tac_Toe {
    public static void main(String[] args) {
        System.out.println("***** Welcome to the game of Tic Tac Toe *****");
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];
        char player = 'X';
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
        boolean gameOver = false;
        while (!gameOver) {
            PrintBoard(board);
            System.out.println("Turn of " + player +" :");
            int row = sc.nextInt();
            int col = sc.nextInt();
            if (board[row][col] == ' ') {
                board[row][col] = player;
                gameOver = haveWon(board, player);
                if (gameOver) {
                    System.out.println("Player " + player + " wins!");
                } else {
                    player = (player == 'X' ? 'O' : 'X');
                }
            } else {
                System.out.println("Invalid Move");
            }
        }
        PrintBoard(board);
    }

    private static void PrintBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
    }

    private static boolean haveWon(char[][] board, char player) {
        // Check rows
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        // check column
        for (int j = 0; j < board.length; j++) {
            if(board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }
        // check diagonal
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if(board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }
}