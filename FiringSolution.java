/**
 * Class for Firing Solution
 * ADT Implmentation for KIT107 Assignment 1
 * @author Julian Dermoudy and <<YOUR NAMES AND STUDENT IDs HERE>>
 * @version <<DATE>>
 */

import java.text.DecimalFormat;

public class FiringSolution implements FiringSolutionInterface
{
    private static final DecimalFormat FMT=new DecimalFormat("###0.000");
    
    private Time time;
    private int degree;
    private double x;
    private double y;
    
    public Time getTIme() { 
        return time; 
    }   
    //prompts the user to enter the value of time in hours
    public void timeInput(Time input) { 
        time = input;
    }

    public int getDegree() { 
        return degree; 
    }
    //prompts the user to enter the value of degree
    public void degreeInput(int input) { 
        degree = input; 
    }

    public double getX() { 
        return x;
    }
    //prompts the user to enter the value of x's point
    public void xInput(double input) { 
        x = input;
    }

    public double getY() { 
        return y;
    }
    //prompts the user to enter the value of y's point
    public void yInput(double input) { 
        y = input; 
    }
 }