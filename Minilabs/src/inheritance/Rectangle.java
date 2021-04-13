package inheritance;//	.	........

//This class defines a geometric rectangle

public class Rectangle
{
	//data for a Rectangle
	protected double length;
	protected double width;

	//constructor - receives the length and width
	public Rectangle(double theLength, double theWidth)
	{
		length = theLength;
		width = theWidth;
	}

	//default constructor - sets the length to 5 and the width to 2
	public Rectangle()
	{
		length = 5;
		width = 2;
	}

	//toString - returns a representation of this Rectangle
	public String toString()
	{
		return "I am a Rectangle with length " + length + " and width " + width;
	}

	//getArea - returns the area
	public double getArea()
	{
		return length * width;
	}
}