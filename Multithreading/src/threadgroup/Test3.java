/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadgroup;

/**
 *
 * @author suraj
 */
public class Test3
{
    public static void main(String[] args) 
    {
        ThreadGroup tg = new ThreadGroup("main_sub_thread_group");
        
        Thread t1 = new Thread(tg, "suraj thread");
        Thread t2 = new Thread(tg, "avya thread");
        
        t1.start();
        t2.start();
        
        System.out.println("active thread count :"+tg.activeCount());
        System.out.println("parent active thread count :"+tg.getParent().activeCount());
        
        System.out.println("active thread group count :"+tg.activeGroupCount());
        System.out.println("parent active thread group count"+tg.getParent().activeGroupCount());
        System.out.println("GrandParent active thread gropu count :"+tg.getParent().getParent().activeGroupCount());
        
    }
}
