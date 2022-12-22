/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callabledemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author suraj
 */
class ThreadTask2 implements Callable
{
    public Object call()
    {
        int a=10, b=20, c;
        c=a+b;
        return c;
    }
}
public class Test1
{
    public static void main(String[] args) throws Exception
    {
        ThreadTask2 tt=new ThreadTask2();
        
        ExecutorService es=Executors.newFixedThreadPool(3);
        Future f=es.submit(tt);
        System.out.println(f.get());
        
        es.shutdown();
    }
}