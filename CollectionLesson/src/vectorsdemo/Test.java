/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorsdemo;

import java.util.Vector;

/**
 *
 * @author suraj
 */
public class Test
{
    public static void main(String[] args) 
    {
        Vector v = new Vector();
        System.out.println(v.capacity());   //10
        
        for(int i=0 ; i<21; i++)
        {
            v.addElement(i);
        }
        System.out.println(v);
        System.out.println(v.capacity());
        
        
    }
}
