package comparable;//	.	........


/**
 Demonstrates sorting arrays for classes that 
 implement the Comparable interface.
*/
public class ComparableDemo
{
    public static void main(String[] args)
    {
        //SORT DOUBLE ARRAY
        System.out.println("\n\nDOUBLE SORT");
        Double[] d = new Double[10];
        for (int i = 0; i < d.length; i++)
            d[i] = new Double(d.length - i);

        System.out.println("Before sorting:");
        int i;
        for (i = 0; i < d.length; i++)
            System.out.print(d[i].doubleValue( ) + ", ");
        System.out.println( );

        GeneralizedSelectionSort.sort(d, d.length);

        System.out.println("\nAfter sorting:");
        for (i = 0; i < d.length; i++)
            System.out.print(d[i].doubleValue( ) + ", ");
        System.out.println( );

        //SORT STRING ARRAY
        System.out.println("\n\nSTRING SORT");
        String[] a = new String[10];
        a[0] = "dog";
        a[1] = "cat";
        a[2] = "cornish game hen";
        int numberUsed = 3;

        System.out.println("Before sorting:");
        for (i = 0; i < numberUsed; i++)
            System.out.print(a[i] + ", ");
        System.out.println( );

        GeneralizedSelectionSort.sort(a, numberUsed);

        System.out.println("\nAfter sorting:");
        for (i = 0; i < numberUsed; i++)
            System.out.print(a[i] + ", ");
        System.out.println( );
        
        //SORT EMPLOYEE ARRAY
        System.out.println("\n\nEMPLOYEE SORT");
        numberUsed = 5;
        Employee[] e = new Employee[numberUsed];
        e[0] = new Employee("Al",  new Date("March", 3, 1995));
        e[1] = new Employee("Bob", new Date("January", 2, 1994));
        e[2] = new Employee("Cyn", new Date("January", 1, 1994));
        e[3] = new Employee("Dan", new Date("September", 29, 1999));
        e[4] = new Employee("Eva", new Date("December", 25, 1997));

        System.out.println("Before sorting:");
        for (i = 0; i < numberUsed; i++)
            System.out.println(e[i]);

        GeneralizedSelectionSort.sort(e, numberUsed);

        System.out.println("\nAfter sorting:");
        for (i = 0; i < numberUsed; i++)
            System.out.println(e[i]);
        
    }//end main()
}
