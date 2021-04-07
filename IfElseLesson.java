/*//	.	........
 * Name: Kurt Marley, Java MW10
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelselesson;
import static java.lang.System.out;  //System. unneeded

public class IfElseLesson 
{
	//Echo()
    public static int echo(int val) {
        out.println("echo: " + val);
        return val;
    }

    public static void main(String[] args) 
    {
        //Variables
        int x, y, z;
        boolean found = false;
        
        // if OPTIONAL 
        x = 4;
        if(x == 4) {
            System.out.println("Optional");
        }
        
        if(x != 4){
            System.out.println("Will not print");
        }

            
        // if-else EITHER-OR
        y = 5;
        if(y == 5) {
            System.out.println("Y is 5");
        } else {
            System.out.println("Y is not 5");
        }
        
        

        
        // else if ONLY-ONE item is true
        z = 8;
        if(z == 7) {
            System.out.println("Only one z is 7");
        } else if(z == 8) { 
            System.out.println("Only one z is 8");
        } else {
            System.out.println("Only one z is 9;");
        }
        
        
        // else AMBIGUOUS and Braces {} (dangling else)
        x = 5; y = 5; z = 6;
        if(x == 4){
            if(y == 5) {
                z = 8;
            }
        } else {
            z = 9;
        }
        System.out.println("amigous z is " + z);
        
        //Indenting
        x = 4; 
        z = 9;
        
        if (x == 4) {
            y = 5;
            z = 8;
            System.out.println("Indenting: " + z);
        }

        
        // && AND, || OR, ! NOT
        x = 4;
        y = 5;
        z = 9;
        
        if(x == 4 && y == 5){
            System.out.println("x is 4, and y is 5");
        }
        if(x == 4 || y == 6){
            System.out.println("x is 4 or y is 6");
        }
        
        //Short-circuit
        x = 4;
        y = 5;
        if(echo(x) == 4 || echo(y) == 5) {
            System.out.println("Short Circuit OR");
        }
        if(echo(x) != 4 && echo(y) == 5){
            System.out.println("Short Circuit AND");
        }
        // Strings
        String test = "gauchos";
        if (test.equals("gauchos") ) {
            System.out.println("Strings equal");
        } else {
            System.out.println("Strings not equal");
        }
        

        
        //Triary IF
        x = 4; 
        y = 5;
        test = "";
        test = (x == 5) ? "yes" : "no";
        System.out.println("Triary: " + test);
        
        
        
        // Switch -- ONLY ONE (like else if)
        x = 4; 
        y = 5;
        switch(x) {
            case 4: System.out.println("case: 4"); break;
            case 5: System.out.println("case: 5"); break;
            default: System.out.println("case: none of the above");
                    
        }//end switch
        
        
        

        
    }//end main()

}
