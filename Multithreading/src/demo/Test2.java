/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author suraj
 */
class Abc extends Thread
{
    public void run()
    {
       for(int i=1; i<=100; i++)
        {
            System.out.println("Child class"+i);
        }  
    }
}
public class Test2
{
    public static void main(String[] args)
    {
        Abc ob = new Abc();
        ob.start();
        
        for(int i=1; i<=100; i++)
        {
            System.out.println("Main class"+i);
        }
    }
}
