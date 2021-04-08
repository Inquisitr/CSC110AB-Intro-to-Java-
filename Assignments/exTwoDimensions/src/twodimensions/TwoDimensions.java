package twodimensions;//	.	........

public class TwoDimensions 
{
    public static void main(String[] args) 
    { 

        //   X |   | O 
        //  ---+---+---
        //   O | O |
        //  ---+---+---
        //   X |   | X
        
        int row = 0, col = 0, SIZE =3;
        String[][] board = {
                               { " X ", "   ", " O " },
                               { " O ", " O ", "   ", " ? " },
                               { " X ", "   ", " X " }
                           };
        
        //TODO: PRINT OUT THE ABOVE TABLE WITH LOOPS
        
        for(row = 0; row < board.length; row++) {
            
            if (row != 0) System.out.println("---+---+---");
            
            
            for (col = 0; col < board[row].length; col++) {
                if (col != 0) System.out.print("|");
                System.out.print(board[row][col]);
            }
                
            System.out.println("");
        }
        

    }//end main()

}
