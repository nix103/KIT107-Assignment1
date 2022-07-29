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
    public Time getTime() { 
        return time; 
    }   
        
    public void setTime(Time t) {
        time = t;
        
    }  

    //prompts the user to enter the value of degree
    public void degreeInput(int input) { 
        degree = input; 
    }

    public int getDegree() { 
        return degree; 
    }

    
    public void setDegree(int d) {
        degree = d;
        
    }

    
    //prompts the user to enter the value of x's point
    public void xInput(double input) { 
        x = input;
    }

    public double getX() { 
        return x;
    }
    
    public void setX(double x) {
        this.x = x;
        
    }
    

    //prompts the user to enter the value of y's point
    public void yInput(double input) { 
        y = input; 
    }    
  
    public double getY() { 
        return y;
    }
    
    public void setY(double y) {
       this.y = y;
        
    }    

    public String toString()
    {
        return this.getTime().toString();
    }

 }