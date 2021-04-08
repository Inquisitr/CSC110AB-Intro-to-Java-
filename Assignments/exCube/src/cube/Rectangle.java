package cube;//	.	........

//This is a class called Rectangle.  It contains the length,
//width, starting x position, and starting y position of a rectangle.
public class Rectangle
{
	//data
	private double length;
	private double width;
	private int x;
	private int y;

	//default constructor
	public Rectangle() 
        {
		length = 4;
		width = 2;
		x = 0;
		y = 0;
	}
        
        //parameterized constructor
        public Rectangle(int xx, int yy, double len, double wid)
        {
            x = xx;
            y = yy;
            length = len;
            width = wid;
        }
        
        //Accessors
        public int getX() { return x; }
        public int getY() { return y; }
        public double getLength() { return length; }
        public double getWidth()  { return width;  }

	//getArea - returns the area of the Rectangle instance
	public double getArea() 
        {
		return length * width;
	}

	//print - a Rectangle is able to "print itself"
	public String toString() 
        {
		return "Rectangle: " + x + ", " + y + ", " + length + ", " + width;
	}
}  //end of class Rectangle