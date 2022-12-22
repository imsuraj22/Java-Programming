/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author suraj
 */
class Test1 
{
    public void divide()
    {
        int a=100, b=0, c;
        c=a/b;
        System.out.println(c);
    }
}
public class SetName 
{
    public static void main(String[] args)
    {
        
        Thread.currentThread().setName("Suraj");
        Test1 t1 = new Test1();
        t1.divide();
        
    }
}
