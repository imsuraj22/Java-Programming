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
public class InheritanceWithOverloading
{
    static int l, b, radius, length, sq_length;
    void getInputs()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of Rectangle:");
        l = s.nextInt();
        System.out.print("Enter breadth of Rectangle:");
        b = s.nextInt();
        System.out.print("Enter radius of Circle:");
        radius = s.nextInt();
        System.out.print("Enter the length of Square:");
        sq_length = s.nextInt();
        
        
    }
    
    void setArea()
    {
        System.out.println("Find area for triangle, circle and square\n ");
    }
    public static void main(String[] args)
    {
        InheritanceWithOverloading io= new InheritanceWithOverloading();
        io.setArea();
        io.getInputs();
        Triangle t= new Triangle();
        t.setArea(l, b);
        Square s= new Square();
        s.setArea(sq_length);
        Circle c= new Circle();
        c.setArea(radius);
    }
}
class Triangle extends InheritanceWithOverloading
{
    int l, b, area;
   void setArea(int l, int b)
    {
        this.l=l;
        this.b=b;
        area=l*b/2;
        System.out.print("\n The area of Triangle is : "+area);
    } 
}
class Square extends InheritanceWithOverloading
{
    int l, area;
    void setArea(int l)
    {
        this.l=l;
        area=l*l;
        System.out.print("\n The area of Square is : "+area);
    } 
}
class Circle extends InheritanceWithOverloading
{
    int radius;
    double area;
    void setArea(int radius)
    {
        this.radius=radius;
        area=Math.PI*(radius*radius);
        System.out.printf("\n The area of Circle is %.2f\n ",area);
        
    } 
}
