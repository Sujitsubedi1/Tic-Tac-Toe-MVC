
package tictactoe.mvc;



import java.util.Scanner;
public class InputOutputView {
    
    Scanner input = new Scanner(System.in);
    
     public void InputOutputX(int [][] board){
         int X =1;
         boolean empty= true;
         
         while(empty){
         System.out.print("X, enter row: ");
          int row = input.nextInt();
          
          if (row>=5 || row <=-1){
          System.out.println("The value is out of range. Please select row value between 0 - 4.");
          }
          else{
         System.out.print("X, enter column: ");
        int col = input.nextInt();
         if (col>=5 || col <=-1){
          System.out.println("The value is out of range. Please select col value between 0 - 4.");
          }
         else{
         if( board[row][col] != 0 ){
            System.out.println("That place already has a value. Choose new Spot.");
         }else{
             empty=false;
             board[row][col]= X;
         }
         }
         }
         }

     }    
         
      
         public void InputOutputO(int [][] board){
             int O =-1;
         boolean empty1 = true;
      while(empty1){
         System.out.print("O, enter row: ");
         int row = input.nextInt();
          if (row>=5 || row <=-1){
          System.out.println("The value is out of range. Please select row value between 0 - 4.");
          }
          else{
         System.out.print("O, enter column: ");
        int col = input.nextInt();
         if (col>=5 || col <=-1){
          System.out.println("The value is out of range. Please select col value between 0 - 4.");
          }
         else{
         if( board[row][col] != 0 ){
            System.out.println("That place already has a value. Choose new Spot.");
         }else{
             empty1=false;
             board[row][col]= O;
         }
         }
         }
         }
         
    
         }
}
      
      
   


