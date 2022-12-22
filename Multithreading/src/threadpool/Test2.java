/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author suraj
 */
class MyThread2 implements Runnable
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        try
        {
            Thread.sleep(1000);
            System.out.println("--------------------------"); 
       }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
public class Test2 
{
    public static void main(String[] args)
    {
        MyThread2 mt2 = new MyThread2();
        
        ExecutorService es = Executors.newFixedThreadPool(3);
        
        for(int i=1; i<=10; i++)
        {
          es.submit(mt2);
        }
        
        es.shutdown();
    }
   
    
    
}
