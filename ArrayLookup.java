/*    File: ArrayLookup.java//	.	........
 *    Name: Kurt Marley
 *    Date: Oct 3, 2015
 * Purpose: Use of Arrays for lookup
 */
package arraylookup;
import java.util.Scanner;

public class ArrayLookup 
{
    public static void main(String[] args) 
    {
        final int SIZE = 12;
        int[] daysPerMonth = new int[SIZE]; //Lookup Array
        Scanner kb = new Scanner(System.in);
        
        //CommaSeparatedValues     J  F  M  A  M  J  J  A  S  O  N  D
        String csvDaysPerMonth = "31,29,31,30,31,30,31,31,30,31,30,31";

        //Load Lookup Array from the string
        //TODO...
        Scanner csv = new Scanner(csvDaysPerMonth);
        csv.useDelimiter(",");
        for(int i = 0; i < daysPerMonth.length; i++) {
            daysPerMonth[i] = csv.nextInt();
        }
        
        //Lookup loop
        int month;
        do
        {
            System.out.println("\nEnter month#0-11 (negative to quit): ");
            month = kb.nextInt();
            if(month >= 0 && month <= 11)
                System.out.println("\t\t" + daysPerMonth[month] + " days");
        }
        while(month >= 0);       

    }//end main()

}
