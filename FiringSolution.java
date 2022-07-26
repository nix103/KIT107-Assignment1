/**
 * Class for Firing Solution
 * ADT Implmentation for KIT107 Assignment 1
 * @author Julian Dermoudy and <<YOUR NAMES AND STUDENT IDs HERE>>
 * @version <<DATE>>
 */

import java.text.DecimalFormat;
// import java.util.Scanner; <- might need?

public class FiringSolution 
//implements FiringSolutionInterface
{
    private static final DecimalFormat FMT=new DecimalFormat("###0.000");
    
    private Time time;
    private int degree;
    private double x;
    private double y;
    
    // COMPLETE ME! 

    //add getters and setters:

    public Time getTime() {
        return time;
    }
    
    /** Sets the hours to be a value inputted by user */
    public void setTime(Time value) { 
        time = value;
    }

    /** Get/set degree */
    public int getDegree(){
        return degree;
    }    

    public void setDegree(int value){
        degree = value;
    }

    /** get/set X */
    public double getX(){
        return x;
    }

    public void setX(double value){
        x = value;
    }

    /** get/set y */
    public double getY(){
        return y;
    }
   
    public void setY(double value){
        y = value;
    } 

 }