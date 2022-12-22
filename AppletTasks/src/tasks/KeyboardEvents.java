/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author suraj
 */
public class KeyboardEvents extends Applet implements KeyListener
{
    int x=100, y=100;
    public void start()
    {
        setSize(800, 800);
        setBackground(Color.yellow);
        
        addKeyListener(this);
    }
    
    public void paint(Graphics g)
    {
        g.fillOval(x, y, 50, 50);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode()==KeyEvent.VK_LEFT)
        {
            x=x-5;
            repaint();
        }
        if(e.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            x=x+5;
            repaint();
        }
        if(e.getKeyCode()==KeyEvent.VK_UP)
        {
            y=y-5;
            repaint();
        }
        if(e.getKeyCode()==KeyEvent.VK_DOWN)
        {
            y=y+5;
            repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
