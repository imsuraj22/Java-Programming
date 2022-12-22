/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursordemo;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author suraj
 */
public class EnumerationDemo
{
    public static void main(String[] args) 
    {
        Vector v = new Vector();
        
        v.addElement("aaa");
        v.addElement("bbb");
        v.addElement("ccc");
        v.addElement("ddd");
        
        Enumeration e =v.elements();
        
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
        
    }
}
