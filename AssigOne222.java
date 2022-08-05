
/**
 * Assignment 1
 * @author Nicole Lawrence and Nicolyn Kwok
 * @version <<DATE>>
 * 
 * Split <<50:50 or change!>>
 */

import java.util.Scanner;

public class AssigOne222 {
    public static void main(String[] args) {

        Time initialTime = new Time(12, 30, 0); // set up launch time
        Time currentTime = initialTime;

        final double CHARGETIME = 15.737;       // time for laser to charge
        final double MISSILETRAVELTIME = 7.405; // time for missile to move 1 degree
        final double LASERTRAVELTIME = 3.61;    // time for laser to move 1 degree

        double missileTimeInSeconds = 0; // records time for missile to move one degree, initialised to 0
        double laserTimeInSeconds = 0;   // records time for laser to move one degree, initialised to 0
        double laserChargingTime = 0; // records time for the laser to charge, initialised at 0

        // Time timeOfLastFire = new Time();
        boolean HasFired = false;
        int degrees = 0;

        // iterating through each position (degree) of the missile from
        // Launchtown to Doomsville
        for (int i = 1; i <= 180; i++)
        {

            missileTimeInSeconds = i * MISSILETRAVELTIME; // time for missile to move i degrees

            // time for laser to move to missile position (note: missile position = i)
            if (i <= 90 && i > 0)
            {

                laserTimeInSeconds = (90 - i) * LASERTRAVELTIME;     
                // laserTimeInSeconds += CHARGETIME; 

            } else if (i > 90 && i < 180)
            {

                laserTimeInSeconds = i * LASERTRAVELTIME;
                // laserTimeInSeconds += CHARGETIME;

            }

            if (laserTimeInSeconds <= missileTimeInSeconds)  // also check if laser has had time to charge - ??
            {
                
                
                // output                
                
            //     HasFired = false;
                
            //     if (HasFired = false)
            //     {
            //         degrees = i;
            //         currentTime.addSeconds((int) missileTimeInSeconds);
            //         double degreeInRad = Math.toRadians(degrees);
            //         double x = 4000 * Math.cos(degreeInRad); // calculate x co-ordinate
            //         double y = 20 * Math.sin(degreeInRad); // calculate y co-ordinate
    
            //         FiringSolution fireLaser = new FiringSolution(currentTime, degrees, x, y);        
            //         System.out.println(fireLaser.toString());
            //         HasFired = true;
            //     } 
            //     else if (HasFired = true)
            //     {

            //         if (i <= 90 && i > 0)
            //         {
        
            //             laserTimeInSeconds = (90 - i) * LASERTRAVELTIME;     
            //             laserTimeInSeconds += CHARGETIME; 
        
            //         } else if (i > 90 && i <= 180)
            //         {
        
            //             laserTimeInSeconds = i * LASERTRAVELTIME;
            //             laserTimeInSeconds += CHARGETIME;
        
            //         }

            //         degrees = i;
            //         System.out.println(degrees); // debugging
            //         // HasFired = true;

            //     } 
                
                
            //     // System.out.println(laserTimeInSeconds); // debugging
            //     // System.out.println(degrees); // debugging

            // System.out.println(degrees); // debugging
            currentTime.addSeconds((int) missileTimeInSeconds);
            System.out.println(currentTime);

            // double degreeInRad = Math.toRadians(degrees);
            // double x = 4000 * Math.cos(degreeInRad); // calculate x co-ordinate
            // double y = 20 * Math.sin(degreeInRad); // calculate y co-ordinate
            // FiringSolution fireLaser = new FiringSolution(currentTime, degrees, x, y);
            // System.out.println(fireLaser.toString());
            }
            


        }

    }
}