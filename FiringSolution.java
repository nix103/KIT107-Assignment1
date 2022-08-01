
/**
 * Class for Firing Solution
 * ADT Implmentation for KIT107 Assignment 1
 * @author Julian Dermoudy and Nicole and Nicolyn
 * @version 29th July 2022
 */

import java.text.DecimalFormat;

public class FiringSolution extends Time implements FiringSolutionInterface
{
    private static final DecimalFormat FMT = new DecimalFormat("###0.000");

    private Time time;
    private int degree;
    private double x;
    private double y;

    // gets current time
    public Time getTime()
    {
        return time;
    }

    public void setTime(Time t)
    {
        time = t;
    }

    // prompts the user to enter the value of degree
    public void degreeInput(int input)
    {
        degree = input;
    }

    public int getDegree()
    {
        return degree;
    }

    public void setDegree(int d)
    {
        degree = d;
        missileCoordinateConvert(); // recalculate x & y values
    }

    // prompts the user to enter the value of x's point
    public void xInput(double input)
    {
        x = input;
    }

    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    // prompts the user to enter the value of y's point
    public void yInput(double input)
    {
        y = input;
    }

    public double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public String toString()
    {
        return this.getTime().toString();
    }

    // public boolean isHitPoint() {
    // yes - fire laser
    // no - increment
    // degrees, increment seconds
    // }


    public Time timeToFireLaser(double x, double y)
    {
        Time t = time;
        return t;
    }

    /** do we need to prompt the user to enter an angle (t) ? 
     * [No, I don't think so, I think it just starts at missile angle 0, laser angle 90]
     * I think we actually can just do the conversion in one line 
     * (I changed the name from r to degreeInRad to keep track of it better but we can change it 
     * back of course)
     * I'm pretty sure we need the x and y so it re-calculates the x and y coordinates based on the
     * conversion to radians then we can just call it to update
     */
    public void missileCoordinateConvert() 
    {
        double degreeInRad = Math.toRadians(degree); // convert the missile's degree to radians

        x = 4000 * Math.cos(degreeInRad); // calculate x co-ordinate
        y = 20 * Math.sin(degreeInRad);   // calculate y co-ordinate

    }

    /** for the conversion from angle t to radians, is it best to use a for loop ? 
     * and then use  like
     * (final)? double HORIZ; 
     * (final)? double VERT; 
     * for (t is between 0 to 180) {
     * x = MAX_HORIZ*Math.cos(Math.toRadians(degree)); 
     * y = MAX_VERT*Math.sin(Math.toRadians(degree)); 
     * }
     * HORIZ for the specific horizontal angle of the missile, while VERT for the specific vertical angle of the missile? 
     * do you reckon? 
     *
     */
}