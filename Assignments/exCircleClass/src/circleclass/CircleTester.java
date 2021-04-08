/*     File: CircleTester.java//	.	........
 *     Name: Marley, CSC110
 *     Date: 09/17/2015
 *  Purpose: Draw overlapping Blue and Red Cirlces
 */
package circleclass;

import graphics.*;

public class CircleTester 
{
    public static void main(String[] args) 
    {
        Circle c1, c2;
        
        c1 = new Circle();
        System.out.println(c1);
        
        c2 = new Circle(35, 35, 30);
        c2.setColor(Color.RED);
        System.out.println(c2);
        c2.draw();
        
        c1.draw();
        
        //TODO: Print the area of c1 & c2
        System.out.println("c1 area = " +  c1.area());
        System.out.println("c2 area = " +  c2.area());
    }//end main()

}
