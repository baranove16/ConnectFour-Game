import java.util.Scanner;

public class HumanPlayer {
    private int row;

    protected int playerMove(){
        Scanner move = new Scanner(System.in);
        System.out.println("Enter move (0-6):");

        row = 2*move.nextInt()+1;

        return row;

    }
}
