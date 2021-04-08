/*     File: Point3D.java//	.	........
 *   Author: Austin Newton
 *     Date: 03/31/2021
 *  Purpose: Use inheritance to extend a class
 */
package point3d;
//inherit point
public class Point3D extends Point
{


//* Add a double for "z" dimension
    private double z;
    
//* Create default and parameterized constructors
    public Point3D() {
        super();
    }
    
    public Point3D(double ax, double ay, double az) {
        super(ax, ay);
        z = az;
    }
//* Create getZ()
    public double getZ() {
        return z;
    }
//* Override distance() to add the z computation
    public double distance(Point3D OtherPt) {
        double distxy = super.distance(OtherPt);
        double dz = z - OtherPt.getZ();
        double sumsqrs = distxy*distxy + dz*dz;
        return Math.sqrt(sumsqrs);
    }
//* Override toString() to add the z dimension
    public String toSting() {
        String txt = super.toString(); // "(x,y)" 
        txt = txt.substring(0, txt.length() - 1);
        return txt + ", " + z + ")";
    }

}
