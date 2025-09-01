import java.util.*;
public class Tic_Tac_Toe {
    public static void main(String[] args) {
        System.out.println("***** Welcome to the game of Tic Tac Toe *****");
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[3][3];
        char player = 'X';
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[i].length ; j++){
                board[i][j] = ' ';
            }
        }
        boolean gameOver = false;
        while(!gameOver){
            System.out.println(board);
            System.out.println("Make your move Player :"+player);
            int row = sc.nextInt();
            int col = sc.nextInt();
            if(board[row][col] == ' '){
                board[row][col] = player;
            }
            gameOver = haveWon(board,player);
            if(gameOver){

            }
        }
    }

    private static boolean haveWon(int[][] board, char player) {

    }
}
}