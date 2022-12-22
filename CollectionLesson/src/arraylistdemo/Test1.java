/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistdemo;

import java.util.ArrayList;

/**
 *
 * @author suraj
 */
public class Test1 
{
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList(); // capacity = 10 and size =0
        
        al.add(0,10);
        al.add(1,20);
        al.add("suraj");
        al.add(12.42);
        al.add(3,100);
        
        System.out.println(al);
        
        
    }
}
