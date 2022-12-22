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
class Shape {
  public void area() {
    System.out.println("Calculate area ");
  }
  public void area(double b, double h) {
    System.out.println("Triangle area="+0.5*b*h);
  }
public void area(int r) {
    System.out.println("Circle area = "+3.14*r*r);
  }
public void area(int l, int b) {
    System.out.println("Rectangle area="+l*b);
  }
 
 
}
 
class Main {
  public static void main(String[] args) {
    Shape shape = new Shape();  // Create a Shapes object
     
    shape.area();
    shape.area(6);
    shape.area(7.0,2.4);
    shape.area(8,9);
     
  }
}