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
class Test4 extends Thread
{
    public void run()
    {
        System.out.println("hi");
        System.out.println("child thread : "+Thread.currentThread().isDaemon());
    }
}
public class Daemon 
{
    public static void main(String[] args)
    {
        Test4 t4 = new Test4();
        t4.setDaemon(true);
        t4.start();
        
         System.out.println("main thread : "+Thread.currentThread().isDaemon());
    }
}
