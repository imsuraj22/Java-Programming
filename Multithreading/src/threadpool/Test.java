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
class MyThread implements Runnable
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
}
public class Test 
{
    public static void main(String[] args) 
    {
       MyThread mt = new MyThread();
       ExecutorService es = Executors.newFixedThreadPool(10);
       es.submit(mt);
       
       es.shutdown();
    
    }
   
}
