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
class Test3 extends Thread
{
    public void run()
    {
        System.out.println("old child thread name : "+Thread.currentThread().getName());
        Thread.currentThread().setName("my_child_thread");
        System.out.println("new child thread name : "+Thread.currentThread().getName());
    }
}
public class SetAndGetName 
{
    public static void main(String[] args)
    {
        System.out.println("old main thread name : "+Thread.currentThread().getName());
        Thread.currentThread().setName("my_main_thread");
        System.out.println("new main thread name : "+Thread.currentThread().getName());
        
        Test3 t3 = new Test3();
        t3.start();
    }
}
