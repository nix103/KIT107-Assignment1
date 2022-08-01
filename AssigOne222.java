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
        
        Time currentTime = new Time(12, 30, 0); // set up launch time

        double chargeTime = 15.737; // time for laser to charge
        
        double missileTime = 0;  // time for missile to move one degree, initialised to 0
        double laserTime = 0;    // time for laser to move one degree, initialised to 0

        
        // iterating through each position (degree) of the missile from Launchtown to Doomsville
        for(int i = 0; i <= 180; i++)
        {
            // At i how long would it take the laser to get to i
            // how long would it take for the missile to get to i
            // Is the laser there before the missile
            // If yes shoot missile at time missile arrives
            // try next degree

            // int d = FiringSolutionInterface.setDegree(i);

            missileTime = i*7.405;  // time for missile to move i degrees

            // update time
            currentTime.addSeconds(7.405);
            
            // time for laser to move to missile position (note: missile position = i)
            if(i <= 90 && i > 0){ 
                laserTime = (90 - i) * 3.61; 
            } 
            else if(i > 90 && i <= 180)
            {
                laserTime = (90 + i) * 3.61;
            }  


            if(laserTime <= missileTime) // + check if laser has had time to charge
            {
                // from notes: determine the (x,y) coordinate of impact and the time
                //             create a firing solution of these values
                //             display the time and firing solution (you can make use 
                //             of the defined DecimalFormat objects to format the 
                //             output of Time and FiringSolution objects)

                // Not working yet:
                // x and y coordinate of missile at i
                // double x = ??;
                // double y = ??; //FiringSolution.getY();?

                // make firing solution and fire laser
                FiringSolution fireLaser = new FiringSolution(currentTime, i, x, y);          

            }                    
            


        }
    }
}