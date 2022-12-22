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
public class CarDesign extends Applet
{
    public void start()
    {
        setSize(800, 600);
        setBackground(Color.yellow);
    }
    
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.fillRect(200, 200, 200, 60);
        g.fillRect(150, 260, 300, 60);
        
        g.setColor(Color.black);
        g.fillOval(200, 320, 50, 50);
        g.fillOval(350, 320, 50, 50);
    }
}
