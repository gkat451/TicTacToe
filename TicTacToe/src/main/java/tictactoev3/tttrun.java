
package tictactoev3;

import java.util.Scanner;
import tictactoe.Board;
import tictactoe.Marker;

/**
 *k1719859
 * @author k1748796
 
 */
public class tttrun {
    
        public static void main(String[] args) {
        Board b = new Board(); 
        int row, col;
        boolean winner = false;
        Scanner input = new Scanner(System.in);
        Marker currentPlayer = Marker.X;
        System.out.printf("Let's Play Tic-Tac-Toe!!!\n\n");
        System.out.printf("Press 0 or 1 or 2 or 3 to place and hit enter!!!\n\n");
        while(true) {

         
            b.Draw();
            
           
            System.out.printf("%s's turn! Enter Row : ",currentPlayer);
            row = input.nextInt();
            System.out.printf("%s's turn! Enter Column : ",currentPlayer);
            col = input.nextInt(); 
            
            
            b.Place(currentPlayer,col,row);
            
            
           
            
            
            winner = b.Winner(currentPlayer); 
            
            
            if (winner || b.Full()) break;
            
          
            currentPlayer = currentPlayer == Marker.X ? Marker.O : Marker.X;
        }
        
        b.Draw();
        
        if (winner) {            
            System.out.printf("GAME OVER. %s WINS!\n", currentPlayer);
        } else {
            System.out.printf("GAME OVER. It's a TIE!\n");
        }

        
    }
    
}
