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
public class Test2
{
    public static void main(String[] args)
    {
        ThreadGroup tg = new ThreadGroup("main_sub_thread_group");
        
        Thread t1 = new Thread(tg, "Suraj Thread");
        Thread t2 = new Thread(tg, "Avya thread");
        
        System.out.println("current thread group name:"+tg.getName());
        System.out.println("parent thread group name :"+tg.getParent().getName());
        
        System.out.println("old priority of thread group :"+tg.getMaxPriority());
        tg.setMaxPriority(7);
        System.out.println("new priority of thread group :"+tg.getMaxPriority());
        
        tg.list();
    }
}
