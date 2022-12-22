/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deadlock;

/**
 *
 * @author suraj
 */
import java.util.concurrent.locks.ReentrantLock;
class BookSeats
{
    ReentrantLock rt = new ReentrantLock();
    int total_seats =10;
    
    void bookTicket(int seats, String name)
    {
        rt.lock();
        if(seats<=total_seats)
        {
            System.out.println(name+" "+seats+" seats booked successfully");
            total_seats=total_seats-seats;
            System.out.println("Total seats left :"+total_seats);
        }
        else
        {
            System.err.println(name+" sorry booking failed");
            System.err.println("Total seats left :"+total_seats);
        }
        rt.unlock();
    }
    
}
class Thread1 extends Thread
{
    BookSeats bs;
    int seats;
    String name;

    public Thread1(BookSeats bs, int seats)
    {
        this.bs=bs;
        this.seats=seats;
    }
    
    public void run()
    {
        bs.bookTicket(seats, Thread.currentThread().getName());
    }
    
}
class Thread2 extends Thread
{
    BookSeats bs;
    int seats;
    String name;

    public Thread2(BookSeats bs, int seats)
    {
        this.bs=bs;
        this.seats=seats;
    }
    
    public void run()
    {
        bs.bookTicket(seats, Thread.currentThread().getName());
    }
    
}
public class Test1
{
    public static void main(String[] args)
    {
      BookSeats bs = new BookSeats();
    
    Thread1 t1 = new Thread1(bs, 7);
    t1.setName("Suraj");
    t1.start();
    
    Thread2 t2 = new Thread2(bs, 5);
    t2.setName("Avya");
    t2.start();
    }
   
}
