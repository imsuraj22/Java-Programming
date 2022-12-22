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
class Test7 extends Thread
{
    public void run()
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println(i+" : "+Thread.currentThread().getName());
        }
    }
}
public class Yield
{
    public static void main(String[] args)
    {
        Test7 t7 = new Test7();
        t7.start();
        
        Thread.yield();
        
         for(int i=1; i<=10; i++)
        {
            System.out.println(i+" : "+Thread.currentThread().getName());
        }
        
    }
}
