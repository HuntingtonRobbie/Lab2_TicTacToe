import java.util.Scanner;

public class TicTacToe {
    static int BOARDSIZE = 3;
    enum STATUS  {WIN, DRAW, CONTINUE}
    static char[] [] board;
    boolean FirstPlayer;
    boolean GameOver;

    static void play(){}
    public static void printboard(){
        for(char[] row : board) {
            for(char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }

     static void main() {
        board = new char[][] {
                {'_', '_', '_', '_', '_', '_','_','_', '_', '_', '_', '_', '_','_', '_', '_', '_', '_', '_'},
                {'|', ' ', ' ', ' ', ' ', ' ', '|',' ', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ','|' },
                {'|', ' ', ' ', ' ', ' ', ' ', '|',' ', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ','|' },
                {'|','_', '_', '_', '_', '_', '|','_', '_', '_', '_', '_', '|', '_', '_', '_', '_', '_','|' },
                {'|', ' ', ' ', ' ', ' ', ' ', '|',' ', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ','|' },
                {'|', ' ', ' ', ' ', ' ', ' ', '|',' ', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ','|' },
                {'|','_', '_', '_', '_', '_', '|','_', '_', '_', '_', '_', '|', '_', '_', '_', '_', '_','|' },
                {'|', ' ', ' ', ' ', ' ', ' ', '|',' ', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ','|' },
                {'|', ' ', ' ', ' ', ' ', ' ', '|',' ', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ','|' },
                {'|','_', '_', '_', '_', '_', '|','_', '_', '_', '_', '_', '|', '_', '_', '_', '_', '_','|' },};
       printboard();

       Scanner scan = new Scanner(System.in);
       System.out.println("Enter your placement row(0-2)");
       int rowpos = scan.nextInt();
       System.out.println("Enter your placement column(0-2)");
       int colpos = scan.nextInt();
       System.out.println('('+ String.valueOf(rowpos) + ", " + String.valueOf(colpos) + ')');

       switch (rowpos) {
           case 0:
               switch (colpos){
                   case 0:
                       board[2][3] = 'X';
                       break;
                   case 1:
                       board[2][9] = 'X';
                       break;
                   case 2:
                       board[2][15] = 'X';
                       break;
               }
               break;
           case 1:
               switch (colpos){
                   case 0:
                       board[5][3] = 'X';
                       break;
                   case 1:
                       board[5][9] = 'X';
                       break;
                   case 2:
                       board[5][15] = 'X';
                       break;
               }
               break;
           case 2:
               switch (colpos){
                   case 0:
                       board[8][3] = 'X';
                       break;
                   case 1:
                       board[8][9] = 'X';
                       break;
                   case 2:
                       board[8][15] = 'X';
                       break;
               }
               break;
       }
       printboard();
    }

}