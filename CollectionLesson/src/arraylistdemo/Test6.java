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
public class Test6 
{
    public static void main(String[] args)
    {
        ArrayList al1=new ArrayList();
        al1.add(10);
        al1.add(20);
        
        ArrayList al2=new ArrayList();
        al2.add(10);
        al2.add(20);
        al2.add("Suraj");
        
        al1.add(al2);
        
        System.out.println(al1.contains(al2));
        
        System.out.println(al1);
    }
}
