/* Name: Austin Newton	.	........
 * Date: 02/10/21
 * Purpose: Use loops
 */
package loop;

import java.util.*;

public class MinilabLoopLogic
{
	public static void main(String[ ] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Please; enter 2 integers (separated by spaces): ");
                int int1 = kb.nextInt();
                int int2 = kb.nextInt();
                
                
		System.out.println("\n\nThis program will generate numbers BETWEEN ");
		System.out.println( int1 + " and " + int2 + " that are divisible by a certain number.");
                
                

		System.out.print("\nPlease enter the integer your output should be divisible by: ");
                
                
                int divider = kb.nextInt();
                while (divider <= 0) {
                    System.out.println("The dividing number cannot be 0, enter a new number:");
                    divider = kb.nextInt();
                }
                
                if (int1 < int2) {
                
                    for (int x = divider; x < int2; x = x + divider) {
                    
                        if (x > int1 && x < int2) {
                            System.out.println(x);
                        }
                    
                    } 
                
                } else {
                    
                    for (int x = int1; x > int2; x = x - divider) {
                        
                        if (x > int2 && x < int1) {
                            System.out.println(x);
                        }
                    }
                    
                }
                        
                        
                
                
                
                
                
                
		System.out.println("\n\n----------------------------------------");
                
                //Output
                //TODO: print numbers
	}
}

