/*       File: Program4.java	.	........
 *      Class: CSC110AB MW9
 * Programmer: Austin Newton
 *    Purpose: ???
 */
package nutank4;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Program4
{       
	public static void main(String[ ] args)
	{
 		Scanner kb = new Scanner (System.in);
                System.out.println("Please Enter Your Name:");
                
                String name = kb.nextLine();
                
                
                
                // set tankColor for name of Abbot and Costello
                if (name.equalsIgnoreCase("Costello") || name.contentEquals("costello") ) {
                    Random rand = new Random();
                    Color costelloColor = new Color( rand.nextInt(256),rand.nextInt(256),rand.nextInt(256) );
                    Tank myTank = new Tank(costelloColor,27);
                    Landscape ls = new Landscape();
                    ls.addTank(myTank);
//                  ls.targetMovement(true);
                    
                    
                    //find out some information needed for the calculations
                    Point greenPoint = ls.getGreenOpening();
                    int greenX = (int)greenPoint.getX();
                    int greenY = (int)greenPoint.getY();
                    
                    Point orangePoint = ls.getOrangeOpening();
                    int orangeX = (int)orangePoint.getX();
                    int orangeY = (int)orangePoint.getY();
                    
                    Point targetPoint = ls.getTargetLocation();
                    int targetX = (int)targetPoint.getX();
                    int targetY = (int)targetPoint.getY();
                    
                    int tankWidth = myTank.getDimension();
                    
                    
                    //start movements
                    myTank.turn("left");
                    myTank.turn("left");
                    
                    
                    //move to green opening
                    while (myTank.getPositionY() < greenY - tankWidth) {
                        myTank.move();
                    }
                      
                    myTank.turn("left");
                    
                    
                    //move to middle area middle area
                    myTank.turn("left");
                    myTank.turn("left");
                    myTank.reverse();
                    for(int i=0; i<200; i++) myTank.move(); //CRASHES!!!
                    
                    //        -------------------------move to orange opening--------------------------------------

                    
                    if (myTank.getPositionY() < orangeY) {
                        
                        myTank.turn("left");
                        
                        while (myTank.getPositionY() < orangeY - tankWidth) {
                            myTank.move();
                            myTank.forward();
                        }
                        
                        myTank.turn("right");
                        myTank.reverse();
                        for(int i=0; i<200; i++) myTank.move();
                        
                    } else if (myTank.getPositionY() > orangeY ) {
                        
                        myTank.turn("right");
                        
                        while (myTank.getPositionY() > orangeY - tankWidth) {
                            myTank.move();
                            myTank.forward();
                        }
                        
                        myTank.turn("left");
                        myTank.reverse();
                        for(int i=0; i<200; i++) myTank.move();
                    }
                    
                    
                    //Move to target


                    if (myTank.getPositionY() < targetY) {
                        myTank.turn("left");
                        
                        while (myTank.getPositionY() < targetY) {
                        myTank.move();
                        myTank.forward();
                    }
                        myTank.turn("left");
                        
                        while (myTank.getPositionX() < targetX) {
                        myTank.move();
                        myTank.forward();
                    }
                        
                    } else if (myTank.getPositionY() > targetY) {
                        myTank.turn("right");
                        
                        while (myTank.getPositionY() > targetY) {
                        myTank.move();
                        myTank.forward();
                    }
                        myTank.turn("right");
                        while (myTank.getPositionX() < targetX) {
                        myTank.move();
                        myTank.forward();
                    }
                        
                        
                    }
                    
                    
                } else if (name.equalsIgnoreCase("Abbot") || name.contentEquals("abbot")) {
                    Tank myTank = new Tank(Color.GREEN, 27);
                    Landscape ls = new Landscape();
                    ls.addTank(myTank);
//                  ls.targetMovement(true);
                    
                    //find out some information needed for the calculations
                    Point greenPoint = ls.getGreenOpening();
                    int greenX = (int)greenPoint.getX();
                    int greenY = (int)greenPoint.getY();
                    
                    Point orangePoint = ls.getOrangeOpening();
                    int orangeX = (int)orangePoint.getX();
                    int orangeY = (int)orangePoint.getY();
                    
                    Point targetPoint = ls.getTargetLocation();
                    int targetX = (int)targetPoint.getX();
                    int targetY = (int)targetPoint.getY();
                    
                    int tankWidth = myTank.getDimension();
                    
                    
                    //start movements
                    myTank.turn("left");
                    myTank.turn("left");
                    
                    
                    //move to green opening
                    while (myTank.getPositionY() < greenY - tankWidth) {
                        myTank.move();
                    }
                      
                    myTank.turn("left");
                    
                    
                    //move to middle area middle area
                    myTank.turn("left");
                    myTank.turn("left");
                    myTank.reverse();
                    for(int i=0; i<200; i++) myTank.move(); //CRASHES!!!
                    
//        -------------------------move to orange opening--------------------------------------

                    
                    if (myTank.getPositionY() < orangeY) {
                        
                        myTank.turn("left");
                        
                        while (myTank.getPositionY() < orangeY - tankWidth) {
                            myTank.move();
                            myTank.forward();
                        }
                        
                        myTank.turn("right");
                        myTank.reverse();
                        for(int i=0; i<200; i++) myTank.move();
                        
                    } else if (myTank.getPositionY() > orangeY ) {
                        
                        myTank.turn("right");
                        
                        while (myTank.getPositionY() > orangeY - tankWidth) {
                            myTank.move();
                            myTank.forward();
                        }
                        
                        myTank.turn("left");
                        myTank.reverse();
                        for(int i=0; i<200; i++) myTank.move();
                    }
                    
                    
                    //Move to target


                    if (myTank.getPositionY() < targetY) {
                        myTank.turn("left");
                        
                        while (myTank.getPositionY() < targetY) {
                        myTank.move();
                        myTank.forward();
                    }
                        myTank.turn("left");
                        
                        while (myTank.getPositionX() < targetX) {
                        myTank.move();
                        myTank.forward();
                    }
                        
                    } else if (myTank.getPositionY() > targetY) {
                        myTank.turn("right");
                        
                        while (myTank.getPositionY() > targetY) {
                        myTank.move();
                        myTank.forward();
                    }
                        myTank.turn("right");
                        while (myTank.getPositionX() < targetX) {
                        myTank.move();
                        myTank.forward();
                    }
                        
                        
                    }
                   
                } else {
                    Tank myTank = new Tank(Color.LIGHT_GRAY, 27);
                    Landscape ls = new Landscape();
                    ls.addTank(myTank);
//                    ls.targetMovement(true);
                    
                    //find out some information needed for the calculations
                    Point greenPoint = ls.getGreenOpening();
                    int greenX = (int)greenPoint.getX();
                    int greenY = (int)greenPoint.getY();
                    
                    Point orangePoint = ls.getOrangeOpening();
                    int orangeX = (int)orangePoint.getX();
                    int orangeY = (int)orangePoint.getY();
                    
                    Point targetPoint = ls.getTargetLocation();
                    int targetX = (int)targetPoint.getX();
                    int targetY = (int)targetPoint.getY();
                    
                    int tankWidth = myTank.getDimension();
                    
                    //start movements
                    myTank.turn("left");
                    myTank.turn("left");
                    
                    //move to green opening
                    while (myTank.getPositionY() < greenY - tankWidth) {
                        myTank.move();
                    }
                      
                    myTank.turn("left");
                    
                    
                    //move to middle area middle area
                    myTank.turn("left");
                    myTank.turn("left");
                    myTank.reverse();
                    for(int i=0; i<200; i++) myTank.move(); //CRASHES!!!
                    
                    
//        -------------------------move to orange opening--------------------------------------

                    
                    if (myTank.getPositionY() < orangeY) {
                        
                        myTank.turn("left");
                        
                        while (myTank.getPositionY() < orangeY - tankWidth) {
                            myTank.move();
                            myTank.forward();
                        }
                        
                        myTank.turn("right");
                        myTank.reverse();
                        for(int i=0; i<200; i++) myTank.move();
                        
                    } else if (myTank.getPositionY() > orangeY ) {
                        
                        myTank.turn("right");
                        
                        while (myTank.getPositionY() > orangeY - tankWidth) {
                            myTank.move();
                            myTank.forward();
                        }
                        
                        myTank.turn("left");
                        myTank.reverse();
                        for(int i=0; i<200; i++) myTank.move();
                    }
                    
                    
                    //Move to target


                    if (myTank.getPositionY() < targetY) {
                        myTank.turn("left");
                        
                        while (myTank.getPositionY() < targetY) {
                        myTank.move();
                        myTank.forward();
                        ls.directionToTarget();
//                        myTank.forward();
                    }
                        myTank.turn("left");
                        
                        while (myTank.getPositionX() < targetX) {
                        myTank.move();
                        myTank.forward();
                    }
                        
                    } else if (myTank.getPositionY() > targetY) {
                        myTank.turn("right");
                        
                        while (myTank.getPositionY() > targetY) {
                        myTank.move();
                        myTank.forward();
                    }
                        myTank.turn("right");
                        while (myTank.getPositionX() < targetX) {
                        myTank.move();
                        myTank.forward();
                    }
                        
                        
                    } 
                    
//                    while (myTank.getPositionY() < targetY) {
//                        myTank.move();
//                        myTank.forward();
//                    }
//                    
//                    myTank.turn("left");
//                    
//                    while (myTank.getPositionX() < targetX) {
//                        myTank.move();
//                        myTank.forward();
//                    }
                    
                    
                    
                } // end else if
            
            
               
                
                
//		//create a new Tank with that color and speed; add tank to landscape
//		Tank myTank = new Tank(tankColor, 27);
//		Landscape ls = new Landscape(6147);//6147);
//		ls.addTank(myTank);
//                
//                //50 pts extra credit for a moving target - uncomment to try it
//                //ls.targetMovement(true);
//
//		//find out some information needed for the calculations
//                Point greenPt = ls.getGreenOpening();
//                int greenX = (int)greenPt.getX();
//                int greenY = (int)greenPt.getY();
//		int tankWidth = myTank.getDimension();
//
//                //start movements
//		myTank.turn("left");
//		myTank.turn("left");
//                
//                //Move to Green opening                
//		for(int i=0; i<285; i++) myTank.move(); // only works for 6147 landscape
//                while (myTank.getPositionY() < greenY - tankWidth) {
//                    myTank.move();
//                }
//                
//		myTank.turn("left");
//                
//                //Move to middle area
//                myTank.turn("left");
//		myTank.turn("left");
//                myTank.reverse();
//                for(int i=0; i<200; i++) myTank.move(); //CRASHES!!!
                
        }//end main()
                
}

