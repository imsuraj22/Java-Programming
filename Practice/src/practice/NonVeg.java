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
class Food
{
    void meal()
    {System.out.println("We consume food for energy");}
    void m1()
    {
        System.out.println("hiii");
    }
}
class Veg extends Food
{
    void meal()
    {System.out.println("Paneer is a vegetarian dish");}
}
public class NonVeg extends Food{
    void meal()
    {System.out.println("Chicken is a non vegetarian dish");}
    public static void main(String[] args) {
//        Food f = new Food();
//        f.meal();
//        Food v = new Veg();
//        v.meal();
        Food n = new NonVeg();
        n.meal();
        n.m1();
    }
}
