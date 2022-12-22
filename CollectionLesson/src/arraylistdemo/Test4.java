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
public class Test4 
{
    public static void main(String[] args)
    {
        ArrayList al =new ArrayList();
        
        al.add(10);
        al.add(20);
        al.add(30);
        al.add("suraj");
        al.add("avya");
        al.add(202.22);
        
        System.out.println(al);
        
        al.remove(2);
        
        System.out.println(al);
        
        al.removeAll(al);
        
        System.out.println(al);
    }
}
