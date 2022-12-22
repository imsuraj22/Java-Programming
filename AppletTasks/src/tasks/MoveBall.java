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
public class MoveBall extends Applet implements Runnable
{

    Thread t;
    int x=50, y=50;
    public void start()
    {
        setSize(800, 600);
        setBackground(Color.yellow);
        
        t=new Thread(this);
        t.start();
    }
    
    public void paint(Graphics g)
    {
        g.fillOval(x, y, 50, 50);
        
    }
    
    public void run()
    {
        while(true)
        {
            try
            {
                Thread.sleep(100);
                x=x+5;
                y=y+5;
                
                if(x==610 && y==610)
                {
                    x=-50;
                    y=-50;
                }
                
                System.out.println("x : "+x);
                System.out.println("y : "+y);
                
                repaint();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
