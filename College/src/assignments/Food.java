/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments;

/**
 *
 * @author suraj
 */
class Food
{  
  void meal()
  {System.out.println("We consume food for energy");}  
}  
class Veg extends Food
{  
  void meal()
  {System.out.println("Paneer is a vegetarian dish");}  
}
class NonVeg extends Food
{
    void meal()
    {System.out.println("Chicken is a non vegetarian dish");}
    public static void main(String args[])
    {  
    Veg v = new Veg();  
    v.meal();
    NonVeg nv = new NonVeg();
    nv.meal();
    }
   
}  