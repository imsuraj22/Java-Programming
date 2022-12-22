/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author suraj
 */
public class DigitalClock extends Applet implements Runnable
{Thread t;
    
    String date="", time="", day="";
    
    public void start()
    {
        setSize(400, 200);
        setBackground(Color.black);
        
        t=new Thread(this);
        t.start();
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.CYAN);
        g.setFont(new Font("Arial", Font.PLAIN, 14));
        g.drawString("Date : "+date, 50, 50);
        
        g.setColor(Color.GREEN);
        g.setFont(new Font("Courier New", Font.BOLD, 40));
        g.drawString(time, 70, 100);
        
        g.setColor(Color.white);
        g.setFont(new Font("Arial", Font.PLAIN, 14));
        g.drawString("Day : "+day, 50, 135);
    }
    
    public void run()
    {
        try
        {
            while(true)
            {
                DateTimeFormatter date_formatter=DateTimeFormatter.ofPattern("dd MMMM, yyyy");
                LocalDate localdate=LocalDate.now();
                date=localdate.format(date_formatter).toString();
                
                DateTimeFormatter time_formatter=DateTimeFormatter.ofPattern("hh:mm:ss a");
                LocalTime localtime=LocalTime.now();
                time=localtime.format(time_formatter).toString();
                
                Calendar calender=Calendar.getInstance();
                Date d=calender.getTime();
                SimpleDateFormat sdf=new SimpleDateFormat("EEEE", Locale.ENGLISH);
                day=sdf.format(d);
                
                repaint();
                
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
