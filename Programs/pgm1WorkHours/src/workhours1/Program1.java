/*       File: Program1.java	.	........
 *      Class: CSC 110AB
 * Programmer: Austin Newton
 *    Purpose: This program gives employees/employers the ability to enter an employee name and the hours worked the last 4 weeks,
 *             the Program will return the total hours worked, average hours per week, and the full time equivalent of the hours worked. 
 */
package workhours1;

import java.util.*;

public class Program1
{
	public static void main(String[ ] args)
	{
            
            
            //Variables - declaring variables needed for input and calculations.
            Scanner kb = new java.util.Scanner(System.in);
            String employeeName;
            int week1;
            int week2;
            int week3;
            int week4;
            
            int week = 0;
            int day = 0;
            int hour = 0;
            int remainder = 0;
            
            //Input - declaring values to variables. 
            System.out.println("Please enter name: ");
            
            employeeName = kb.nextLine();
            
            System.out.println("\nPlease enter the last 4 week's hours worked(integers): ");
            
            week1 = kb.nextInt();
            week2 = kb.nextInt();
            week3 = kb.nextInt();
            week4 = kb.nextInt();
            
            
            //Calculations - calculating total hours worked, average hours per week, and the full time equivalent for the total hours.
            int totalHours = week1 + week2 + week3 + week4;
            double averagePerWeek = (double) totalHours / 4;
            remainder = totalHours;
            week = remainder / 40;
            remainder = remainder % 40;
            day = remainder / 8;
            remainder = remainder % 8;
            hour = remainder / 1; 
            
            
            //Skip 2 Lines - skipping lines for readability.
            System.out.println("");
            System.out.println("");
            
            
            //Output - printing employee name, total hours worked, average hours per week, and full time equivalent.
            System.out.println(employeeName);
            System.out.println("\t Total Hours Worked: " + totalHours);
            System.out.println("\t Average hours per week: " + averagePerWeek );
            System.out.println("\t Full time equivalent:");
            System.out.println("\t \t" + week + " weeks");
            System.out.println("\t \t" + day + " days");
            System.out.println("\t \t" + hour + " hours");
            
            
            
            
            
            
	}
}