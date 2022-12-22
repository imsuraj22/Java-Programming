/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments;

import java.util.Scanner;

/**
 *
 * @author suraj
 */
abstract class vehicle 
{
    abstract void move();
}
class Helicopter extends vehicle
{

    @Override
    void move() 
    {
        System.out.println("The helicopter flies in air \n");
    }
}
class Car1 extends vehicle
{

    @Override
    void move()
    {
        System.out.println("The Car runs on the road \n");
    }
    
}
class Train extends vehicle
{

    @Override
    void move()
    {
        System.out.println("The train runs on the track \n");
    }
    
}
public class AbstractEx 
{
    public static void main(String[] args)
    {
        int ch=0;
        Scanner sc= new Scanner(System.in);
        while(true)
        {
            System.out.println("Tell us which kind of vehicle you want...?");
        System.out.println("1: vehicle should fly");
        System.out.println("2: vehicle should run on the road");
        System.out.println("3: vehicle should run on the track");
        System.out.println("Enter your choice");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                Helicopter hl= new Helicopter();
                hl.move();
                break;
            case 2:
                Car1 c= new Car1();
                c.move();
                break;
            case 3:
                Train t = new Train();
                t.move();
                break;
        }
        }
        
    }
}
