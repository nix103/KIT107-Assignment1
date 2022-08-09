
/**
 * Class for Firing Solution
 * ADT Implmentation for KIT107 Assignment 1
 * @author Julian Dermoudy and Nicole Lawrence (482649) and Nicolyn Kwok (598061)
 * @version 9th August 2022
 */

import java.text.DecimalFormat;

public class FiringSolution implements FiringSolutionInterface
{
    private static final DecimalFormat FMT = new DecimalFormat("###0.000");

    private Time time;
    private int degree;
    private double x;
    private double y;

    /**
     * Constructor to call from AssignOne222
     * 
     * @author Nicole Lawrence (482649) and Nicolyn Kwok (598061)
     */
    public FiringSolution(Time t, int d, double x, double y)
    {
        setTime(t);
        setDegree(d);
        setX(x);
        setY(y);
    }

    /**
     * Gets current time for laser and missile.
     * 
     * @return time value of type Time.
     * @author Nicole Lawrence, Nicolyn Kwok
     */
    public Time getTime()
    {
        return time;
    }
    
    /**
     * Sets current time for laser and missile.
     * 
     * @author Nicole Lawrence, Nicolyn Kwok
     */
    public void setTime(Time t)
    {
        time = t;
    }

    /**
     * Gets degree for laser and missile.
     * 
     * @return integer value of degree.
     * @author Nicole Lawrence, Nicolyn Kwok
     */
    public int getDegree()
    {
        return degree;
    }

    /**
     * Sets degree for laser and missile.
     * 
     * @author Nicole Lawrence, Nicolyn Kwok
     */
    public void setDegree(int d)
    {
        degree = d;
    }

    /**
     * Gets x coordinate for laser and missile.
     * 
     * @return double value of x coordinate.
     * @author Nicole Lawrence, Nicolyn Kwok
     */
    public double getX()
    {
        return x;
    }

    /**
     * Sets x coordinate for laser and missile.
     * 
     * @author Nicole Lawrence, Nicolyn Kwok
     */
    public void setX(double x)
    {
        this.x = x;
    }

    /**
     * Gets y coordinate for laser and missile.
     * 
     * @return double value of y coordinate.
     * @author Nicole Lawrence, Nicolyn Kwok
     */
    public double getY()
    {
        return y;
    }
    
    /**
     * Sets y coordinate for laser and missile.
     * 
     * @author Nicole Lawrence, Nicolyn Kwok
     */
    public void setY(double y)
    {
        this.y = y;
    }

    
    /**
     * Displays output message of the program to users
     * 
     * @return a String value which includes variables degree, time, and coordinates.
     * @author Nicole Lawrence, Nicolyn Kwok
     */ 
    public String toString()
    {
        String s = "At time " + this.getTime().toMilitaryString() + " PM" +
        ", fire at " + degree + " degrees to impact missile at (" +
        FMT.format(x) + ", " + FMT.format(y) + ")";
        return s;
    }
}