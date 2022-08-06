
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
    public static void main(String[] args)
    {

        Time initialTime = new Time(12, 30, 0); // set up launch time
        Time currentTime = initialTime;

        final double LASERCHARGETIME = 15.737; // time for laser to charge
        final double MISSILETRAVELTIME = 7.405; // time for missile to move 1 degree
        final double LASERTRAVELTIME = 3.61; // time for laser to move 1 degree

        double missileTimeInSeconds = 0; // records time for missile to move one degree, initialised to 0
        double laserTimeInSeconds = 0; // records time for laser to move one degree, initialised to 0
        double timeLastFired = 0;
                
        boolean hasFired = false;
        int degrees = 0;
        int degreesLastFired = degrees;


        // iterate through each degree of the missile from Launchtown to
        // Doomsville
        // find first shot
        for (int i = 1; i <= 180; i++)
        {
            missileTimeInSeconds = i * MISSILETRAVELTIME; // time for missile to move i degrees

            // time for laser to move to missile position (note: missile position = i)
            if (i <= 90 && i > 0)
            {
                laserTimeInSeconds = (90 - i) * LASERTRAVELTIME;
                laserTimeInSeconds = Math.max(laserTimeInSeconds, LASERCHARGETIME); // make sure the laser has had time to charge
                
                
            } else if (i > 90 && i < 180 || hasFired == true) // second half of the path/when the laser is moving left
            {
                laserTimeInSeconds = (i * LASERTRAVELTIME);
                laserTimeInSeconds = Math.max(laserTimeInSeconds, (i-1 * LASERTRAVELTIME) + LASERCHARGETIME);
            }

            if (laserTimeInSeconds <= missileTimeInSeconds && i < 180)
            {
                degrees = i;
                currentTime.addSeconds((int) missileTimeInSeconds);
                double degreeInRad = Math.toRadians(degrees);
                double x = 4000 * Math.cos(degreeInRad); // calculate x co-ordinate
                double y = 20 * Math.sin(degreeInRad); // calculate y co-ordinate

                FiringSolution fireLaser = new FiringSolution(currentTime, degrees, x, y);
                System.out.println(fireLaser.toString());                
                degreesLastFired = degrees;
                hasFired = true;
                timeLastFired = missileTimeInSeconds;
            }
        }

        // now following missile
        for (int i = degrees+1; i <= 180; i++)
        {
                        // Pseudocode
            //      move laser to degreeCurrent
            //      move missile to degreeCurrent
            //      is laser there first? has charge time elapsed?
            //          yes - fire
            //          no - increment degrees
            
            // e.g, 
            int degreeCurrent = 31;
            int lastFired = 30;

            int degreesSinceLastFired = 1;

            laserTimeInSeconds = timeLastFired + (degreesSinceLastFired*LASERTRAVELTIME);
            missileTimeInSeconds = timeLastFired + (degreesSinceLastFired*MISSILETRAVELTIME);

            if (missileTimeInSeconds >= timeLastFired + LASERCHARGETIME)
            {
                // fire
                degreesSinceLastFired = 0;;
                hasFired = true;
                timeLastFired = missileTimeInSeconds;
            }
           
            // degreeCurrent = 32;
            // lastFired = 30
            // missile time = 7.405*2 = 14.81
            // laser time = 3.61*2 = 7.22
            // charge time elapsed? (i.e., is missile time >= 15.737)
            // no - can't fire move to next

            // degreeCurrent = 33, lastFired = 30
            // missile time = 7.405*3 = 22.215
            // laser time = 3.61*3 = 10.83
            // charge time elapsed? (i.e., is missile time >= 15.737)
            // yes - fire
            // lastFired = 33
        }
    }
}