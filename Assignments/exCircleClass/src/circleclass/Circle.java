/*     File: Circle.java//	.	........
 *     Name: Austin Newton, Course CSC110 TIME
 *     Date: 03/07/2021
 *  Purpose: Learn to create a class
 */
package circleclass;

//import graphics

import graphics.*; 
        
public class Circle 
{
    //Data
    private double x;
    private double y; //center (x,y)
    private double diameter;
    private Color color;
    
    //Constructors
    
    
    public Circle() //default Circle constructor: 30, 30, 20, BLUE
    {
    //    x = 20;
    //    y = 30;
    //   diameter = 20;
    //    color = Color.BLUE;
        this(30,30,20);
    }

    //Constructor with x, y, diameter
    public Circle(double x, double _y, double d) {
        this.x = x;
        y = _y;
        diameter = d;
        color = Color.BLUE;
    }

    
    //Accessors for x, y, diameter, color
    //TODO: Finish getDiameter() & getColor()
    public double getX() {return x; }
    public double getY() { return y; }
    public double getDiameter() { return diameter; }
    public Color getColor() { return color; }
    
    
    //Mutators for x, y, diameter, color
    //TODO: Finish setColor()
    public void setX(double _x) { x = _x; }
    public void setY(double y) { this.y = y; }
    public void setDiameter(double d) { diameter = d; }
    public void setColor(Color c) { color = c; }

    //Methods
    public double area()
    {
        //TODO: Finish area()// Pi^r^2
        
        double r = diameter/2.0;
        return Math.PI * Math.pow(r, 2);
    }
    
    //Draw this circle, filled with current color
    public void draw()
    {
       Ellipse e = new Ellipse(x,y,diameter,diameter);
       e.setColor(color);
       e.fill();
        
    }

    //String for this circle: "Circle: x=##.#, y=##.#, d=##.#, color=(R,G,B)"
    public String toString()
    {
        String msg;
        msg  = "Circle: ";
        msg += "x=" + x + ", y=" + y + ", d=" + diameter;
        return  msg; 
    }
}
