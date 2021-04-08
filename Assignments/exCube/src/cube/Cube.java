package cube;

public class Cube extends Rectangle
{
	//data
        private double depth;
        private int z;
    

	//default constructor
        public Cube() {
            super();  //Calls rectangle default constructor. Sets X,Y, Length and Width.
            depth = 3;
            z = 0;
        }
        
        public Cube(int xx, int yy, int zz, double len, double wid, double dep) {
            super(xx,yy,len,wid);
            depth = dep;
            z = zz;
        }
             
        
        
        //parameterized constructor

	//getArea - returns the area of the Cube instance
        public double getArea() {
            return super.getArea() * depth;
        }

	//toString - a Rectangle is able to "print itself"
        public String toString() {
            return "Cube: " + getX() + ", " + getY() + ", " + z + ", " + getLength() + ", " + getWidth() + ", " + depth;
        }
}  //end of class Rectangle