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
class Test12 extends Thread
{
    public void run()
    {
        
        System.out.println("Is thread interrupted (1) : "+Thread.interrupted());
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
        System.out.println("Is thread interrupted (2) : "+Thread.interrupted());
    }
}
public class Interrupted 
{
    public static void main(String[] args)
    {
        Test12 t12 = new Test12();
        t12.start();
        
        t12.interrupt();
    }
}

