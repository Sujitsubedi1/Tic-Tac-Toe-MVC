
package tictactoe.mvc;

public class TicTacToeMain {
    public static void main(String[] args) {
     TicTacToeModel model = retrieve();
        EmptyBoardView view = new EmptyBoardView();
        CheckWinView view1 = new CheckWinView();
        InputOutputView view2 = new InputOutputView();
        PrintboardView print = new PrintboardView();
        TicTacToeController controller = new TicTacToeController(model , view, view1, view2, print);
       controller.updateEmptyview();
       controller.CheckWin();
      controller.game();
      System.out.println("Game Over");
       
    }
    private static TicTacToeModel retrieve(){
         TicTacToeModel models = new TicTacToeModel();
        int [][] abc = new int[5][5];
        models.setboard(abc);
        return models;
    }
}
