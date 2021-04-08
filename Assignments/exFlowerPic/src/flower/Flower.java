/*     File: Flower.java//	.	........
 *   Author: Austin Newton
 *     Date: 02/22/2021
 *  Purpose: Call methods, create objects
 */
package flower;
import graphics.*;
// When implementing the draw method, I recommend that you start with the top petal, 
// figure out its coordinates, instantiate a circle at that point with a diameter of 20, and call its draw method. 
//Then test. You can create a flower object in Bluej and invoke its draw method. Pick another of the circles; 
//calculate its coordinates; instantiate a circle at that location; and. Call its draw method. Now test again. 
//I believe you will find it much less intimidating to draw one little thing, get it right, and go to the next.
//You may want to use pencil and paper to do this. I did.

//Note: When drawing an Ellipse, you specify the x, y coordinates and the width and height of the rectangle 
//that would surround the ellipse. See the video "More about Graphics"

// Here is how you would draw a circle of diameter 20 when the surrounding rectangle has a x, y coordiantes or 30, 50
//      Ellipse circle = new Ellipse(30, 50, 20,20);
//      circle.draw();

// For the draft, provide a constructor that takes the x, y coordinates of the upper left-hand corner of a rectangle 
//that would surround the flower 
// Then in the draw method, draw the top-most petal in pink. The x,y coordiate of the top-most petal is the x, y instance variables 
//passed to the constructor.

public class Flower
{
  //your code here
    private int x;
    private int y;
    

   public Flower(int theX, int theY)
   {
         //your code here
       x = theX;
       y = theY;
   }

   public void draw()
   {
         //your code here
        final int DIAMETER = 20;
        int myX = x + 0;
        int myY = y + DIAMETER;
        Ellipse middle = new Ellipse(myX, myY, DIAMETER, DIAMETER);
        middle.setColor(Color.YELLOW);
        middle.fill();
        
        myX = x + 0;
        myY = y + (DIAMETER*2);
        Ellipse bottom = new Ellipse(myX, myY, DIAMETER, DIAMETER);
        bottom.setColor(Color.PINK);
        bottom.fill();
        
        myX = x - DIAMETER;
        myY = y + DIAMETER;
        Ellipse left = new Ellipse(myX, myY, DIAMETER, DIAMETER);
        left.setColor(Color.PINK);
        left.fill();
        
        myX = x + DIAMETER;
        myY = y + DIAMETER;
        Ellipse right = new Ellipse(myX, myY, DIAMETER, DIAMETER);
        right.setColor(Color.PINK);
        right.fill();
        
        myX = x + 0;
        myY = y + 0;
        Ellipse top = new Ellipse(myX, myY, DIAMETER, DIAMETER);
        top.setColor(Color.PINK);
        top.fill();
        
        myX = x + (DIAMETER/2);
        myY = y + (DIAMETER*3);
        Rectangle stem = new Rectangle(myX, myY, 1, (DIAMETER*3));
        stem.setColor(Color.GREEN);
        stem.fill();
        
   }
}
