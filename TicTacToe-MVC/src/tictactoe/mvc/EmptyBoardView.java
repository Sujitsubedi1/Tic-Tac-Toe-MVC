
package tictactoe.mvc;



public class EmptyBoardView {
    
       
   public  void EmptyBoard(int [] [] matrix){
         System.out.println("Printing Empty board");
      for( int i = 0; i < matrix.length; i++ ){
         for( int col = 0; col < matrix[i].length; col++ ){
             System.out.print(". ");         
         }
           System.out.println("");
   }
   }
}
