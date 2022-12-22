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
class Test6 extends Thread
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
public class Sleep 
{
    public static void main(String[] args)
    {
        Test6 t6 = new Test6();
        t6.start();
        
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
