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
class Test extends Thread
{
    public void run()
    {
        System.out.println("hi");
        System.out.println("1 :"+Thread.currentThread().getName());
        System.out.println("11 :"+Thread.currentThread().isAlive());
    }
}
public class Alive 
{
    public static void main(String[] args) 
    {
        Test t = new Test();
        t.start();
        System.out.println("2 :"+Thread.currentThread().getName());
        System.out.println("22 :"+t.isAlive());
    }
}
