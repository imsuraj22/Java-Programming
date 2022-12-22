/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callabledemo;

/**
 *
 * @author suraj
 */
class Thread3 implements Runnable
{
    ThreadLocal tl;

    public Thread3(ThreadLocal tl)
    {
        this.tl=tl;
    }
    
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+" : "+tl.get());
    }
}
public class Test3
{
    public static void main(String[] args)
    {
       ThreadLocal tl = new ThreadLocal();
       tl.set(100);
       
        System.out.println(Thread.currentThread().getName()+" : "+tl.get());
        
        Thread3 t3 = new Thread3(tl);
        Thread t = new Thread(t3);
        t.start();
    }
    
    
}
