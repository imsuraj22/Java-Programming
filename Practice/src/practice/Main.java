/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author suraj
 */
class Vehicle
{
    void wheels()
    {
        System.out.println("vehicle have wheels");
    }
}
class Car extends Vehicle
{
    void wheels()
    {
        System.out.println("Car have 4 wheels");
    }
}
class Bike extends Vehicle
{
    void wheels()
    {
        System.out.println("Bike have 2 wheels");
    }
}
class Autorickshaw extends Vehicle
{
    void wheels()
    {
        System.out.println("Autorickshaw have 3 wheels"); 
   }
    void newm()
    {
        System.out.println("new method");
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
//        Vehicle c = new Car();
//        Vehicle b = new Bike();
//        Vehicle a = new Autorickshaw();
        Car c = new Car();
        Bike b = new Bike();
        Vehicle a = new Autorickshaw();
//        v.wheels();
//        c.wheels();
//        b.wheels();
        a.wheels();
        //a.newm();
    }
}
