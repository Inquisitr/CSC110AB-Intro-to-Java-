package point3d;//	.	........

public class PointDriver
{

    public static void main(String[] args)
    {
        System.out.println( "=== POINT TESTER ===\n" );

        System.out.println( "\n1. Creating a default Point() and printing it.\n" );
        Point point00 = new Point();
        System.out.println( "Point00: " + point00 );

        System.out.println( "\n2. Creating another Point(3,4) and printing it.\n" );
        Point point34 = new Point(3, 4);
        System.out.println( "Point34: " + point34 );

        System.out.println( "\n3. Finding distance between the two points (0,0) to (3,4)\n" );
        System.out.println( "Distance from Point " + point00
                 + " \nto Point " + point34
                 + " \nis " + point00.distance(point34) );

        System.out.println( "\n\n=== POINT3D TESTER ===\n" );

        System.out.println( "\n4. Creating a default Point3D() and printing it.\n" );
        Point3D d3Point000 = new Point3D();
        System.out.println( "d3Point000: " + d3Point000 );

        System.out.println( "\n5. Creating another Point3D(3,4,5) and printing it.\n" );
       Point3D d3Point345 = new Point3D(3, 4, 5);
       System.out.println( "d3Point345: " + d3Point345 );

       System.out.println( "\n6. Finding distance between the two points (0,0,0) to (3,4,5)\n" );
       System.out.println( "Distance from Point3D " + d3Point000
               + " \nto Point3D " + d3Point345
               + " \nis " + d3Point000.distance(d3Point345) );

    }
    
}
