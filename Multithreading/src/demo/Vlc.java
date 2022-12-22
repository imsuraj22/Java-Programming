/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author suraj
 */class Video extends Thread
 {
     @Override
     public void run()
     {
         for(int i=1; i<=100; i++)
         {
             System.out.println("video is playing");
         }
     }
 }
class Sound extends Thread
{
    @Override
    public void run()
    {
       for(int i=1; i<=100; i++)
         {
             System.out.println("sound is executing");
         }
    }
}
public class Vlc
{
    public static void main(String[] args)
    {
        Video v1 = new Video();
        v1.start();
        
        Sound s1= new Sound();
        s1.start();
    }
}
