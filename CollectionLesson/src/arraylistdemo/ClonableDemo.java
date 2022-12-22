/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistdemo;

/**
 *
 * @author suraj
 */
public class ClonableDemo implements Cloneable
{
     int i;
    String str;
    ClonableDemo(){}
    
    ClonableDemo(int i, String str)
    {
        this.i=i;
        this.str=str;
    }
    public static void main(String[] args) throws CloneNotSupportedException
    {
        ClonableDemo t1=new ClonableDemo(10, "deepak");
        
        ClonableDemo t2=(ClonableDemo)t1.clone();
        
        System.out.println(t2.i);
        System.out.println(t2.str);
    }
}
