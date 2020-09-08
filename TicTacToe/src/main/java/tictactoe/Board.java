
package tictactoe;

/**
 *k1719859
 * @author k1748796
 */
public class Board {
    
    public Marker [][] board;
    
    public Board() {
        this.board = new Marker [4][4];
        this.Clear();
        
    }
    
    public Board(Marker [][] theboard){
        this.board = theboard;
    }
    
    public final void Clear(){
        for(int i = 0; i<4;i++){
            for(int j = 0; j<4; j++){
                this.board[i][j] = Marker.EMPTY;
                
            }
        }
    }
    
    public void Draw(){
        System.out.printf("\n  0 1 2 3\n");
         for(int i = 0; i<4;i++){
             System.out.printf("%d ",i);
            for(int j = 0; j<4; j++){
                if(j<3){
                    System.out.printf("%s|",board[i][j]);
                }else{
                    System.out.printf("%s", board[i][j]);
                }
                
              }
            System.out.printf("\n");
            if(i<3) System.out.printf("  -+-+-+-\n");
         }
                
    }
    
    public boolean Place(Marker marker, int col, int row){
        if(this.board[col][row]== Marker.EMPTY) {
            this.board[col][row] = marker;
            return true;
        }else{
            System.out.println("OOPS PLACE TAKEN - BETTER LUCK NEXT TIME");
        return false;
        
    }
  }
    
    public boolean Winner(Marker marker){
        
        boolean rowWinner = false;
        boolean colWinner = false;
        boolean angleWinner = false;
        
        rowWinner = (board[0][0] == marker && board[0][1] == marker && board[0][2] == marker && board[0][3] == marker) ||
                    (board[1][0] == marker && board[1][1] == marker && board[1][2] == marker && board[1][3] == marker) ||
                    (board[2][0] == marker && board[2][1] == marker && board[2][2] == marker && board[2][3] == marker) ||
                    (board[3][0] == marker && board[3][1] == marker && board[3][2] == marker && board[3][3] == marker);
        
        colWinner = (board[0][0] == marker && board[1][0] == marker && board[2][0] == marker && board[3][0] == marker) ||
                    (board[0][1] == marker && board[1][1] == marker && board[2][1] == marker && board[3][1] == marker) ||
                    (board[0][2] == marker && board[1][2] == marker && board[2][2] == marker && board[3][2] == marker) ||
                    (board[0][3] == marker && board[1][3] == marker && board[2][3] == marker && board[3][3] == marker);
        
        angleWinner = (board[0][0] == marker && board[1][1] == marker && board[2][2] == marker && board[3][3] == marker) ||
                      (board[3][0] == marker && board[2][1] == marker && board[1][2] == marker && board[0][3] == marker); 
        
        return rowWinner || colWinner || angleWinner;
    }
    
    public boolean Full() {
        int emptyCount = 0;
        for (int i=0;i<4;i++) {
            for (int j=0;j<4;j++) {
                if (this.board[i][j] == Marker.EMPTY) {
                    emptyCount++;
                }                    
            }
        }
        return (emptyCount==0);
    }
}
