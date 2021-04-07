/* Name: Austin Newton	.	........
 * Date: 02/04/21
 * Purpose: Use input/output, arithmetic operations
 */
package ioarithop;
import java.util.Scanner;
public class MinilabIOArithOp 
{

    public static void main(String[] args) 
    {
        Scanner kb = new java.util.Scanner(System.in);  //you do it

        System.out.print("\nWhat is the name of the person having the party? ");
        
        String name = kb.nextLine();
        
        System.out.print("\nHow old are they now? ");
        
        int age = kb.nextInt();
        
        System.out.print("\nHow many guests are invited? ");
        
        int guests = kb.nextInt();
        
        System.out.print("\nHow many brownies are ordered? ");
        
        int totalBrownies = kb.nextInt();
        
        System.out.print("\nHow much is each brownie? ");
        
        double browniePrice = kb.nextDouble();
        
        System.out.print("\nHow many balloons are ordered? ");
        
        int balloons = kb.nextInt();
         
        
        //Calculations
        double totalCost = totalBrownies * browniePrice;
        double browniePerGuest = (double) totalBrownies / guests;
        int balloonPerGuest = balloons / guests;
        int balloonsLeft = balloons - (balloonPerGuest * guests);

        //Display output
        System.out.print("\n");
        System.out.print("\n");
        //skip 2 lines
        
        System.out.println("The party is for " + name);
        //
        System.out.println(name + " will turn " + (age + 1));
        //
        System.out.println(name + " is now " + age);
        //
        System.out.println("The TOTAL cost of the brownies is: " + totalCost);
        //
        System.out.println("The number of guests is: " + guests);
        //
        System.out.println("Number of brownies per guest is: " + browniePerGuest );
        //
        System.out.println("Number of balloons per guest is: " + balloonPerGuest);
        //
        System.out.println("Number of balloons left over is: " + balloonsLeft);
    }//end main()

}