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
public class Test3 
{
    public static void main(String[] args)
    {
        Vector v = new Vector();
        System.out.println(v.capacity());
        
        for(int i=0; i<10; i++)
        {
            v.addElement(i);
        }
        System.out.println(v.firstElement());   //0
        System.out.println(v.lastElement());    //9
        System.out.println(v.removeElement(5));     // true
        v.removeAllElements();
        System.out.println(v);
    }
}
