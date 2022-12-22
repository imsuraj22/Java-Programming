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
class Test9 extends Thread
{
    Thread t;
    Test9(Thread t)
    {
        this.t=t;
    }
    public void run()
    {
        try
        {
            t.join();
            for(int i=1; i<=5; i++)
            {
                System.out.println("hi : "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
public class Join1
{
    public static void main(String[] args)
    {
        Thread t=Thread.currentThread();
        
        Test9 mt=new Test9(t);
        mt.start();
        
        try
        {
            for(int i=1; i<=5; i++)
            {
                System.out.println("hello : "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

