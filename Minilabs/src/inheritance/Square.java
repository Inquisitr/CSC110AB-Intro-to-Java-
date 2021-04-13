/* Name: Austin Newton	.	........
 * Date: 04/05/21
 * Purpose: Use inheritance
 */
package inheritance;

//This class defines a geometric square

public class Square extends Rectangle
{

    // NO DATA!
    
    // CONSTRUCTOR: Be sure 
    public Square(double side) {
        // be sure that length == width
        length = side;
        width = side;
        
        
    }
    
    @Override
    public String toString()
    {
	return "I am a Square with sides = " + width;
    }
    
    
    
    
}
