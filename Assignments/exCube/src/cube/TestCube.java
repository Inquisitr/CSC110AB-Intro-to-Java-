package cube;//	.	........

public class TestCube {

    public static void main(String[] args) 
    {
        System.out.println("\n==TESTING DEFAULT RECTANGLE==");
        Rectangle rec1 = new Rectangle();
        System.out.println("\nExpected: Rectangle: 0, 0, 4.0, 2.0");
        System.out.println(  "     Got: " + rec1);
        
        System.out.println("\nExpected Area: 8.0");
        System.out.println(  "          Got: " + rec1.getArea());
        
        System.out.println("\n==TESTING PARAMETERIZED RECTANGLE==");
        Rectangle rec2 = new Rectangle(-1, 5, 8, 5);
        System.out.println("\nExpected: Rectangle: -1, 5, 8.0, 5.0");
        System.out.println(  "     Got: " + rec2);
        
        System.out.println("\nExpected Area: 40.0");
        System.out.println(  "          Got: " + rec2.getArea());
        
        System.out.println("\n==TESTING DEFAULT CUBE==");
        Cube cub1 = new Cube();
        System.out.println("\nExpected: Cube: 0, 0, 0, 4.0, 2.0, 3.0");
        System.out.println(  "     Got: " + cub1);
        
        System.out.println("\nExpected Area: 24.0");
        System.out.println(  "          Got: " + cub1.getArea());
        
        System.out.println("\n==TESTING PARAMETERIZED RECTANGLE==");
        Cube cub2 = new Cube(-1, 5, 3, 8, 5, 2);
        System.out.println("\nExpected: Cube: -1, 5, 3, 8.0, 5.0, 2.0");
        System.out.println(  "     Got: " + cub2);
        
        System.out.println("\nExpected Area: 80.0");
        System.out.println(  "          Got: " + cub2.getArea());
        
    }//end main()
    
}
