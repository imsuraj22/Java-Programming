/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author suraj
 */
class Test10 extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1; i<=10; i++)
            {
                System.out.println("hi :"+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
          try
        {
            for(int i=1; i<=10; i++)
            {
                System.out.println("hi :"+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
public class Interrupt 
{
    public static void main(String[] args)
    {
        Test10 t10 = new Test10();
        t10.start();
        
        t10.interrupt();
    }
}
