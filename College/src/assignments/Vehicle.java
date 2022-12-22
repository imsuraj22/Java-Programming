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
class Vehicle{  
  void wheels() {
    System.out.println("Vehicle have wheels");}  
}  
class Car extends Vehicle{  
  void wheels(){
    System.out.println("Car have 4 wheels");} 
  }
class Bike extends Vehicle{  
  void wheels() {
    System.out.println("Bike have 2 wheels"); } 
}
class AutoRickshaw extends Vehicle{  
  void wheels() {
    System.out.println("Autorickshaw have 3 wheels");} 
}
class main{
  public static void main(String args[]){ 
    Vehicle v = new Vehicle();
    Vehicle c = new Car(); //upcasting  
    Vehicle b = new Bike(); //upcasting  
    Vehicle a = new AutoRickshaw(); //upcasting  
    v.wheels();
    c.wheels();
    b.wheels();
    a.wheels();
   }  
}  
