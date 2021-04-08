/*    File: Money.java//	.	........
 *  Author: Austin Newton
 *    Date: 02/10/2021
 * Purpose: Use modulus %
 */

package money;

import java.util.Scanner;

public class Money 
{

    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        int twenty=0, ten=0, five=0, one=0, quarter=0, dime=0, nickel=0, penny=0;
        double remainder=0;
        
        System.out.print("Enter amount of cash:(56.83) ");
        double cash = kb.nextDouble();
        remainder = cash;

        //twenty
        twenty = (int) remainder / 20;
        remainder = remainder % 20;
        
        //ten
        ten = (int) remainder / 10;
        remainder = remainder % 10;
        
        //five
        five = (int) remainder / 5;
        remainder = remainder % 5;
        
        //one
        one = (int) remainder / 1;
        remainder = remainder % 1;
        
        //quarter
        quarter = (int) (remainder / 0.25);
        remainder = remainder % 0.25;
        
        //dime
        dime = (int) (remainder / 0.10);
        remainder = remainder % 0.10;
        
        //nickel
        nickel = (int) (remainder / 0.05);
        remainder = remainder % 0.05;
        
        //penny
        penny = (int) ((remainder + 0.005) / 0.01);
        remainder = remainder % 0.01;
        
        System.out.println(
               "\nTwenty  \t" + twenty +
               "\nTen     \t" + ten +
               "\nFive    \t" + five +
               "\nOne     \t" + one +
               "\nQuarter \t" + quarter +
               "\nDime    \t" + dime +
               "\nNickel  \t" + nickel +
               "\nPenny   \t" + penny
        );        

    }//end main()

}//end class
