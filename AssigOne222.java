/**
 * Assignment 1
 * @author Nicole Lawrence and Nicolyn Kwok
 * @version <<DATE>>
 * 
 * Split <<50:50 or change!>>
 */

import java.util.Scanner;

public class AssigOne222
{
    public static void main(String []args)
    {
        
        Time initialTime = new Time(12, 30, 0); // set up launch time
        Time currentTime = initialTime;

        final double CHARGETIME = 15.737;       // time for laser to charge
        final double MISSILETRAVELTIME = 7.405; // time for missile to move 1 degree
        final double LASERTRAVELTIME = 3.61;    // time for laser to move 1 degree
        
        double missileTimeInSeconds = 0;  // records time for missile to move one degree, initialised to 0
        double laserTimeInSeconds = 0;    // records time for laser to move one degree, initialised to 0

        // Time timeOfLastFire = new Time();
        boolean HasFired = false;
        int degrees = 0;
                  

        // iterating through each position (degree) of the missile from Launchtown to Doomsville
        for(int i = 1; i <= 180; i++)
        {
            // At i how long would it take the laser to get to i
            // how long would it take for the missile to get to i
            // Is the laser there before the missile
            // If yes shoot missile at time missile arrives
            // try next degree

            missileTimeInSeconds = i*MISSILETRAVELTIME;  // time for missile to move i degrees


            // time for laser to move to missile position (note: missile position = i)
            if(i <= 90 && i > 0 && HasFired == false){ 
                laserTimeInSeconds = (90 - i) * LASERTRAVELTIME; 
            } 
            else if(i > 90 && i <= 180)
            {
                laserTimeInSeconds = i * LASERTRAVELTIME;
            }  

            if(laserTimeInSeconds <= missileTimeInSeconds) // also check if laser has had time to charge
            {
                degrees = i;
                break;
            }
        }
        System.out.println(degrees);
        currentTime.addSeconds((int)missileTimeInSeconds);
        double degreeInRad = Math.toRadians(degrees);
        double x = 4000 * Math.cos(degreeInRad); // calculate x co-ordinate
        double y = 20 * Math.sin(degreeInRad);   // calculate y co-ordinate
        FiringSolution fireLaser = new FiringSolution(currentTime, degrees, x, y);
        System.out.println(fireLaser.toString());

            //         // from notes: determine the (x,y) coordinate of impact and the time
            //         //             create a firing solution of these values
            //         //             display the time and firing solution (you can make use 
            //         //             of the defined DecimalFormat objects to format the 
            //         //             output of Time and FiringSolution objects)

            //     // sets current time to original + how long it's taken for laser to get to position i
            //     currentTime.addSeconds(laserTime); 

            //     // make firing solution and fire laser
            //     FiringSolution fireLaser = new FiringSolution(currentTime, i, missileX, missileY);          

            //     if(laserTime == missileTime)
            //     {
            //         fireLaser.toMilitaryString();
            //         // print out all the stuff
            //     }

            // }     
            // else
            // {
            //     currentTime.addSeconds(missileTime);
            // }
        //}
    }
}