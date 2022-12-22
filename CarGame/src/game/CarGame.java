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
public class CarGame extends Applet implements Runnable, KeyListener
{
    Thread t;
    int score=0;
    String game_over="";
    int strip1_x=575, strip1_y=100;
    int strip2_x=575, strip2_y=400;
    int strip3_x=575, strip3_y=700;
    int strip4_x=575, strip4_y=1000;
    
    int mycar_x=700, mycar_y=740;
    int redcar_x, redcar_y=-200;
    int whitecar_x, whitecar_y=-500;
    int yellowcar_x, yellowcar_y=-800;
    
    Image mycar_img, red_car, white_car, yellow_car;
    public void start()
    {
        setSize(1200, 1000);
        setBackground(Color.green);
        
        mycar_img=getImage(getDocumentBase(),"bugatti car.png");
        
        
        red_car=getImage(getDocumentBase(),"car red.png");
        
        white_car=getImage(getDocumentBase(), "car white.png");
                
        yellow_car=getImage(getDocumentBase(), "car yellow.png");
        
        t=new Thread(this);
        t.start();
        addKeyListener(this);
        
        redcar_x=getRandomNo(300, 800);
        whitecar_x=getRandomNo(300, 800);
        yellowcar_x=getRandomNo(300, 800);
    }
    
    public void paint(Graphics g)
    {
        g.fillRect(300, 0, 600, 1000);
        g.setColor(Color.white);
        
        g.fillRect(strip1_x, strip1_y, 50, 200);
        g.fillRect(strip2_x, strip2_y, 50, 200);
        g.fillRect(strip3_x, strip3_y, 50, 200);
        g.fillRect(strip4_x, strip4_y, 50, 200);
       
        g.drawImage(mycar_img, mycar_x, mycar_y, this);
        g.drawImage(red_car, redcar_x, redcar_y, this);
        g.drawImage(white_car, whitecar_x, whitecar_y, this);
        g.drawImage(yellow_car, yellowcar_x, yellowcar_y, this);
        
        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.BOLD, 25));
        g.drawString("Score : "+score, 1000, 50);
        
        g.setColor(Color.red);
        g.setFont(new Font("Algerian", Font.BOLD, 100));
        g.drawString(game_over, 300, 500);
    }
    
    public void run()
    {
        try
        {
            while(true)
            {
                if(score<=3)
                {
                    gameLogic();
                    Thread.sleep(30);
                }
                else if(score>=3 && score<=6)
                {
                    gameLogic();
                    Thread.sleep(20);
                }
                else
                {
                    gameLogic();
                    Thread.sleep(10);
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            if(game_over.equals("Game Over"))
            {
                
            }
            else if(mycar_x!=800)
            {
              mycar_x=mycar_x+15;  
            }
           repaint();
            
        }
        if(e.getKeyCode()==KeyEvent.VK_LEFT)
        {
             if(game_over.equals("Game Over"))
            {
                
            }
             else if(mycar_x!=370)
            {
                mycar_x=mycar_x-15;
            }
            repaint();
            
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
    public int getRandomNo(int low, int high)
    {
        Random r= new Random();
        int result=r.nextInt(high-low)+low;
        
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

                   redcar_y=redcar_y+5;
                   whitecar_y=whitecar_y+5;
                   yellowcar_y=yellowcar_y+5;

                    if(redcar_y==1000)
                   {
                       redcar_y=-200;
                       redcar_x=getRandomNo(300, 800);
                       score=score+1;
                   }
                   if(whitecar_y==1000)
                   {
                       whitecar_y=-200;
                       whitecar_x=getRandomNo(300, 800);
                       score=score+1;
                   }
                   if(yellowcar_y==1000)
                   {
                       yellowcar_y=-200;
                       yellowcar_x=getRandomNo(300, 800);
                       score=score+1;
                   }

                   repaint();

                   if((mycar_x +85 >=redcar_x && mycar_x <=redcar_x +90 && redcar_y >556) || (mycar_x +80 >=whitecar_x && mycar_x <=whitecar_x +90 && whitecar_y >556) || (mycar_x +75 >=yellowcar_x && mycar_x <=yellowcar_x +76 && yellowcar_y >579))
                   {
                       game_over="Game Over";
                       repaint();
                       t.stop();
                   }
                
    }
}

