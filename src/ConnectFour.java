public class ConnectFour {
    private String token1="R";
    private String token2="B";
    private boolean switchTurn=false;
    private Board board;
    private String winningColour;

    public ConnectFour(Board board){
        this.board = board;
    }
    public void playGame(HumanPlayer player1, HumanPlayer player2){
        board.reset();
        board.printBoard();

       while (!board.checkForwin()){

        if (switchTurn){
            board.updateBoard(player1.playerMove(), token1);
            switchTurn = false;
            board.printBoard();
           }
        else{
            board.updateBoard(player2.playerMove(), token2);
            switchTurn = true;
            board.printBoard();
        }
       }
       winningColour = switchTurn ? token2 : token1;
       System.out.println("End of game, player in "+winningColour+" has won!");

    }
}
