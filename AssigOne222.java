/**
 * Assignment 1
 * @author Nicole and Nicolyn
 * @version <<DATE>>
 * 
 * Split <<50:50 or change!>>
 */

import java.util.Scanner;

public class AssigOne222 implements TimeInterface, FiringSolutionInterface
{
    public static void main(String []args)
    {
        // double degree = 0;
        Time launchTime = new Time(12, 30, 0); //launch time
        double chargeTime = 15.737;         // time for laser to charge
        int laserStartDegree = 90;          // start position for laser
        int missileStartDegree = 0;         // start position for missile
        double missileTime;  // time for missile to move one degree
        double laserTime;     // time for laser to move one degree
        int missileDeg;
        int laserDeg;
        

        for(int i = 0; i <= 180; i++)
        {
            // At i how long would it take the laser to get to i
            // how long would it take for the missile to get to i
            // Is the laser there before the missile
            // If yes shoot missile at time missile arrives
            // try next degree

            // missile to i
            missileTime = i*7.405;  // time for missile to move one degree
            laserTime = i*3.61;     // time for laser to move one degree

            if(i >= 90 && i <= 189){
                missileDeg = 90 + i;
            } 
            else if(i < 90 && i >0)
            {
                missileDeg = 90 - i;
            }
            

            // if(missileTime)            
        
            


        }
    }
}