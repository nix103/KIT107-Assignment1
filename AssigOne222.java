
/**
 * Assignment 1
 * 
 * @author Nicole Lawrence (482649) and Nicolyn Kwok (598061)
 * @version 09th August 2022
 * 
 * All of assingment split 50:50
 */

public class AssigOne222 {
    public static void main(String[] args) {

        final double LAUNCHTIME = 0;            // initialise launch time to 0
        final double LASERCHARGETIME = 15.737;  // time for laser to charge
        final double MISSILETRAVELTIME = 7.405; // time for missile to move 1 degree
        final double LASERTRAVELTIME = 3.61;    // time for laser to move 1 degree

        double missileTimeInSeconds = 0;    // records time for missile to move one degree, initialised to 0
        double laserTimeInSeconds = 0;      // records the time for laser to move to degree i, initialised to 0
        double laserMoveTimeInSeconds = 0;  // records time for laser to move one degree, initialised to 0
        double timeLastFired = LAUNCHTIME;  // records the time the laser fired last, initialised to 0

        int degrees = 0;                // initialises the degrees to 0
        int degreesWhenFired = degrees; // the degree when the laser was fired last, initialised to 0
        int degreesSinceLastFired = 0;  // degrees since laser was last fired

        Time firstFireTime = new Time(12, 30, 0);     // set up launch time
        Time firingTime = new Time(12, 30, 0);        // reset time to initial launch time
        double degreeInRad = Math.toRadians(degrees); // converts angle from degrees to radians
        double x = 0; // x co-ordinate
        double y = 0; // y co-ordinate

        // iterate through each degree of the missile from Launchtown to Doomsville
        // to find first shot
        for (int i = 1; i <= 180; i++) {
            missileTimeInSeconds = i * MISSILETRAVELTIME; // time for missile to move i degrees

            // time for laser to move to degree i when moving left from 90 degree start
            if (i <= 90 && i > 0) {
                laserMoveTimeInSeconds = (90 - i) * LASERTRAVELTIME; // time it would take for laser to move from start position to i
                laserTimeInSeconds = Math.max(laserMoveTimeInSeconds, LASERCHARGETIME); // make sure the laser has had time to charge

            } else if (i > 90 && i < 180) // time for laser to move to degree i when the laser is moving left
            {
                laserMoveTimeInSeconds = (i * LASERTRAVELTIME); // time it would take for laser to move from start position to i
                laserTimeInSeconds = Math.max(laserMoveTimeInSeconds, LASERCHARGETIME); // make sure the laser has had time to charge

            }

            // if degree is less than 180 and laser gets to i before the missile, then fire laser
            if (laserTimeInSeconds <= missileTimeInSeconds && i < 180) {
                degrees = i; // set degrees to current position
                firstFireTime = new Time(12, 30, 0); // set up launch time
                firstFireTime.addSeconds((int) missileTimeInSeconds); // add seconds elapsed to the time of first fire
                degreeInRad = Math.toRadians(degrees); // converts angle from degrees to radians
                x = 4000 * Math.cos(degreeInRad); // calculate x co-ordinate
                y = 20 * Math.sin(degreeInRad); // calculate y co-ordinate

                FiringSolution fireLaser = new FiringSolution(firstFireTime, degrees, x, y); // create new firing solution
                System.out.println(fireLaser.toString()); // print the output to console
                degreesSinceLastFired = degrees; // sets current degree as the degree the laser was last fired at
                timeLastFired = missileTimeInSeconds; // sets the time the laser was last fired to current time
                break; // exit current loop
            }
        }

        // now that the laser has fired for the first time, the laser is moving in the same direction as
        // the missile (left towards Doomsville) which means a second type of firing solution is needed.
        // This loop iterates through all remaining degrees and determines when the missile can be hit
        for (int i = degrees + 1; i < 180; i++) {
            degreesSinceLastFired = i - degreesWhenFired; // sets the degrees since the laser was last fired

            laserTimeInSeconds = timeLastFired + (degreesSinceLastFired * LASERTRAVELTIME); // sets the time for laser to move to i
            missileTimeInSeconds = timeLastFired + (degreesSinceLastFired * MISSILETRAVELTIME); // sets time for missile to move to degree i

            // if laser gets to i first, fire at missile
            if (missileTimeInSeconds >= Math.max(missileTimeInSeconds, timeLastFired + LASERCHARGETIME)) {
                firingTime = new Time(12, 30, 0); // reset time to initial launch time
                firingTime.addSeconds((int) (missileTimeInSeconds)); // adds seconds elapsed to original time

                degreeInRad = Math.toRadians(i); // converts angle from degrees to radians
                x = 4000 * Math.cos(degreeInRad); // calculate x co-ordinate in radians
                y = 20 * Math.sin(degreeInRad); // calculate y co-ordinate in radians

                FiringSolution fireLaser = new FiringSolution(firingTime, i, x, y); // create new firing solution
                System.out.println(fireLaser.toString()); // print output to console

                degreesWhenFired = i; // set degrees laser was last fired at to current position
                timeLastFired = missileTimeInSeconds; // sets time laser was fired last to the current missile time
            }
        }
    }
}