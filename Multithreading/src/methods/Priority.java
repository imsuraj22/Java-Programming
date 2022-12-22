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
class Test5 extends Thread
{
    public void run()
    {
        System.out.println("hi :"+Thread.currentThread().getName());
        System.out.println("child thread priority :"+Thread.currentThread().getPriority());
    }
}
public class Priority 
{
    public static void main(String[] args)
    {
        Test5 t5 = new Test5();
        t5.start();
        
//        t5.setPriority(8);
//        System.out.println("1 :"+t5.getPriority());
        
        System.out.println("hello :"+Thread.currentThread().getName());
        System.out.println("main thread priority :"+Thread.currentThread().getPriority());
    }
}
