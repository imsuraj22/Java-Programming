/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronization;

/**
 *
 * @author suraj
 */
public class Test
{
    public static void main(String[] args)
    {
        Thread t1=new Thread()
        {
            public void run()
            {
                for(int i=1; i<=10; i++)
                {
                    System.out.println("hi : "+i);
                }
            }
        };
        t1.start();
        
        Thread t2=new Thread()
        {
            public void run()
            {
                for(int i=1; i<=10; i++)
                {
                    System.out.println("hello : "+i);
                }
            }
        };
        t2.start();
    }
}

