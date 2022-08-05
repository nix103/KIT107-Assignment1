/**
 * Class for Time
 * ADT implementation for KIT107 Assignment 1
 * @author Julian Dermoudy, Nicolyn Kwok, Nicole Lawrence
 * @version <<DATE>>
 */

import java.text.DecimalFormat;

public class Time implements TimeInterface
{
    private static final DecimalFormat FMT=new DecimalFormat("00");
    
    private int hour;
    private int minute;
    private int second;
    
    /**
     * Constructor -- midnight
     * @author Julian Dermoudy
     */
    public Time()
    { 
        setTime(0, 0, 0); 
    }
    
    /**
     * Constructor -- to given time
     * @param h new value for hour
     * @param m new value for minute
     * @param s new value for seconds <- ? or just 0
     * @author Julian Dermoudy
     */
    public Time(int h, int m, int s)
    { 
        setTime(h, m, s); 
    }
    
    /**
     * Alter hour, minute, and second
     * @param h new value for hour
     * @param m new value for minute
     * @param s new value for second
     * @author Julian Dermoudy
     */
    public void setTime(int h, int m, int s)
    {
        hour = h; 
        minute = m; 
        second = s;

    }
    
    /**
     * Find printable form of time
     * @return String form of time for printing etc.
     * @author Julian Dermoudy
     */
    public String toString()
    { 
        String r;
        
        if (hour >= 12) {
            if (hour == 12)
            {
                r="12";
            }
            else
            {
                r=FMT.format(hour-12);
            }
            r=r+":"+FMT.format(minute)+":"+FMT.format(second)+" PM";
        }
        else {
            if (hour == 0)
            {
                r="12";
            }
            else
            {
                r=FMT.format(hour);
            }
            r=r+":"+FMT.format(minute)+":"+FMT.format(second)+" AM";
        }
        return r;
    }
    
    /**
     * Find printable form of time in 24 hour mode
     * @return String form of time in 24 hour mode for printing etc.
     * @author Julian Dermoudy
     */
    public String toMilitaryString()
    { 
        return FMT.format(hour)+ ":"+FMT.format(minute)+ ":" + FMT.format(second);
    }
    
    /**
     * Determine whether two Time values are equal
     * @param that second Time value
     * @return boolean true if times are equal, false otherwise
     * @author Julian Dermoudy
     */
    public boolean equals(Time that)
    {
        return ((this.hour == that.hour) && (this.minute == that.minute) && (this.second == that.second));
    }
 
    public void addSeconds(int secondsToAdd) { 
       
        int h = hour;
        int m = minute;
        int s = second;

        int tot = s + secondsToAdd;

        int newSeconds = tot;
        
       
        if (tot >= 60)
        {
            m = minute + 1;

            if(tot-60 > 60)
            {
                s = (tot-60)- 60;
            }
            else 
            {
                s = tot-60;
            }
            
        }
        if (m >= 60) 
        {
            minute = 0;            
            h = h + (int)(m / 60);
            m = m % 60;
        }
        
        setTime(h, m, s);
    }

 }
