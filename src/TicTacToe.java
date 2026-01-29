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
                {'_', '_', '_', '_', '_', '_','_'},
                {'|', ' ', '|', ' ', '|', ' ','|'},
                {'|', '-', '+', '-', '+', '-','|'},
                {'|', ' ', '|', ' ', '|', ' ','|'},
                {'|', '-', '+', '-', '+', '-','|'},
                {'|', ' ', '|', ' ', '|', ' ','|'},
                {'-', '-', '-', '-', '-', '-','-'}};
       printboard();


    }

}