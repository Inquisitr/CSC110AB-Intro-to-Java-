/*    File: Music.java	.	........
 *    Name: Austin Newton
 *    Date: 02/23/21
 * Purpose: Play some music
 */
package mlmusicharry;

public class MusicArray 
{
    
    //TODO: Write a static method playSong() to play song2d[][] using for-each.
    //      Beware of null!  You might need to test !=null for each note
    //      Pause for 2-3 seconds before starting each song.
    //      Hint: you will need to declare throwing an Exception like in main().
    //      Use the for-each loop (with the colon) to get to the notes:
    //          for( double[ ] note  :  list)

    
    //playSong() -- play notes in a 2d array
    public static void playSong(double[][] song) throws Exception
    {
        Sound.pause(2500); // 2.5 Sec
        for ( double [] note: song) {  //note is freq & duration
            if (note != null ) {
                Sound.play(note[0], note[1]);
            }
        }
    }//end playSong()
    
    //TODO: Write a static method playSong() to play song2d[][] using nested for-loops.
    //      Beware of null!  You might need to test !=null for each note
    //      Pause for 2-3 seconds before starting each song.
    //      Hint: you will need to declare throwing an Exception like in main().
    //      Use two nested standard for-loops (with the semi-colons) to get to the notes:
    //          for( int song=0;  CONDITION; s ong++)
    //              for( int note=0;  CONDITION;  note++)

    
    //playForLoop3D() -- play notes in a 3d array
    public static void playForLoop3D(double[][][] list) throws Exception
    {
        for (double[][] song : list) {
            Sound.pause(2500);
    
            for ( double [] note: song) {  //note is freq & duration
                if (note != null ) {
                    Sound.play(note[0], note[1]);
                }
            }
        }
        //CODE GOES HERE
    }//end playForLoop3D()


    //TODO: Write a static method playSongList() to play song3d[][][] using nested for-each loops.
    //      Beware of null!  You might need to test !=null for each song
    //      Hint: you can call playSong().
    //      Hint: you will need to declare throwing an Exception like in main().
    //      Use two nested for-each loop (with the colon) to get to the notes:
    //          for( double[ ][ ]  song  :  list)
    //              for( double[ ] note  :  song)

    //playSongList() -- play songs in a 3d array
    public static void playSongList(double[][][] list) throws Exception
    {
        //CODE GOES HERE -- USE FOR-EACH HERE
    }//end playSongList()
    
    
    public static void main(String[] args) throws Exception  
    {
        double MSEC = 650;     //duration of note (millisec)
        double HALF = Math.pow(2.0, 1.0/12.0); //half step: TWELVETH ROOT OF TWO
        double FULL = Math.pow(HALF,2);        //full step
        
        double C5 = 523.2;     //frequency of C5 in Hz
        double D5 = C5 * FULL; //or =C5*Math.pow(HALF,2)
        double E5 = D5 * FULL; //or =C5*FULL*FULL
        double C4 = C5 / 2;
        double G5 = C4 * Math.pow(HALF, 7);
        //double F5
        //double G5
        
        System.out.println("HALF= " + HALF);
        System.out.println("FULL= " + FULL);
        System.out.println("C5= " + C5);
        System.out.println("D5= " + D5);
        System.out.println("E5= " + E5);
        
        double[][] song2d = //new double[12][2];
        {
            //Close Encounters FIVE NOTES 
                {C5*FULL,MSEC}, //D5
                {E5,MSEC}, 
                {C5,MSEC},
                {C4,MSEC},
                {G5,3*MSEC}
        };

        
        double[][][] song3d = //new double[2][12][2];
        {
            //TODO: Song0 - YOUR CHOICE (5-12 notes)
            {
                {E5,MSEC}, //put in {freq, duration} notes
                {D5,MSEC},
                {C5,MSEC},
                {E5,MSEC}, //put in {freq, duration} notes
                {D5,MSEC},
                {C5,MSEC}
                
            },
            //TODO: Song1 - YOUR CHOICE (5-12 notes)
            {
                {C5,MSEC}, //put in {freq, duration) notes
                {D5,MSEC},
                {E5,MSEC},
                {C5,MSEC},
                {C5,MSEC}, //put in {freq, duration) notes
                {D5,MSEC},
                {E5,MSEC},
                {C5,MSEC}
            }        
        };

        
        Sound.open();  //leave this line here at the beginning

        
        //Call your playSong() to play song2d[][].   
        System.out.println("\n>>playSong() - 2d song using for-each loop");
        playSong( song2d );

        
        //Call your playForLoop3D() to play song3d[][][]          
        System.out.println("\n>>playForLoop3D() - 3d song using nested for-loops");
        playForLoop3D( song3d );
 
        
        //Call your playSongList() to play song3d[][][]          
        System.out.println("\n>>playSongList() - 3d song using nested for-each loop");
        playSongList( song3d );
        
        
        Sound.close(); //leave this line here at the end
        
    }//end main()

}