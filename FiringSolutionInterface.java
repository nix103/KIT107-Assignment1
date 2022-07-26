/**
 * Interface for Firing Solution
 * ADT specification for KIT107 Assignment 1
 * @author Julian Dermoudy
 * @version 20/7/2022
 * 
 * File is COMPLETE.
 */

public interface FiringSolutionInterface
{
    //public FiringSolution(Time t, int d, double x, double y);
    public void setTime(Time t);
    public Time getTime();
    public void setDegree(int d);
    public int getDegree();
    public void setX(double x);
    public double getX();
    public void setY(double y);
    public double getY();
    public String toString();
}