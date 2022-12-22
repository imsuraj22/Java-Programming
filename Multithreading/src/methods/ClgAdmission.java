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
class TakeAdmisn extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("Admisn starts");
            Thread.sleep(5000);
            System.out.println("You have taken the admisn successfully");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class DepositFee extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("depositing fee");
            Thread.sleep(3000);
            System.out.println("You have deposit the fee successfully");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class TakeRollno extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("Take roll no");
            Thread.sleep(1000);
            System.out.println("Now you can sit in exams....!!");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
public class ClgAdmission
{
    public static void main(String[] args) throws InterruptedException
    {
        TakeAdmisn t1=new TakeAdmisn();
        t1.start();
        
        t1.join();
        
        DepositFee t2=new DepositFee();
        t2.start();
        
        t2.join();
        
        TakeRollno t3=new TakeRollno();
        t3.start();
    }
}
