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
class Thread2 implements Runnable
{
    ThreadLocal tl = new ThreadLocal();
    public void run()
    {
       tl.set("Suraj");
       display();
    }
    void display()
    {
        System.out.println("hi : "+tl.get());
    }
}
public class Test2 
{
    public static void main(String[] args)
    {
        Thread2 t2 = new Thread2();
        
        Thread tt= new Thread(t2);
        tt.start();
    }
}
