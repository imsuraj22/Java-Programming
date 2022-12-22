/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronization;

import jdk.nashorn.internal.objects.NativeString;

/**
 *
 * @author suraj
 */
class TrainBooking
{
    static int total_seats=10;
    static synchronized void bookSeats(int seats, String name)
    {
        if(seats<=total_seats)
        {
            System.out.println(name+" "+seats+" seats booked successfully...!");
            total_seats=total_seats-seats;
            System.out.println("total seats left :"+total_seats);
        }
        else
        {
            System.err.println(name+" sorry seat booking failed....!1");
        }
    }
}
class Mythread1 extends Thread
{
  TrainBooking tb;
  int seats;

    public Mythread1(int seats)
    {
        this.tb=tb;
        this.seats=seats;
    }
    
    public void run()
    {
        tb.bookSeats(seats, Thread.currentThread().getName());
    }
  
}
class Mythread2 extends Thread
{
  TrainBooking tb;
  int seats;

    public Mythread2(int seats)
    {
        this.tb=tb;
        this.seats=seats;
    }
    
    public void run()
    {
        tb.bookSeats(seats, Thread.currentThread().getName());
    }
  
}
public class StaticSynchronization
{
    public static void main(String[] args)
    {
        TrainBooking tb1 = new TrainBooking();
        
        Mythread1 mt1 = new Mythread1(6);
        mt1.setName("suraj");
        mt1.start();
        
        Mythread2 mt2 = new Mythread2(6);
        mt2.setName("avya");
        mt2.start();
        
        TrainBooking tb2 = new TrainBooking();
        
        Mythread1 mt3 = new Mythread1(3);
        mt3.setName("sandya");
        mt3.start();
        
        Mythread2 mt4 = new Mythread2(6);
        mt4.setName("ayush");
        mt4.start();
        
    }
    
}
