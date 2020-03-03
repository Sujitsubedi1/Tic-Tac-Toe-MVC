
package tictactoe.mvc;

public class TicTacToeController {
    TicTacToeModel model;
    EmptyBoardView view;
    CheckWinView view1;
    InputOutputView view2;
    PrintboardView print;
    
    public TicTacToeController(TicTacToeModel model, EmptyBoardView view, CheckWinView view1, InputOutputView view2, PrintboardView print){
    this.model = model;
    this.view= view;
    this.view1= view1;
    this.view2= view2;
    this.print = print;
    }
    
    public void updateEmptyview(){
     view.EmptyBoard(model.getboard());
    }
    
    public void CheckWin(){
       boolean abc= view1.hasWon(model.getboard());
         model.setwin(abc);
         
    }
    
    public void Xinput(){
        view2.InputOutputX(model.getboard());
    }
    
    public void printBoards(){
        print.printBoard(model.getboard());
    }
    
    public void Oinput(){
        view2.InputOutputO(model.getboard());
    }
    
    public void game(){
        while(model.getwin()== false){
          Xinput();
          printBoards();
         System.out.println(" ");
         CheckWin();
                  if( model.getwin() == true )
           break;
                  Oinput();
            printBoards();
              CheckWin();
                  if( model.getwin() == true )
           break;
           
      }
    }
}
