package point3d;//	.	........

public class Point
{
    private double x;
    private double y;

    public Point()
    {
            x = 0.0;
            y = 0.0;
    }

    public Point(double aX, double aY)
    {
            x = aX;
            y = aY;
    }

    public double getX() { return x; }

    public double getY() { return y; }

    public double distance(Point otherPt)
    {
            double dx = x - otherPt.getX();
            double dy = y - otherPt.getY();
            double sumOfSquares = dx * dx + dy * dy;
            return Math.sqrt(sumOfSquares);
    }

    public String toString()
    {
            return "(" + x + ", " + y + ")";
    }

}
