public class Board{
  
    private final int numberOfrows = 7;
    private final int numberOfcolumns = 15;
    String[][] board = new String[numberOfrows][numberOfcolumns];

    public Board(){  
        this.board = display();
    }

    private String[][] display(){

         for (int i = 0;i < board.length; i++)
         {    for (int j = 0;j< board[i].length;j++)
            {
          if (j% 2 == 0) board[i][j] ="|";
          else board[i][j] = " ";
          if (i == 6) board[i][j]= "-";
         }
      
        }
        return board;
       
    }
    public void printBoard(){
        for (int i = 0;i < board.length; i++)
        {
          for (int j = 0;j< board[i].length; j++)
          {
            System.out.print(board[i][j]);
          }
          System.out.println();
        }
    }
    
    public void updateBoard(int move, String token){
        for (int i = 5; i >= 0; i--){
            if (board[i][move].equals(" ")){
                board[i][move]=token;
                break;
            }
        }
    }
    public void reset()
	{
		this.board = display();
		return;
	}
    public boolean checkForwin(){
        //horizontal check
        for (int i = 0; i < numberOfrows-1; i++){
            for (int y = 0; y < numberOfrows; y+=2){
                if (!" ".equals(board[i][y+1]) && board[i][y+1].equals(board[i][y+3]) &&
                board[i][y+3].equals(board[i][y+5]) &&
                board[i][y+5].equals(board[i][y+7])){

                    return true;}
            }
        }
        //vertical check
        for (int i = 1; i < numberOfcolumns-3; i+=2){
            for (int y = 0; y < numberOfrows-4; y++){
                if (!" ".equals(board[y][i]) && board[y][i].equals(board[y+1][i]) && 
                board[y+1][i].equals(board[y+2][i]) &&
                board[y+2][i].equals(board[y+3][i])){
                    
                    return true;}
                
            }
        }
        //ascending diagonal check
        for (int i = 0; i < numberOfrows-4; i++){
            for (int y = 7; y < numberOfrows; y+=2 ){
                if (!" ".equals(board[i][y]) && board[i][y].equals(board[i+1][y-2]) &&
                board[i+1][y-2].equals(board[i+2][y-4]) &&
                board[i+2][y-4].equals(board[i+3][y-6])){
                   
                    return true;}
            }
        }
        //descending diagonal check
        for (int i = 0; i < numberOfrows-4; i++){
            for (int y = 1; y < numberOfcolumns-6; y+=2){
                if (!" ".equals(board[i][y]) && board[i][y].equals(board[i+1][y+2]) &&
                board[i+1][y+2].equals(board[i+2][y+4]) &&
                board[i+2][y+4].equals(board[i+3][y+6])){
                   
                    return true;}
            }
        }
        return false;
    }
}