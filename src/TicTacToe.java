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
                {'|', ' ', ' ', ' ', ' ', ' ', '|',' ', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ','|' },
                {'|','_', '_', '_', '_', '_', '|','_', '_', '_', '_', '_', '|', '_', '_', '_', '_', '_','|' },
                {'|', ' ', ' ', ' ', ' ', ' ', '|',' ', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ','|' },
                {'|', ' ', ' ', ' ', ' ', ' ', '|',' ', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ','|' },
                {'|', ' ', ' ', ' ', ' ', ' ', '|',' ', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ','|' },
                {'|','_', '_', '_', '_', '_', '|','_', '_', '_', '_', '_', '|', '_', '_', '_', '_', '_','|' },
                {'|', ' ', ' ', ' ', ' ', ' ', '|',' ', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ','|' },
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

    }

}