/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author suraj
 */
public class MoveCar extends Applet implements Runnable
{
    Thread t;
    int car_top_x=200, car_top_y=200;
    int car_btm_x=150, car_btm_y=260;
    
    int car_tyre1_x=200, car_tyre1_y=320;
    int car_tyre2_x=350, car_tyre2_y=320;
    public void start()
    {
        setSize(800, 600);
        setBackground(Color.yellow);
        
        t=new Thread(this);
        t.start();
    }
    
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.fillRect(car_top_x, car_top_y, 200, 60);
        g.fillRect(car_btm_x, car_btm_y, 300, 60);
        
        g.setColor(Color.black);
        g.fillOval(car_tyre1_x, car_tyre1_y, 50, 50);
        g.fillOval(car_tyre2_x, car_tyre2_y, 50, 50);
    }
    
    public void run()
    {
        while(true)
        {
            try
            {
                Thread.sleep(100);
                
                car_top_x=car_top_x+5;
                
                car_btm_x=car_btm_x+5;
               
                car_tyre1_x=car_tyre1_x+5;
                
                car_tyre2_x=car_tyre2_x+5;
                
                if(car_btm_x==830)
                {
                    car_btm_x=-350;
                    car_top_x=-300;
                    car_tyre1_x=-300;
                    car_tyre2_x=-150;
                }
               
                repaint();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
