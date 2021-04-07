/*       File: Program3.java	.	........
 *      Class: CSC110AB
 * Programmer: Austin Newton
 *    Purpose: ???
 */
package mathloops3;

import java.util.*;

public class Program3
{   

    public static void main(String args[])
    {
        
        
        
        
        
        
        
        
        
        
        
        
        
        //CONSTANTS & VARIABLES
        Scanner kb = new Scanner (System.in);
        final int powerFive = 5;
        final int randomT = 20;
        int number;
        int menu = 0;
        double half = 0;
        int factorial = 1;
        
        
        
        //Input
        System.out.println("Please enter a non-negative integer:");
        number = kb.nextInt();
        while (number < 0) {
            System.out.println("Number cannot be negative! Please enter a non-negative integer:");
            number = kb.nextInt();
        }
        
        
        //Calculations
        half = (double) number / 2; 
        
        
        //menu loop
        do {
            System.out.println(" Please choose an option");
            System.out.println("\t0  Print the number");
            System.out.println("\t1  Determine if the number is odd or even");
            System.out.println("\t2  Find half of the number");
            System.out.println("\t3  Find the reciprocal of the number");
            System.out.println("\t4  Raise the number to the power of 5 (using a Java method)");
            System.out.println("\t5  Raise the number to the power of 5 (using a loop)");
            System.out.println("\t6  Generate 20 random numbers between 0 and the number (inclusive)");
            System.out.println("\t7  Find the sum of 0 up to your number (using a loop)");
            System.out.println("\t8  Find the factorial of the number (using a loop)");
            System.out.println("\t9  Find the square root of the number (using a Java method)");
            System.out.println("\t10 Find the square root of the number (using a loop, Extra Credit)");
            System.out.println("\t11 Determine whether the number is prime (using a loop, Extra Credit)"); 
            System.out.println("\t12 Exit the program");
            
            
            menu = kb.nextInt();
            
            if (menu < 0 || menu > 12) {
            System.out.print("\n");
            System.out.println("Illegal choice, try again: ");
            System.out.print("\n");
            System.out.println(" Please choose an option");
            System.out.println("\t0  Print the number");
            System.out.println("\t1  Determine if the number is odd or even");
            System.out.println("\t2  Find half of the number");
            System.out.println("\t3  Find the reciprocal of the number");
            System.out.println("\t4  Raise the number to the power of 5 (using a Java method)");
            System.out.println("\t5  Raise the number to the power of 5 (using a loop)");
            System.out.println("\t6  Generate 20 random numbers between 0 and the number (inclusive)");
            System.out.println("\t7  Find the sum of 0 up to your number (using a loop)");
            System.out.println("\t8  Find the factorial of the number (using a loop)");
            System.out.println("\t9  Find the square root of the number (using a Java method)");
            System.out.println("\t10 Find the square root of the number (using a loop, Extra Credit)");
            System.out.println("\t11 Determine whether the number is prime (using a loop, Extra Credit)"); 
            System.out.println("\t12 Exit the program");
            
            
            menu = kb.nextInt();
            
            }
            
            
            
            
            //0--12 menu code: use switch or if-else-if (only one)
            switch(menu) {
                case 0:
                    System.out.print("\n");
                    System.out.println("Your number is: " + number);
                    System.out.print("\n");
                    break;
                
                case 1: 
                    System.out.print("\n");
                    if (number % 2 == 0) {
                        System.out.println(number + " is even");
                        System.out.print("\n");
                        break;
                    } else {
                        System.out.println(number + " is odd");
                        System.out.print("\n");
                        break;
                    }
                
                case 2:
                    System.out.print("\n");
                    System.out.println("Half of " + number + " is " + half);
                    System.out.print("\n");
                    break;
                    
                case 3:
                    System.out.print("\n");
                    System.out.println("The reciprocal of " + number + " is" + " 1/" + number);
                    System.out.print("\n");
                    break;
                    
                case 4:
                    System.out.print("\n");
                    System.out.println(number + " to the power of 5 is " + Math.pow(number, powerFive) + " (Method)");
                    System.out.print("\n");
                    break;
                    
                case 5:
                    System.out.print("\n");
                    int newNumber = number;
                    for (int x = 1; x < powerFive; x++) {
                         newNumber = newNumber * number;
                    }
                    System.out.println(number + " to the power of 5 is " + newNumber);
                    System.out.print("\n");
                    break;
                    
                case 6: 
                    System.out.print("\n");
                    System.out.println("Generating 20 random numbers between 0 and " + number + " (Inclusive)");
                    Random rand = new Random();
                    for (int x = 1; x <= randomT; x++) {
                        System.out.println(rand.nextInt(number+1));
                    }
                    System.out.print("\n");
                    break;
                    
                case 7:
                    System.out.print("\n");
                    int count = 0;
                    for (int i = 0; i <= number; i++) {
                        count = count + i;
                    }
                    
                    System.out.println("The sum of 0 to " + number + " is " + count);
                    System.out.print("\n");
                    break;
                
                case 8:
                    System.out.print("\n");
                    for (int x = 1; x <= number; x++) {
                           factorial = factorial * x;
                    }
                    System.out.println("The facorial of " + number + " is " + factorial);
                    System.out.print("\n");
                    break;
                    
                case 9:
                    System.out.print("\n");
                    System.out.println("The squareroot of " + number + " is " + Math.sqrt(number) + " (Method)");
                    System.out.print("\n");
                    break;
                
                case 10:
                    System.out.print("\n");
                    System.out.println("This feature is out of order!");
                    System.out.print("\n");
                    break;
                    
                case 11: 
                    System.out.print("\n");
                    System.out.println("This feature is out of order!");
                    System.out.print("\n");
                    break;
                    
                case 12:
                    System.out.println("See ya later!");
                    break;
                    
                    
                    
                    
                    
            }       
            
                    
            
            
        } while (menu != 12);
        
        
        
        
        

    } //end main
  
    
    
    
        
}