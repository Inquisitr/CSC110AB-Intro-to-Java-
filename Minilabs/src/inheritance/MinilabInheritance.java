/* Name: Austin Newton	.	........
 * Date: 04/12/2021
 * Purpose: Use inheritance
 */
package inheritance;

//	MinilabInheritance: "Squares are subclasses of Rectangles"

public class MinilabInheritance
{
    public static void main(String[] args)
    {

        // 1.  As you do the steps, but sure to fill in the <your answer here> parts...
        //		Also, be sure to do them IN ORDER.

        // 2.	There is a class called Rectangle for this Minilab. It defines  
        //              a geometric rectangle - open it and
        //		look at it to see if it makes sense.

        // 3.	Now that you have a Rectangle class
        //		to work with, the following 3 statements should work.
        //              Run the MinilabInheritance program and check the results.

            System.out.println("\n---------- Part 3 results\n");

            //create a Rectangle
            Rectangle myRectangle = new Rectangle(8, 3);

            //print it
            System.out.println(myRectangle);
            System.out.println(myRectangle.toString());

            //print what it tells you its area is
            System.out.println("The area is " + myRectangle.getArea());

        // 4.	Go back to the Rectangle class and change it so that its data can be INHERITED
        //		by subclasses (but still cannot be seen or changed from another class).

        // 5.	There is a class called Square for this Minilab.  It will basically be a blank class.
        //		Change it so that it is a SUBCLASS of Rectangle.
        //		(Do not give it ANY data - it should be able to inherit from its parent class.)

        // 6.	Write a constructor for your Square class.  The constructor should receive a
        //		SINGLE double which will be the length of each side.   Since it has (inherited) data
        //		of length and width, set the length AND the width to what is passed in
        //		(or... it can call the superclass's constructor with the single int that it has)

        // 7.	Uncomment the following 2 statements, recompile, and run this program.
        //		Then finish the Question in the S.O.P. below, and run again.

            System.out.println("\n---------- Part 7 results\n");

            Square mySquare = new Square(8);
            System.out.println(mySquare);

            System.out.println("\nmySquare prints like a Rectangle because:");
            System.out.println("Square extends rectangle.");

        // 8.	Now go to your Square class and "override" the inherited toString() method by
        //		writing a specific toString() method for Square.   Have it return
        //		       "I am a Square with sides = <either the length or the width here>"

                        
        // 9.	Uncomment the following 2 statements, and run this program.
        //		Then finish the Question in the S.O.P. below, and run again.

            System.out.println("\n---------- Part 9 results\n");

            mySquare = new Square(8);
            System.out.println(mySquare);

            System.out.println("\n.calling System.out.println with mySquare now gives a different result because:");
            System.out.println("the method toString is overridden in the Square class.");

        // 10.Uncomment the following statement.  Then run.
        //		Then finish the Question in the S.O.P. below, and run again.

            System.out.println("\n---------- Part 10 results\n");

            System.out.println("The area is: " + mySquare.getArea());
            System.out.println("\nmySquare does not have a .getArea(), yet this works because:");
            System.out.println("the Square class inherits the getArea() method.");

        // 11.Be SURE that you have filled in the <your answer here> parts (like directly above).
        //		Also, be sure that you understand the results - basically, Square is a special case
        //		of Rectangle so it can be a subclass.  This allows it to inherit data/methods as well
        //		as have its own.
        //
        //		Submit your zipped mlInheritance project via Canvas.

    }
}