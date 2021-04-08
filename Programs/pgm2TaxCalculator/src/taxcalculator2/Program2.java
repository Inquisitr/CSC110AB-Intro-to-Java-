/*       File: Program2.java	.	........
 *      Class: CSC110AB
 * Programmer: Austin Newton
 *    Purpose: Tax Calculator
      
      This simple tax calculator will allow the user to input their total income ( salary, commisions, and bonuses), 
      their number of dependents, and the state they reside in.  The program will calculate the user's total income, 
      amount of dependents, the amount of taxes they have paid, and thier per capita income. 


 */
package taxcalculator2;
import java.text.NumberFormat;
import java.util.*;

public class Program2 
{

    public static void main(String[] args) 
    {
        
        //Constants
        final double ALLOWANCE = 1000.000; // per dependent
        final double TAXAZ = 0.06;
        final double TAXFLIO = 0.04;
        final double TAXCA = 0.08;
        final double TAXHINV = 0.07;
        
        //End of Constants
        
        //Variables
        Scanner kb = new Scanner(System.in);
        
        double salary = 0;
        double commission = 0;
        double bonus = 0;
        double totalIncome = 0;
        double adjustedIncome;
        double taxRate = 0;
        double perCapitaIncome = 0;
        
        String name;
        String A = "\t A \t Arizona";
        String B = "\t B \t California";
        String C = "\t C \t Florida";
        String D = "\t D \t Hawaii";
        String E = "\t E \t Iowa";
        String F = "\t F \t Nevada";              
        Character littleA = 'a';        
        Character littleB = 'b';
        Character littleC = 'c';
        Character littleD = 'd';
        Character littleE = 'e';
        Character littleF = 'f';
        char stateChosen;
        
        int dependent = 0;

        //End of Variables
        
        //Inputs
        System.out.println("Please input your name: ");
        name = kb.nextLine();
        System.out.println("");
        System.out.println("Please input salary, commission, and bonus (no commas) :");
        salary = kb.nextDouble();
        System.out.println("");
        commission = kb.nextDouble();
        bonus = kb.nextDouble();
        System.out.println("");
        System.out.println("Please input number of dependents (including yourself):");
        dependent = kb.nextInt();
        System.out.println("");
        
        //End of Inputs
        
        
        //Menu
        System.out.println("Please choose which state you are from (by letter):");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);
        stateChosen = kb.next().charAt(0);
        
        if (stateChosen == A.charAt(2) || stateChosen == littleA) { 
            System.out.print("");
        } else if (stateChosen == B.charAt(2) || stateChosen == littleB ) {
            System.out.print("");
        } else if (stateChosen == C.charAt(2) || stateChosen == littleC) {
            System.out.print("");
        } else if (stateChosen == D.charAt(2) || stateChosen == littleD) {
            System.out.print("");
        } else if (stateChosen == E.charAt(2) || stateChosen == littleE) {
            System.out.print("");
        } else if (stateChosen == F.charAt(2) || stateChosen == littleF) {
            System.out.print("");
        } else {
            System.out.println("Illegal letter for state");
            return;
        }
        
        //End of Menu
        
        //Calculations
        totalIncome = salary + commission + bonus;
        
        perCapitaIncome = totalIncome / dependent;
        
        
        adjustedIncome = totalIncome - (ALLOWANCE * dependent);
        if (adjustedIncome < 0) {
            adjustedIncome = 0;
        }
        
        
        
        if (stateChosen == A.charAt(2) || stateChosen == littleA) {
            taxRate = adjustedIncome * TAXAZ;
        } else if (stateChosen == B.charAt(2) || stateChosen == littleB) {
            taxRate = adjustedIncome * TAXCA;
        } else if (stateChosen == C.charAt(2) || stateChosen == littleC) {
            taxRate = adjustedIncome * TAXFLIO;
        } else if (stateChosen == D.charAt(2) || stateChosen == littleD) {
            taxRate = adjustedIncome * TAXHINV;
        } else if (stateChosen == E.charAt(2) || stateChosen == littleE) {
            taxRate = adjustedIncome * TAXFLIO;
        } else if (stateChosen == F.charAt(2) || stateChosen == littleF) {
            taxRate = adjustedIncome * TAXHINV;
        }
        
        
        //End of Calculations
        
        
        
        
        //Output
        System.out.print("\n");
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        System.out.println(name);
        System.out.println("\t Total Income: \t \t" + money.format(totalIncome));
        System.out.println("\t Dependents: \t \t" + dependent);
        System.out.println("\t Adjusted income: \t" + money.format(adjustedIncome));
        System.out.println("\t Tax: \t \t \t" + money.format(taxRate));
        
        if (dependent != 0) {
        System.out.println("\t Per Capita income: \t" + money.format(perCapitaIncome));
        } else if (dependent == 0) {
            System.out.println("\t Per Capita income: ");
            return;
        }
    }
    
}
