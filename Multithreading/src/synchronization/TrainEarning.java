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
class TicketEarning extends Thread
{
    int total_earning=0;
    int ticket_price=100;
    public void run()
    {
        synchronized(this)
        {
            for(int i=1; i<=10; i++)
            {
                total_earning=total_earning+ticket_price;
            }
            this.notify();
        }
    }
}
public class TrainEarning
{
    public static void main(String[] args) throws Exception
    {
        TicketEarning te=new TicketEarning();
        te.start();
        
        synchronized(te)
        {
            te.wait();
            System.out.println("Total earnings : "+te.total_earning);
        }
    }
}
