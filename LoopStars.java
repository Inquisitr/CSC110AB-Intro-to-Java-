/*    File: exLoopStars.java//	.	........
 *    Name: *****************
 *    Date: mm/dd/yyyy
 * Purpose: Print a pattern of stars
 */
package loopstars;
import java.util.Scanner;
import static java.lang.System.out;

public class LoopStars 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        //While
        out.println("\nWHILE validation");
        int k = 0;
        while( k < 4) {
            System.out.println(k);
            k = k + 1;
        }
        
        System.out.print("Enter a positive int > 0: ");
        k = kb.nextInt();
        while(k <= 0) {
            System.out.print("No, greater than zero: ");
            k = kb.nextInt();
        }
        
        //do-while
        out.println("\nDO-WHILE");
        int z = 3;
        do{
            System.out.println(z);
            z--;
        } while (z > 0);
        
        //Never runs
        out.println("\nNEVER RUNS");
        for (int x = 0; x<0; x++) {
            System.out.println(x);
        }

        
        //Count up
        out.println("\nCOUNT UP");
        for(int x = 0; x<10; x++) {
            System.out.print(x + " "); 
        }
        
        //Count down
        out.println("\nCOUNT DOWN");
        for (int x = 10; x > 0; x--) {
            System.out.print(x + ", ");
        }

        //Count even
        out.println("\nCOUNT EVEN");
        for (int x = 0; x <= 10; x++) {
            if(x % 2 == 0) {
                System.out.print(x + ", ");
            }
        }
        
        
        
        //Please go over the last 2 parts in class, I am having a hard time getting the expected output on the final task.
        
        
        /* PART I: Generate the following pattern of stars, printing one "*" at a time
           *
           **
           ***
           ****
           *****
           ****
           ***
           **
           *
        */
        System.out.println("\nPART I");
        //TODO: code goes here
        for ( int rows = 1; rows <= 5; rows++) {
            for (int stars = 0; stars < rows; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int rows2 = 4; rows2 > 0; rows2--) {
            for (int stars2 = 0; stars2 < rows2; stars2++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        
        /* PART II: Generate the following pattern of stars, printing one "*"
                    or blank " " at a time
           ***** *****
           ****   ****
           ***     ***
           **       **
           *         *
           *         *
           **       **
           ***     ***
           ****   ****
           ***** *****
        */
        System.out.println("\nPART II");
        final int LEN=11;
        //TODO: code goes here
        for (int rows = 5; rows > 1; rows--) {
            int blk = LEN - 2*rows;
            for (int s=1; s<=rows; s++) out.print("*");
            for (int b=1; b<=blk; b++) out.print(" ");
            for (int s=1; s<=rows; s++) out.print("*");
        }
        
        for (int rows = 1; rows <= 5; rows++) {
            int blk = LEN - 2*rows;
            
            for(int s=1; s<=rows; s++) out.print("*");
            for (int b=1; b<=blk; b++) out.print(" ");
            for (int s=1; s<= rows; s++) out.print("*");
            out.println(); 
        }
        

        //Please go over the last 2 parts in class, I am having a hard time getting the expected output on the final task.
        
    }//end main()

}
