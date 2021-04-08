/*    File: Music.java
 *    Name: Kurt Marley HP
 *    Date: Sep 18, 2015
 * Purpose: Play some music
 */
package mlmusicharry;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Sound 
{
    public final static int SAMPLERATE = 4096; // ~4KHz
    public final static AudioFormat audfmt = new AudioFormat(SAMPLERATE, 8, 1, true, true);
    public final static int MAX_CHANNELS = 10;
    public static SourceDataLine[] sdl = {null,null,null,null,null,null,null,null,null,null };
    public static double volume = 0.6; //100% = 1.0
   
    public static void open() throws LineUnavailableException 
    {  
        open(0);
    }
   
    public static void open(int ch) throws LineUnavailableException 
    {  
        sdl[ch] = AudioSystem.getSourceDataLine(audfmt);
        sdl[ch].open(audfmt, SAMPLERATE);
        start(ch);
    }
    public static void start(int ch)
    {
        sdl[ch].start();
    }
    public static void stop(int ch)
    {
        sdl[ch].stop();
    }
    public static void drain(int ch)
    {
        sdl[ch].drain();
    }
    public static void pause(int msec) throws InterruptedException
    {
        Thread.sleep(msec);
        System.out.println();
    }
    public static void close()
    {
        close(0);
    }
    public static void close(int ch)
    {
        sdl[ch].drain();
        sdl[ch].close();
    }
    
    public static void play(double note, double msec)
    {
        play(0, note, msec);
    }
    
    public static void play(int ch, double note, double msec)
    {
        System.out.printf("%6.3f @ %.0fmsec\n", note, msec);
        int length = (int)(msec/1000 * SAMPLERATE);
        byte[] sin = new byte[length];
        double period = (double)SAMPLERATE / note;
        for (int i = 0; i < sin.length; i++) {
            double angle = 2.0 * Math.PI * i / period;
            sin[i] = (byte)(Math.sin(angle)* volume * 127f);
            if(i<150) sin[i] *= i/150; //attack
        }
        int count = sdl[ch].write(sin, 0, length);       
    }//end play()

}