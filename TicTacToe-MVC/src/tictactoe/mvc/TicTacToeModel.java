
package tictactoe.mvc;


public class TicTacToeModel {
     
      static int [][] board ;
      static boolean hasWon;
      
      public void setboard(int [][] board){
          this.board=board;
      }
      public int [][] getboard(){
          return board;
      }
      
      public boolean getwin(){
          return hasWon;
      }
      
      public void setwin(boolean hasWon){
          this.hasWon= hasWon;
      }
}
