/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

/**
 *
 * @author suraj
 */
public class Game extends Applet implements Runnable, KeyListener
{
    Thread t;
    
    Image mycar_img, obs_car1, obs_car2, obs_car3;
    
    int strip1_x=575, strip1_y=100;
    int strip2_x=575, strip2_y=400;
    int strip3_x=575, strip3_y=700;
    int strip4_x=575, strip4_y=1000;
    
    int mycar_x=700, mycar_y=800;
    int obscar1_x, obscar1_y=-100;
    int obscar2_x, obscar2_y=-600;
    
    int score=0;
    
    String go="";
    
    public void start()
    {
        setSize(1200,900);
        setBackground(Color.green);
        
        mycar_img=getImage(getDocumentBase(), "bugatti car.png");
        obs_car1=getImage(getDocumentBase(), "car red.png");
        obs_car2=getImage(getDocumentBase(), "car white.png");
        
        t=new Thread(this);
        t.start();
        
        addKeyListener(this);
        
        obscar1_x=getRandomNo(300, 700);
        obscar2_x=getRandomNo(300, 700);
    }
    public void paint(Graphics g)
    {
        g.fillRect(300, 0, 600, 900);
        
        g.setColor(Color.white);
        g.fillRect(strip1_x, strip1_y, 50, 200);
        g.fillRect(strip2_x, strip2_y, 50, 200);
        g.fillRect(strip3_x, strip3_y, 50, 200);
        g.fillRect(strip4_x, strip4_y, 50, 200);
        
        g.drawImage(mycar_img, mycar_x, mycar_y, this);
        
        g.drawImage(obs_car1, obscar1_x, obscar1_y, this);
        g.drawImage(obs_car2, obscar2_x, obscar2_y, this);
        
        g.setColor(Color.red);
        g.setFont(new Font("Arial", Font.PLAIN, 20));
        g.drawString("Score : "+score, 1000, 50);
        
        g.setFont(new Font("Algerian", Font.BOLD, 100));
        g.drawString(go, 300, 500);
    }
    
    public void run()
    {
        try
        {
            while(true)
            {
                if(score<=2)
                {
                    gameLogic();
                    Thread.sleep(40);
                }
                else if(score<=4)
                {
                    gameLogic();
                    Thread.sleep(20);
                }
                else if(score<=6)
                {
                    gameLogic();
                    Thread.sleep(10);
                }
                else
                {
                    gameLogic();
                    Thread.sleep(5);
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) { }

    @Override
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            if(go.equals("Game Over"))
            {
                
            }
            else if(mycar_x!=845)
            {
                mycar_x=mycar_x+5;
            }
            repaint();
        }
        if(e.getKeyCode()==KeyEvent.VK_LEFT)
        {
            if(go.equals("Game Over"))
            {
                
            }
            else if(mycar_x!=300)
            {
                mycar_x=mycar_x-5;
            }
            
            repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) { }
    
    int getRandomNo(int low, int high)
    {
        Random r=new Random();
        int result = r.nextInt(high-low) + low;
        
        return result;
    }
    
    void gameLogic()
    {
        if(strip4_y==1000)
        {
            strip4_y=-200;
        }
        else if(strip3_y==1000)
        {
            strip3_y=-200;
        }
        else if(strip2_y==1000)
        {
            strip2_y=-200;
        }
        else if(strip1_y==1000)
        {
            strip1_y=-200;
        }

        strip1_y=strip1_y+5;
        strip2_y=strip2_y+5;
        strip3_y=strip3_y+5;
        strip4_y=strip4_y+5;

        obscar1_y=obscar1_y+5;
        obscar2_y=obscar2_y+5;

        if(obscar1_y==900)
        {
            obscar1_y=-100;
            obscar1_x=getRandomNo(300, 700);
            score=score+1;
        }
        if(obscar2_y==900)
        {
            obscar2_y=-100;
            obscar2_x=getRandomNo(300, 700);
            score=score+1;
        }

        repaint();

        if((mycar_x + 45 >= obscar1_x && mycar_x <= obscar1_x + 45 && obscar1_y >720) || (mycar_x + 45 >= obscar2_x && mycar_x <= obscar2_x + 45 && obscar2_y >720))
        {
            go="Game Over";
            repaint();
            t.stop();
        }
    }
}
