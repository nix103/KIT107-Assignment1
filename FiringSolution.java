
/**
 * Class for Firing Solution
 * ADT Implmentation for KIT107 Assignment 1
 * @author Julian Dermoudy and Nicole and Nicolyn
 * @version 29th July 2022
 */

import java.text.DecimalFormat;

public class FiringSolution extends Time implements FiringSolutionInterface {
    private static final DecimalFormat FMT = new DecimalFormat("###0.000");

    private Time time;
    private int degree;
    private double x;
    private double y;

    private int missilePosition[];
    private int missileCoordinates[];

    // gets current time
    public Time getTime() {
        return time;
    }

    public void setTime(Time t) {
        time = t;

    }

    // prompts the user to enter the value of degree
    public void degreeInput(int input) {
        degree = input;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int d) {
        degree = d;

    }

    // prompts the user to enter the value of x's point
    public void xInput(double input) {
        x = input;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;

    }

    // prompts the user to enter the value of y's point
    public void yInput(double input) {
        y = input;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;

    }

    public String toString() {
        return this.getTime().toString();
    }

    // public boolean isHitPoint() {
    // yes - fire laser
    // no - increment
    // degrees, increment seconds
    // }

    // do we need to prompt the user to enter an angle (t) ? 
    // also not sure why variable x and y is not used, but used in the if statement?
    public void missileCoordinateConvert() {
        double x; // the missile's x coordinate in radians
        double y; // the missile's y coordinate in radians
        double r; // t's conversion in radians
        int t; // the angle's variable

        t = 0; // initialise t at 0
        //t = in.nextInt(); is it needed? 
        if (t >= 0 && t <= 180) {
            r = Math.toRadians(t);

            x = 4000 * Math.cos(r);
            y = 20 * Math.sin(r);
        }
        //System.out.println("(" + x +", " + y +")"); should this comment be added to the method? 
    }

    /**
     * notes:
     * have a separate array for the coordinates, position of the missile, laser's
     * degree
     */

    /**
     * Given an angle t in the range of 0–180° for the direction of the laser, the
     * position of the
     * missile on its elliptical path is the coordinate (x,y) where
     * x=4000*Math.cos(r) and
     * y=20*Math.sin(r). r is the value t converted to radia
     */
}