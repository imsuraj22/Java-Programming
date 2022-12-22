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
class BookTrainSeats1
{
    int total_seats=10;
    
     void bookSeats(int seats, String name)
    {
        synchronized (this)
        {
            if(seats<=total_seats)
         {
             System.out.println(name+" booked "+seats+" successfully...!!");
             total_seats=total_seats-seats;
             System.out.println("total seats left :"+total_seats);
         }
         else
         {
             System.err.println(name+" sorry...!booking failed");
             System.err.println("total seats left :"+total_seats);
         } 
        }
        
    }
}
class MyThread1 extends Thread
{
    BookTrainSeats bts;
    int seats;

    public MyThread1(BookTrainSeats bts, int seats)
    {
        this.bts=bts;
        this.seats=seats;
    }
    public void run()
    {
        bts.bookSeats(seats, Thread.currentThread().getName());
    }
    
    
}
public class SynchronizedBlock 
{
    public static void main(String[] args)
    {
        BookTrainSeats bts = new BookTrainSeats();
    
        MyThread1 suraj = new MyThread1(bts, 5);
        suraj.setName("suraj");
        suraj.start();
        
        MyThread1 avya = new MyThread1(bts, 3);
        avya.setName("avya");
        avya.start();
        
        MyThread1 sandya = new MyThread1(bts, 4);
        sandya.setName("sandya");
        sandya.start();  

    }
    
}

