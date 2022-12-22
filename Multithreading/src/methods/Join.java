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
class Test8 extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1; i<=10; i++)
            {
                System.out.println(i+" : "+Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
public class Join 
{
    public static void main(String[] args)
    {
        Test8 t8 = new Test8();
        t8.start();
        
        try
        {
               t8.join();  // this line will be exeucted by main thread, thus main thread will wait for another thread (Thread-0 - t8) to complete its task
            for(int i=1; i<=10; i++)
            {
                System.out.println(i+" : "+Thread.currentThread().getName());
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
